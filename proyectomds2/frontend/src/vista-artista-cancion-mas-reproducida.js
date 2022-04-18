import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaArtistaCancionMasReproducida extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="top_canciones1">
 <label id="label_top_canciones">Top Canciones reproducidas </label>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="lista_top_canciones"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-artista-cancion-mas-reproducida';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaArtistaCancionMasReproducida.is, VistaArtistaCancionMasReproducida);

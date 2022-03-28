import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaUltimasCancionesReproducidas extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <label>Ultimas canciones reproducidas</label>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-ultimas-canciones-reproducidas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaUltimasCancionesReproducidas.is, VistaUltimasCancionesReproducidas);

import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaBuscadorListasReproduccion extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <label style="width: 100%;" id="titulo_listas_reproduccion">Listas de reproducción con la canción </label>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="lista_reproduccion_buscada"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-buscador-listas-reproduccion';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaBuscadorListasReproduccion.is, VistaBuscadorListasReproduccion);

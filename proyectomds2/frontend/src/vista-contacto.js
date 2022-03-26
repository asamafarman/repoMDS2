import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaContacto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; padding: var(--lumo-space-l);" id="vertical_contacto">
 <vaadin-horizontal-layout id="horizontal_contactar" style="width: 100%; height: 100%; flex-direction: column; align-items: center; justify-content: center;">
  <label id="label_contactar" style="width: 10%;">Contactar:</label>
  <vaadin-button id="button_correoElectronico" style="width: 50%; height: 10%;">
   Correo electrónico
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-contacto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaContacto.is, VistaContacto);

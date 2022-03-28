import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

class VistaContactar extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <label id="l">Contacto correo electrónico</label>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
  <label>Correo electrónico </label>
  <vaadin-text-field style="width: 100%; height: 100%;"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
  <label>Asunto </label>
  <vaadin-text-field style="width: 100%; height: 100%;"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
  <label>Mensaje </label>
  <vaadin-text-area style="width: 100%; height: 100%;"></vaadin-text-area>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: flex-end;">
  <button>Enviar</button>
  <button>Cancelar</button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-contactar';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaContactar.is, VistaContactar);

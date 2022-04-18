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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <label id="label_contactar">Contacto correo electrónico</label>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout">
  <label id="Label_correo">Correo electrónico </label>
  <vaadin-text-field style="width: 100%; height: 100%;" id="text_field_correo"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout1">
  <label id="label_asunto">Asunto </label>
  <vaadin-text-field style="width: 100%; height: 100%;" id="text_field_asunto"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout2">
  <label id="label_mensaje">Mensaje </label>
  <vaadin-text-area style="width: 100%; height: 100%;" id="text_field_mensaje"></vaadin-text-area>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: flex-end;" id="vaadinHorizontalLayout3">
  <button id="boton_enviar">Enviar</button>
  <button id="boton_cancelar">Cancelar</button>
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

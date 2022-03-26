import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaCambiarcontrasena extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; padding: var(--lumo-space-l);" id="vertical_cambiarContrasena">
 <vaadin-horizontal-layout id="horizontal_cambiarContrasena" style="width: 100%; height: 100%; flex-direction: column; justify-content: center; align-items: center;">
  <label id="label_ingresaContrasena" style="width: 25%; flex-shrink: 1; flex-grow: 0;">Ingrese la nueva contraseña</label>
  <vaadin-text-field id="textField_contrasena" style="width: 50%;" required placeholder="Contraseña nueva"></vaadin-text-field>
  <vaadin-text-field id="textField_confirmarContrasena" style="width: 50%;" required placeholder="Confirmar contraseña"></vaadin-text-field>
  <vaadin-horizontal-layout theme="spacing" id="horizontal_buttons1" style="width: 75%; height: 20%;">
   <vaadin-button id="button_cambiarContrasena" style="width: 50%; height: 50%;">
    Cambiar contraseña
   </vaadin-button>
   <vaadin-button id="button_cancelar" style="width: 50%; height: 50%;">
    Cancelar
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-cambiarcontrasena';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCambiarcontrasena.is, VistaCambiarcontrasena);

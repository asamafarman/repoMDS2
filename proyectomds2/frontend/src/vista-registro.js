import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaRegistro extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; padding: var(--lumo-space-l);" id="vaadinVerticalLayout" theme="spacing">
 <label style="width: 100%;">Registrarse con correo electrónico </label>
 <vaadin-horizontal-layout theme="spacing" id="horizontal_registrarse" style="width: 100%; height: 100%; flex-direction: row; justify-content: flex-start; align-items: flex-start;">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
   <vaadin-text-field error-message="Please enter a value" required invalid="" label="*" style="width: 100%; height: 100%;" placeholder="Contraseña"></vaadin-text-field>
   <vaadin-text-field error-message="Please enter a value" required invalid="" label="*" style="width: 100%; height: 100%;" placeholder="Confirmar contraseña"></vaadin-text-field>
   <vaadin-text-field error-message="Please enter a value" required invalid="" label="*" style="width: 100%; height: 100%;" placeholder="Correo electronico"></vaadin-text-field>
   <vaadin-text-field error-message="Please enter a value" required invalid="" label="*" style="width: 100%; height: 100%;" placeholder="Confirmar correo electronico"></vaadin-text-field>
   <vaadin-text-field error-message="Please enter a value" required invalid="" label="Required" style="width: 100%;" placeholder="Nombre perfil"></vaadin-text-field>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: flex-end; height: 100%; width: 100%; justify-content: center;">
   <vaadin-upload style="align-self: center; flex-grow: 0;"></vaadin-upload>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-button style="align-self: center;">
  Registrarse 
 </vaadin-button>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
  <label>¿Ya tienes cuenta?</label>
  <vaadin-button>
   Iniciar Sesión
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-registro';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaRegistro.is, VistaRegistro);

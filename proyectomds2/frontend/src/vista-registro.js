import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

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
 <vaadin-horizontal-layout theme="spacing" id="horizontal_registrarse" style="width: 50%; height: 100%; flex-direction: column;">
  <vaadin-text-field error-message="Please enter a value" required invalid="" label="*" id="textField_correo_electronico" style="width: 100%; height: 100%; flex-shrink: 1;" placeholder="Correo electronico.."></vaadin-text-field>
  <vaadin-text-field error-message="Please enter a value" required invalid="" label="*" id="textField_confirmar_correo" style="width: 100%; height: 100%;" placeholder="Confirma tu correo.."></vaadin-text-field>
  <vaadin-text-field error-message="Please enter a value" required invalid="" label="*" id="textField_contrasena" style="width: 100%; height: 100%;" placeholder="Contraseña.."></vaadin-text-field>
  <vaadin-text-field error-message="Please enter a value" required invalid="" label="*" id="textField_confirmar_contrasena" style="width: 100%; height: 100%;" placeholder="Confirma tu contraseña.."></vaadin-text-field>
  <vaadin-text-field error-message="Please enter a value" required invalid="" label="*" id="textField_nombrePerfil" style="width: 100%; height: 100%;" placeholder="Pon tu nombre de pefil.."></vaadin-text-field>
  <vaadin-button id="label_yaTienesCuenta" style="width: 100%; height: 50%;">
   Registrarte
  </vaadin-button>
  <vaadin-horizontal-layout id="horizontal_iniciarSesion" style="width: 100%; height: 50%;">
   <label id="label_yaTienesCuenta1" style="width: 50%; height: 100%;">¿Ya tienes cuenta?</label>
   <vaadin-button id="button_iniciarSesion" style="width: 50%; height: 100%;">
    Iniciar sesión
   </vaadin-button>
  </vaadin-horizontal-layout>
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

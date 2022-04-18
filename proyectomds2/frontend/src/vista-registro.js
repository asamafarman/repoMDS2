import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
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
 <vaadin-horizontal-layout theme="spacing" id="horizontal_registrarse" style="width: 100%; height: 100%; flex-direction: row; justify-content: flex-start; align-items: flex-start;">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinVerticalLayout1">
   <label style="align-self: center;" id="label">Registrarse con:</label>
   <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="zona_terceros">
    <vaadin-button id="boton_google">
      Google 
    </vaadin-button>
    <vaadin-button id="boton_facebook">
      Facebook 
    </vaadin-button>
    <vaadin-button id="boton_apple">
      Apple ID 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <label style="align-self: center;" id="label1">-o-</label>
   <label style="align-self: center;" id="label2">Registrarse con correo electrónico </label>
   <vaadin-text-field error-message="Please enter a value" required invalid="" label="*" style="width: 100%; height: 100%;" placeholder="Correo electronico" id="text_field_correo"></vaadin-text-field>
   <vaadin-text-field error-message="Please enter a value" required invalid="" label="*" style="width: 100%; height: 100%;" placeholder="Confirmar correo electronico" id="text_field_confirmar_correo1"></vaadin-text-field>
   <vaadin-text-field error-message="Please enter a value" required invalid="" label="*" style="width: 100%; height: 100%;" placeholder="Contraseña" id="text_field_contraseña"></vaadin-text-field>
   <vaadin-text-field error-message="Please enter a value" required invalid="" label="*" style="width: 100%; height: 100%;" placeholder="Confirmar contraseña" id="text_field_confirmar_contraseña"></vaadin-text-field>
   <vaadin-text-field error-message="Please enter a value" required invalid="" label="Required" style="width: 100%;" placeholder="Nombre perfil" id="text_field_usuario"></vaadin-text-field>
   <vaadin-button style="align-self: center;" id="boton_registrarse">
     Registrarte 
   </vaadin-button>
   <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="vaadinHorizontalLayout">
    <label id="label3">¿Ya tienes cuenta?</label>
    <vaadin-button id="boton_iniciar_sesion">
      Iniciar Sesión 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: flex-end; height: 100%; width: 100%; justify-content: center;" id="vaadinVerticalLayout2">
   <label style="align-self: center;" id="label4">Foto de perfil</label>
   <img style="width: 35%; height: 35%; align-self: center;" src="https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png" id="imagen">
   <vaadin-upload style="align-self: center; flex-grow: 0;" id="cargar_imagen"></vaadin-upload>
  </vaadin-vertical-layout>
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

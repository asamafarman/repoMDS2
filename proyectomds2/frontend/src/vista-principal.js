import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaPrincipal extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="verticalLayout_principal">
 <vaadin-horizontal-layout id="horizontal_correoYcontrasena" style="width: 100%; height: 50%; flex-direction: column; justify-content: center;">
  <vaadin-text-field id="textField_correo_electronico" style="width: 50%; height: 20%; align-self: center; flex-grow: 0; flex-shrink: 0;" placeholder="Correo electronico"></vaadin-text-field>
  <vaadin-password-field id="textField_contrasena" style="width: 50%; height: 20%; align-self: center;" placeholder="Contraseña"></vaadin-password-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="horizontal_buttons1" style="width: 100%; height: 20%; flex-direction: row; flex-shrink: 1; justify-content: center; align-items: center;">
  <vaadin-button id="button_iniciar_sesion" style="width: 20%; height: 50%; flex-grow: 0; flex-shrink: 0;">
    Iniciar Sesion 
  </vaadin-button>
  <vaadin-button id="button_olvide_contrasena" style="width: 20%; height: 50%;">
    Olvidé Contraseña 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="horizontal_buttons2" style="width: 100%; height: 20%; align-items: center; flex-direction: row; justify-content: center;">
  <vaadin-button id="button_google" style="width: 20%; height: 50%;">
    Google 
  </vaadin-button>
  <vaadin-button id="button_facebook" style="width: 20%; height: 50%;">
    Facebook 
  </vaadin-button>
  <vaadin-button id="button_apple_id" style="height: 50%; width: 20%;">
    Apple Id 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="horizontal_buttons3" style="width: 100%; height: 30%; flex-direction: row; align-items: center; justify-content: center; flex-shrink: 1;">
  <vaadin-button id="button_registrarse" style="width: 50%; height: 30%; align-self: center;">
    Registrarse 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-principal';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPrincipal.is, VistaPrincipal);

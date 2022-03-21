import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-text-field id="vaadinTextField" style="width: 100%; height: 100%;" placeholder="Correo electronico"></vaadin-text-field>
 <vaadin-text-field id="vaadinTextField1" style="width: 100%; height: 100%;" placeholder="Contraseña"></vaadin-text-field>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%; height: 100%;">
  <vaadin-button id="vaadinButton" style="width: 100%; height: 100%;">
   Iniciar Sesion
  </vaadin-button>
  <vaadin-button id="vaadinButton1" style="width: 100%; height: 100%;">
   Olvidé Contraseña
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%; height: 100%;">
  <vaadin-button id="vaadinButton2" style="width: 100%; height: 100%;">
   Facebook
  </vaadin-button>
  <vaadin-button id="vaadinButton3" style="width: 100%; height: 100%;">
   Google 
  </vaadin-button>
  <vaadin-button id="vaadinButton4" style="height: 100%; width: 100%;">
   Apple Id
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-button id="vaadinButton5" style="width: 100%; height: 100%;">
  Registrarse
 </vaadin-button>
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

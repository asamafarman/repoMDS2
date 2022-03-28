import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaPerfilUsuario extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
  <vaadin-vertical-layout theme="spacing" style="width: 100%;">
   <label style="flex-grow: 1; align-self: center; flex-shrink: 0;">Nickname</label>
   <vaadin-horizontal-layout theme="spacing" style="align-self: center; flex-grow: 1;">
    <button>Cerrar sesion</button>
    <button>Modificar perfil</button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <img style="width: 10%;" src="https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png">
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-perfil-usuario';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPerfilUsuario.is, VistaPerfilUsuario);

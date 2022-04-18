import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaOtroUsuario extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout">
  <label id="nombre_usuario">Usuario</label>
  <img style="width: 10%;" src="https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png" id="imagne_usuario">
  <button id="boton_seguir">Seguir</button>
  <button id="boton_dejar_seguir">Dejar de seguir </button>
 </vaadin-horizontal-layout>
 <label style="width: 100%;" id="label">Lista reproduccion</label>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="lista_reproduccion"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-otro-usuario';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaOtroUsuario.is, VistaOtroUsuario);

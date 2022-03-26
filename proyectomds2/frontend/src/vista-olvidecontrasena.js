import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaOlvidecontrasena extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;" id="verticalLayout_OlvideContrasena">
 <label id="label_ingresaContrasena" style="width: 50%; flex-shrink: 0; align-self: center;">Ingrese correo electrónico para confirmar contraseña</label>
 <vaadin-text-field label="*" placeholder="Correo electrónico" id="textField_correo" style="align-self: center; width: 50%; height: 10%; flex-grow: 0; flex-shrink: 0;" required invalid></vaadin-text-field>
 <vaadin-text-field id="textField_confirmarCorreo" style="align-self: center; width: 50%; height: 10%;" required placeholder="Confirmar correo electrónico" label="*" invalid></vaadin-text-field>
 <vaadin-button id="button_recordarContrasena" style="align-self: center;">
   Recordar contraseña 
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-olvidecontrasena';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaOlvidecontrasena.is, VistaOlvidecontrasena);

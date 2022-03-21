import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaRegistro extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-text-field error-message="Please enter a value" required invalid="" label="*" id="textField_correo_electronico" style="width: 100%; height: 100%;" placeholder="Correo electronico"></vaadin-text-field>
 <vaadin-text-field error-message="Please enter a value" required invalid="" label="*" id="textField_confirmar_correo" style="width: 100%; height: 100%;" placeholder="Confirmar correo electronico"></vaadin-text-field>
 <vaadin-text-field error-message="Please enter a value" required invalid="" label="*" id="textField_contrasena" style="width: 100%; height: 100%;" placeholder="Contraseña"></vaadin-text-field>
 <vaadin-text-field error-message="Please enter a value" required invalid="" label="*" id="textField_confirmar_contrasena" style="width: 100%; height: 100%;" placeholder="Confirmar contraseña"></vaadin-text-field>
 <vaadin-text-field error-message="Please enter a value" required invalid="" label="*" id="textField_nick" style="width: 100%; height: 100%;" placeholder="Nick de usuario"></vaadin-text-field>
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

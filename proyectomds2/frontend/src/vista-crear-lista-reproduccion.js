import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaCrearListaReproduccion extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-text-field label="Titulo lista reproduccion" placeholder="Placeholder" style="width: 90%;" id="text_field_lista_reproduccion"></vaadin-text-field>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout">
  <vaadin-text-field label="Cancion" placeholder="Placeholder" style="width: 100%;" id="text_field_cancion"></vaadin-text-field>
  <vaadin-button style="width: 10%; align-self: flex-end;" id="vaadinButton" dir="boton_buscar">
    Buscar 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <label id="label">Lista de reproduccion</label>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="lista_reproduccion"></vaadin-vertical-layout>
 <vaadin-button style="align-self: flex-end;" id="boton_finalizar">
   Finalizar 
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-crear-lista-reproduccion';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCrearListaReproduccion.is, VistaCrearListaReproduccion);

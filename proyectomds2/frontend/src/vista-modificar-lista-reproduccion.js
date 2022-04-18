import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaModificarListaReproduccion extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <label id="label">Modificar lista reproduccion</label>
 <label id="titulo_lista">titulo </label>
 <label id="label1">Canciones</label>
 <vaadin-vertical-layout style="width: 100%; height: 100%;" id="lista_reproducion"></vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout">
  <vaadin-text-field label="Buscar cancion" placeholder="Placeholder" id="buscarCancion"></vaadin-text-field>
  <vaadin-button style="align-self: flex-end;" id="boton_buscar">
    Buscar 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-modificar-lista-reproduccion';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaModificarListaReproduccion.is, VistaModificarListaReproduccion);

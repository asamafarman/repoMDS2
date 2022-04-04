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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <label>Modificar lista reproduccion</label>
 <label>Label</label>
 <label>Canciones</label>
 <vaadin-vertical-layout style="width: 100%; height: 100%;"></vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-text-field label="Buscar cancion" placeholder="Placeholder"></vaadin-text-field>
  <vaadin-button style="align-self: flex-end;">
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

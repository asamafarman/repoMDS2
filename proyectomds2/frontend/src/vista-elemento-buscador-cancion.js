import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaElementoBuscadorCancion extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-button style="width: 100%;" dir="cancion">
   Button 
 </vaadin-button>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
  <label style="width: 100%; height: 100%;" id="autor_cancion">autor</label>
  <label style="width: 100%; height: 100%;" id="duracion">duracion </label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-elemento-buscador-cancion';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaElementoBuscadorCancion.is, VistaElementoBuscadorCancion);

import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaRecomendacionesApp extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <label style="align-self: center;">Recomendaciones app</label>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
   <label>Artistas favoritos</label>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;"></vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
   <label>Canciones</label>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;"></vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
   <label>Album</label>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;"></vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
   <label>Canciones usuarios que sigues</label>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;"></vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-recomendaciones-app';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaRecomendacionesApp.is, VistaRecomendacionesApp);

import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaUsuarioArtista extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: flex-end; flex-shrink: 0; align-items: center; justify-content: flex-start;" id="vaadinHorizontalLayout">
   <label style="align-self: center;" id="nombre_artista">Artista</label>
   <img style="width: 10%;" src="https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png" id="imagen_artista">
   <vaadin-button style="align-self: center;" id="boton_seguir">
     Seguir 
   </vaadin-button>
   <vaadin-button style="align-self: center;" id="boton_dejar_seguir">
     Dejar de seguir 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout1">
   <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 100%;" id="vaadinVerticalLayout2">
    <label style="width: 100%;" id="label">Lista de Albums</label>
    <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="lista_albums"></vaadin-vertical-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinVerticalLayout3">
    <label style="width: 100%;" id="label1">Seccion de Noticias</label>
    <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="lista_noticias"></vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-usuario-artista';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaUsuarioArtista.is, VistaUsuarioArtista);

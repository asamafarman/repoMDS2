import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaListasDondeAparece extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <label id="lablel_lista_donde_aparece">Lista de reproducción donde aparece alguna canción</label>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="listas_donde_aparece"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-listas-donde-aparece';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaListasDondeAparece.is, VistaListasDondeAparece);

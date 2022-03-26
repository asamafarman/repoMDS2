import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaUltimosExitos extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;" id="Vertical_ultimosExitos">
 <label id="label_ultimosExitos" style="width: 100%; height: 100%;">Últimos éxitos</label>
</vaadin-vertical-layout>
<img id="img_album" style="width: 100%; height: 50%;">
`;
    }

    static get is() {
        return 'vista-ultimos-exitos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaUltimosExitos.is, VistaUltimosExitos);

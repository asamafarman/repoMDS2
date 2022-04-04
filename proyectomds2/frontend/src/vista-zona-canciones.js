import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaZonaCanciones extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <label>Ultimas canciones reproducidas</label>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;"></vaadin-horizontal-layout>
 <label>Canciones favoritas</label>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;"></vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-zona-canciones';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaZonaCanciones.is, VistaZonaCanciones);

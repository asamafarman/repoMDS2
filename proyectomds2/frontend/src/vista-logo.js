import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaLogo extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; padding: var(--lumo-space-l);" id="vertical_logo">
 <img id="img_logo" style="width: 20%; height: 30%; flex-shrink: 0; align-self: flex-start;" src="https://play-lh.googleusercontent.com/7N4p6FtJ1jsI4vSEYY40HhHcYXTQKV5nEXyle5AMj_FMxU-UqsN_dxFL80kpM81WCQ">
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-logo';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaLogo.is, VistaLogo);

import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-olvidecontrasena`
 *
 * VistaOlvidecontrasena element.
 *
 * @customElement
 * @polymer
 */
class VistaOlvidecontrasena extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-olvidecontrasena';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaOlvidecontrasena.is, VistaOlvidecontrasena);
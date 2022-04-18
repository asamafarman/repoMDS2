package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-lista-albums-artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-albums-artista")
@JsModule("./src/vista-lista-albums-artista.js")
public class VistaElementoListaAlbumsArtista extends PolymerTemplate<VistaElementoListaAlbumsArtista.VistaListaAlbumsArtistaModel> {

    /**
     * Creates a new VistaListaAlbumsArtista.
     */
    public VistaElementoListaAlbumsArtista() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaListaAlbumsArtista and vista-lista-albums-artista
     */
    public interface VistaListaAlbumsArtistaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

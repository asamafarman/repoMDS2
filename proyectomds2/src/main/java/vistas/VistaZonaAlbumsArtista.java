package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-zona-albums-artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-zona-albums-artista")
@JsModule("./src/vista-zona-albums-artista.js")
public class VistaZonaAlbumsArtista extends PolymerTemplate<VistaZonaAlbumsArtista.VistaZonaAlbumsArtistaModel> {

    /**
     * Creates a new VistaZonaAlbumsArtista.
     */
    public VistaZonaAlbumsArtista() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaZonaAlbumsArtista and vista-zona-albums-artista
     */
    public interface VistaZonaAlbumsArtistaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-zona-noticias-artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-zona-noticias-artista")
@JsModule("./src/vista-zona-noticias-artista.js")
public class VistaZonaNoticiasArtista extends PolymerTemplate<VistaZonaNoticiasArtista.VistaZonaNoticiasArtistaModel> {

    /**
     * Creates a new VistaZonaNoticiasArtista.
     */
    public VistaZonaNoticiasArtista() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaZonaNoticiasArtista and vista-zona-noticias-artista
     */
    public interface VistaZonaNoticiasArtistaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

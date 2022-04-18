package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-seccion-noticias-artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-seccion-noticias-artista")
@JsModule("./src/vista-seccion-noticias-artista.js")
public class VistaSeccionNoticiasArtista extends PolymerTemplate<VistaSeccionNoticiasArtista.VistaSeccionNoticiasArtistaModel> {

    /**
     * Creates a new VistaSeccionNoticiasArtista.
     */
    public VistaSeccionNoticiasArtista() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaSeccionNoticiasArtista and vista-seccion-noticias-artista
     */
    public interface VistaSeccionNoticiasArtistaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

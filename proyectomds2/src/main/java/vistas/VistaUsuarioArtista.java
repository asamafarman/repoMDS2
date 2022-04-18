package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-usuario-artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-usuario-artista")
@JsModule("./src/vista-usuario-artista.js")
public class VistaUsuarioArtista extends PolymerTemplate<VistaUsuarioArtista.VistaUsuarioArtistaModel> {

    /**
     * Creates a new VistaUsuarioArtista.
     */
    public VistaUsuarioArtista() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaUsuarioArtista and vista-usuario-artista
     */
    public interface VistaUsuarioArtistaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

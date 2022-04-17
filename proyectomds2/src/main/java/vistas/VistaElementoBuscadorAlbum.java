package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-elemento-buscador-album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-elemento-buscador-album")
@JsModule("./src/vista-elemento-buscador-album.js")
public class VistaElementoBuscadorAlbum extends PolymerTemplate<VistaElementoBuscadorAlbum.VistaElementoBuscadorAlbumModel> {

    /**
     * Creates a new VistaElementoBuscadorAlbum.
     */
    public VistaElementoBuscadorAlbum() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaElementoBuscadorAlbum and vista-elemento-buscador-album
     */
    public interface VistaElementoBuscadorAlbumModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

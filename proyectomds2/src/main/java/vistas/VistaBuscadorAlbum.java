package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-buscador-album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscador-album")
@JsModule("./src/vista-buscador-album.js")
public class VistaBuscadorAlbum extends PolymerTemplate<VistaBuscadorAlbum.VistaBuscadorAlbumModel> {

    /**
     * Creates a new VistaBuscadorAlbum.
     */
    public VistaBuscadorAlbum() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaBuscadorAlbum and vista-buscador-album
     */
    public interface VistaBuscadorAlbumModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

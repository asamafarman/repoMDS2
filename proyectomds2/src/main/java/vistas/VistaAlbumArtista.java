package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-album-artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-album-artista")
@JsModule("./src/vista-album-artista.js")
public class VistaAlbumArtista extends PolymerTemplate<VistaAlbumArtista.VistaAlbumArtistaModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("nombre_album")
	private Label nombre_album;
	@Id("albums_artista")
	private Element albums_artista;

	/**
     * Creates a new VistaAlbumArtista.
     */
    public VistaAlbumArtista() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAlbumArtista and vista-album-artista
     */
    public interface VistaAlbumArtistaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

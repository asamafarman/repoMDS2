package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-elemento-buscador-album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-elemento-buscador-album")
@JsModule("./src/vista-elemento-buscador-album.js")
public class VistaElementoBuscadorAlbum extends PolymerTemplate<VistaElementoBuscadorAlbum.VistaElementoBuscadorAlbumModel> {

    @Id("vaadinButton")
	private Button vaadinButton;
	@Id("autor_album")
	private Label autor_album;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

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

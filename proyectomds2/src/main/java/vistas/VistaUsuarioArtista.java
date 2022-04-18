package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-usuario-artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-usuario-artista")
@JsModule("./src/vista-usuario-artista.js")
public class VistaUsuarioArtista extends PolymerTemplate<VistaUsuarioArtista.VistaUsuarioArtistaModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("imagen_artista")
	private Image imagen_artista;
	@Id("nombre_artista")
	private Label nombre_artista;
	@Id("boton_seguir")
	private Button boton_seguir;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("boton_dejar_seguir")
	private Button boton_dejar_seguir;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("label")
	private Label label;
	@Id("lista_albums")
	private Element lista_albums;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("label1")
	private Label label1;
	@Id("lista_noticias")
	private Element lista_noticias;

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

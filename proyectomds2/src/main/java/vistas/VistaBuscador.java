package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-buscador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscador")
@JsModule("./src/vista-buscador.js")
public class VistaBuscador extends PolymerTemplate<VistaBuscador.VistaBuscadorModel> {

    @Id("zona_buscador")
	private Element zona_buscador;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("canciones_buscadas")
	private Element canciones_buscadas;
	@Id("album_buscado")
	private Element album_buscado;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("artista_buscado")
	private Element artista_buscado;
	@Id("lisca_cancion_buscada")
	private Element lisca_cancion_buscada;

	/**
     * Creates a new VistaBuscador.
     */
    public VistaBuscador() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaBuscador and vista-buscador
     */
    public interface VistaBuscadorModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

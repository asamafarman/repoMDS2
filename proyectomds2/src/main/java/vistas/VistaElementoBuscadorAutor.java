package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-elemento-buscador-autor template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-elemento-buscador-autor")
@JsModule("./src/vista-elemento-buscador-autor.js")
public class VistaElementoBuscadorAutor extends PolymerTemplate<VistaElementoBuscadorAutor.VistaElementoBuscadorAutorModel> {

    @Id("cancion_autor")
	private NativeButton cancion_autor;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("nombre_cancion")
	private Label nombre_cancion;
	@Id("duracion")
	private Label duracion;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaElementoBuscadorAutor.
     */
    public VistaElementoBuscadorAutor() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaElementoBuscadorAutor and vista-elemento-buscador-autor
     */
    public interface VistaElementoBuscadorAutorModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

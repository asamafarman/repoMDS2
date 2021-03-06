package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-buscador-autor template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscador-autor")
@JsModule("./src/vista-buscador-autor.js")
public class VistaBuscadorAutor extends PolymerTemplate<VistaBuscadorAutor.VistaBuscadorAutorModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("titulo_autor")
	private Label titulo_autor;
	@Id("lista_autores")
	private Element lista_autores;

	/**
     * Creates a new VistaBuscadorAutor.
     */
    public VistaBuscadorAutor() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaBuscadorAutor and vista-buscador-autor
     */
    public interface VistaBuscadorAutorModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

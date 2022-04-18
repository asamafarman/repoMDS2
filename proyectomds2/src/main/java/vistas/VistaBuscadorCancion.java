package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-buscador-cancion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscador-cancion")
@JsModule("./vista-buscador-cancion.js")
public class VistaBuscadorCancion extends PolymerTemplate<VistaBuscadorCancion.VistaBuscadorCancionModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("titulo_cancion")
	private Label titulo_cancion;
	@Id("lista_canciones")
	private Element lista_canciones;

	/**
     * Creates a new VistaBuscadorCancion.
     */
    public VistaBuscadorCancion() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaBuscadorCancion and vista-buscador-cancion
     */
    public interface VistaBuscadorCancionModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

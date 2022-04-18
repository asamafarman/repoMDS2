package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-elemento-cancion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-elemento-cancion")
@JsModule("./src/vista-elemento-cancion.js")
public class VistaElementoCancion extends PolymerTemplate<VistaElementoCancion.VistaElementoCancionModel> {

    @Id("titulo_cancion")
	private Label titulo_cancion;
	@Id("boton_eliminar")
	private Button boton_eliminar;
	@Id("boton_anadir")
	private Button boton_anadir;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaElementoCancion.
     */
    public VistaElementoCancion() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaElementoCancion and vista-elemento-cancion
     */
    public interface VistaElementoCancionModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

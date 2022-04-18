package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-modificar-lista-reproduccion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-modificar-lista-reproduccion")
@JsModule("./src/vista-modificar-lista-reproduccion.js")
public class VistaModificarListaReproduccion extends PolymerTemplate<VistaModificarListaReproduccion.VistaModificarListaReproduccionModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("label")
	private Label label;
	@Id("titulo_lista")
	private Label titulo_lista;
	@Id("label1")
	private Label label1;
	@Id("lista_reproducion")
	private Element lista_reproducion;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("boton_buscar")
	private Button boton_buscar;

	/**
     * Creates a new VistaModificarListaReproduccion.
     */
    public VistaModificarListaReproduccion() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaModificarListaReproduccion and vista-modificar-lista-reproduccion
     */
    public interface VistaModificarListaReproduccionModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

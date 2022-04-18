package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-crear-lista-reproduccion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-crear-lista-reproduccion")
@JsModule("./src/vista-crear-lista-reproduccion.js")
public class VistaCrearListaReproduccion extends PolymerTemplate<VistaCrearListaReproduccion.VistaCrearListaReproduccionModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("text_field_lista_reproduccion")
	private TextField text_field_lista_reproduccion;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("text_field_cancion")
	private TextField text_field_cancion;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("label")
	private Label label;
	@Id("lista_reproduccion")
	private Element lista_reproduccion;
	@Id("boton_finalizar")
	private Button boton_finalizar;

	/**
     * Creates a new VistaCrearListaReproduccion.
     */
    public VistaCrearListaReproduccion() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCrearListaReproduccion and vista-crear-lista-reproduccion
     */
    public interface VistaCrearListaReproduccionModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

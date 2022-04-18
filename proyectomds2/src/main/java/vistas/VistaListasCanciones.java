package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-listas-canciones template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listas-canciones")
@JsModule("./src/vista-listas-canciones.js")
public class VistaListasCanciones extends PolymerTemplate<VistaListasCanciones.VistaListasCancionesModel> {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("label_lista")
	private Label label_lista;
	@Id("boton_crear")
	private Button boton_crear;
	@Id("lista_reproduccion")
	private Element lista_reproduccion;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaListasCanciones.
     */
    public VistaListasCanciones() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaListasCanciones and vista-listas-canciones
     */
    public interface VistaListasCancionesModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

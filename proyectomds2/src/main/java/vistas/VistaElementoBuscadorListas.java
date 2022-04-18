package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-elemento-buscador-listas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-elemento-buscador-listas")
@JsModule("./src/vista-elemento-buscador-listas.js")
public class VistaElementoBuscadorListas extends PolymerTemplate<VistaElementoBuscadorListas.VistaElementoBuscadorListasModel> {

    @Id("nombre_usuario1")
	private NativeButton nombre_usuario1;
	@Id("label_usuario")
	private Label label_usuario;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaElementoBuscadorListas.
     */
    public VistaElementoBuscadorListas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaElementoBuscadorListas and vista-elemento-buscador-listas
     */
    public interface VistaElementoBuscadorListasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

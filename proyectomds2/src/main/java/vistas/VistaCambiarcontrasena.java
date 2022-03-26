package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-cambiarcontrasena template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cambiarcontrasena")
@JsModule("./src/vista-cambiarcontrasena.js")
public class VistaCambiarcontrasena extends PolymerTemplate<VistaCambiarcontrasena.VistaCambiarcontrasenaModel> {

	@Id("horizontal_cambiarContrasena")
	private HorizontalLayout horizontal_cambiarContrasena;
	@Id("label_ingresaContrasena")
	private Label label_ingresaContrasena;
	@Id("textField_contrasena")
	private TextField textField_contrasena;
	@Id("textField_confirmarContrasena")
	private TextField textField_confirmarContrasena;
	@Id("horizontal_buttons1")
	private HorizontalLayout horizontal_buttons1;
	@Id("button_cambiarContrasena")
	private Button button_cambiarContrasena;
	@Id("button_cancelar")
	private Button button_cancelar;

	/**
     * Creates a new VistaCambiarcontrasena.
     */
    public VistaCambiarcontrasena() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCambiarcontrasena and vista-cambiarcontrasena
     */
    public interface VistaCambiarcontrasenaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

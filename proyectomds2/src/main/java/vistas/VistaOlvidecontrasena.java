package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-olvidecontrasena template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-olvidecontrasena")
@JsModule("./src/vista-olvidecontrasena.js")
public class VistaOlvidecontrasena extends PolymerTemplate<VistaOlvidecontrasena.VistaOlvidecontrasenaModel> {

    @Id("ingreseCorreoElectrónicoParaConfirmarContraseña")
	private TextField ingreseCorreoElectrónicoParaConfirmarContraseña;
	@Id("label")
	private Label label;
	@Id("_")
	private TextField __;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("labelIngresaContrasena")
	private Label labelIngresaContrasena;
	@Id("textFieldCorreo")
	private TextField textFieldCorreo;
	@Id("textFieldConfirmarCorreo")
	private TextField textFieldConfirmarCorreo;
	@Id("buttonRecordarContrasena")
	private Button buttonRecordarContrasena;
	@Id("label_ingresa_contrasena")
	private Label label_ingresa_contrasena;
	@Id("text_field_correo")
	private TextField text_field_correo;
	@Id("text_field_confirmar_correo")
	private TextField text_field_confirmar_correo;
	@Id("button_recordar_contrasena")
	private Button button_recordar_contrasena;
	@Id("verticalLayout_OlvideContrasena")
	private Element verticalLayout_OlvideContrasena;
	@Id("label_ingresaContrasena")
	private Label label_ingresaContrasena;
	@Id("textField_correo")
	private TextField textField_correo;
	@Id("textField_confirmarCorreo")
	private TextField textField_confirmarCorreo;
	@Id("button_recordarContrasena")
	private Button button_recordarContrasena;

	/**
     * Creates a new VistaOlvidecontrasena.
     */
    public VistaOlvidecontrasena() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaOlvidecontrasena and vista-olvidecontrasena
     */
    public interface VistaOlvidecontrasenaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

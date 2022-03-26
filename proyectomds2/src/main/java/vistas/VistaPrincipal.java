package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.PasswordField;

/**
 * A Designer generated component for the vista-principal template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-principal")
@JsModule("./src/vista-principal.js")
public class VistaPrincipal extends PolymerTemplate<VistaPrincipal.VistaPrincipalModel> {

 
	@Id("verticalLayout_principal")
	private Element verticalLayout_principal;
	@Id("horizontal_correoYcontrasena")
	private HorizontalLayout horizontal_correoYcontrasena;
	@Id("textField_correo_electronico")
	private TextField textField_correo_electronico;
	@Id("textField_contrasena")
	private PasswordField textField_contrasena;
	@Id("horizontal_buttons1")
	private HorizontalLayout horizontal_buttons1;
	@Id("button_iniciar_sesion")
	private Button button_iniciar_sesion;
	@Id("button_olvide_contrasena")
	private Button button_olvide_contrasena;
	@Id("horizontal_buttons2")
	private HorizontalLayout horizontal_buttons2;
	@Id("button_google")
	private Button button_google;
	@Id("button_facebook")
	private Button button_facebook;
	@Id("button_apple_id")
	private Button button_apple_id;
	@Id("horizontal_buttons3")
	private HorizontalLayout horizontal_buttons3;
	@Id("button_registrarse")
	private Button button_registrarse;

	/**
     * Creates a new VistaPrincipal.
     */
    public VistaPrincipal() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPrincipal and vista-principal
     */
    public interface VistaPrincipalModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-registro template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-registro")
@JsModule("./src/vista-registro.js")
public class VistaRegistro extends PolymerTemplate<VistaRegistro.VistaRegistroModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("horizontal_registrarse")
	private HorizontalLayout horizontal_registrarse;
	@Id("textField_correo_electronico")
	private TextField textField_correo_electronico;
	@Id("textField_confirmar_correo")
	private TextField textField_confirmar_correo;
	@Id("textField_contrasena")
	private TextField textField_contrasena;
	@Id("textField_confirmar_contrasena")
	private TextField textField_confirmar_contrasena;
	@Id("textField_nombrePerfil")
	private TextField textField_nombrePerfil;
	@Id("label_yaTienesCuenta")
	private Button label_yaTienesCuenta;
	@Id("horizontal_iniciarSesion")
	private HorizontalLayout horizontal_iniciarSesion;
	@Id("label_yaTienesCuenta1")
	private Label label_yaTienesCuenta1;
	@Id("button_iniciarSesion")
	private Button button_iniciarSesion;

	/**
     * Creates a new VistaRegistro.
     */
    public VistaRegistro() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaRegistro and vista-registro
     */
    public interface VistaRegistroModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

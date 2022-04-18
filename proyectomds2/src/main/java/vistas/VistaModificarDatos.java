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
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-modificar-datos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-modificar-datos")
@JsModule("./src/vista-modificar-datos.js")
public class VistaModificarDatos extends PolymerTemplate<VistaModificarDatos.VistaModificarDatosModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("label_correo")
	private Label label_correo;
	@Id("text_field_correo")
	private TextField text_field_correo;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("label_contrasena")
	private Label label_contrasena;
	@Id("text_field_contasena")
	private TextField text_field_contasena;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("cargar_archivo")
	private Upload cargar_archivo;
	@Id("imagen")
	private Image imagen;
	@Id("boton_modificar_datos")
	private Button boton_modificar_datos;
	@Id("boton_eliminar_perfil")
	private Button boton_eliminar_perfil;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;

	/**
     * Creates a new VistaModificarDatos.
     */
    public VistaModificarDatos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaModificarDatos and vista-modificar-datos
     */
    public interface VistaModificarDatosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

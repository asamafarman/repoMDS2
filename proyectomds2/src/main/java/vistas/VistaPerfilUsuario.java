package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.NativeButton;

/**
 * A Designer generated component for the vista-perfil-usuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-perfil-usuario")
@JsModule("./src/vista-perfil-usuario.js")
public class VistaPerfilUsuario extends PolymerTemplate<VistaPerfilUsuario.VistaPerfilUsuarioModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("nombre_usuario")
	private Label nombre_usuario;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("boton_cerrar_sesion")
	private NativeButton boton_cerrar_sesion;
	@Id("boton_modificar_perfil")
	private NativeButton boton_modificar_perfil;

	/**
     * Creates a new VistaPerfilUsuario.
     */
    public VistaPerfilUsuario() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPerfilUsuario and vista-perfil-usuario
     */
    public interface VistaPerfilUsuarioModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

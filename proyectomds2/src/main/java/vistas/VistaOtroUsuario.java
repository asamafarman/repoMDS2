package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.NativeButton;

/**
 * A Designer generated component for the vista-otro-usuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-otro-usuario")
@JsModule("./src/vista-otro-usuario.js")
public class VistaOtroUsuario extends PolymerTemplate<VistaOtroUsuario.VistaOtroUsuarioModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("nombre_usuario")
	private Label nombre_usuario;
	@Id("imagne_usuario")
	private Image imagne_usuario;
	@Id("boton_seguir")
	private NativeButton boton_seguir;
	@Id("boton_dejar_seguir")
	private NativeButton boton_dejar_seguir;
	@Id("label")
	private Label label;

	/**
     * Creates a new VistaOtroUsuario.
     */
    public VistaOtroUsuario() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaOtroUsuario and vista-otro-usuario
     */
    public interface VistaOtroUsuarioModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

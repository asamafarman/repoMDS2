package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.html.NativeButton;

/**
 * A Designer generated component for the vista-contactar template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-contactar")
@JsModule("./vista-contactar.js")
public class VistaContactar extends PolymerTemplate<VistaContactar.VistaContactarModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("label_contactar")
	private Label label_contactar;
	@Id("Label_correo")
	private Label label_correo;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("text_field_correo")
	private TextField text_field_correo;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("text_field_asunto")
	private TextField text_field_asunto;
	@Id("label_asunto")
	private Label label_asunto;
	@Id("label_mensaje")
	private Label label_mensaje;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("text_field_mensaje")
	private TextArea text_field_mensaje;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("boton_enviar")
	private NativeButton boton_enviar;
	@Id("boton_cancelar")
	private NativeButton boton_cancelar;

	/**
     * Creates a new VistaContactar.
     */
    public VistaContactar() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaContactar and vista-contactar
     */
    public interface VistaContactarModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

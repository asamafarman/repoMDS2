package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-contacto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-contacto")
@JsModule("./src/vista-contacto.js")
public class VistaContacto extends PolymerTemplate<VistaContacto.VistaContactoModel> {

    @Id("vertical_contacto")
	private Element vertical_contacto;
	@Id("horizontal_contactar")
	private HorizontalLayout horizontal_contactar;
	@Id("label_contactar")
	private Label label_contactar;
	@Id("button_correoElectronico")
	private Button button_correoElectronico;
	/**
     * Creates a new VistaContacto.
     */
    public VistaContacto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaContacto and vista-contacto
     */
    public interface VistaContactoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

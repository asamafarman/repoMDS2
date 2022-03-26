package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-ultimos-exitos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ultimos-exitos")
@JsModule("./src/vista-ultimos-exitos.js")
public class VistaUltimosExitos extends PolymerTemplate<VistaUltimosExitos.VistaUltimosExitosModel> {

	@Id("Vertical_ultimosExitos")
	private Element vertical_ultimosExitos;
	@Id("label_ultimosExitos")
	private Label label_ultimosExitos;
	@Id("img_album")
	private Image img_album;

	/**
     * Creates a new VistaUltimosExitos.
     */
    public VistaUltimosExitos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaUltimosExitos and vista-ultimos-exitos
     */
    public interface VistaUltimosExitosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

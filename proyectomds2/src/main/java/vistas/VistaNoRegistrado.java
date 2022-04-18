package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-no-registrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-no-registrado")
@JsModule("./vista-no-registrado.js")
public class VistaNoRegistrado extends PolymerTemplate<VistaNoRegistrado.VistaNoRegistradoModel> {

    /**
     * Creates a new VistaNoRegistrado.
     */
    public VistaNoRegistrado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaNoRegistrado and vista-no-registrado
     */
    public interface VistaNoRegistradoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

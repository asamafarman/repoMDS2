package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-contactar template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-contactar")
@JsModule("./vista-contactar.js")
public class VistaContactar extends PolymerTemplate<VistaContactar.VistaContactarModel> {

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

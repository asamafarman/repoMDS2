package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-logo template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-logo")
@JsModule("./src/vista-logo.js")
public class VistaLogo extends PolymerTemplate<VistaLogo.VistaLogoModel> {

    /**
     * Creates a new VistaLogo.
     */
    public VistaLogo() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaLogo and vista-logo
     */
    public interface VistaLogoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

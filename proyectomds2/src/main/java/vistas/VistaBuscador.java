package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-buscador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscador")
@JsModule("./src/vista-buscador.js")
public class VistaBuscador extends PolymerTemplate<VistaBuscador.VistaBuscadorModel> {

    /**
     * Creates a new VistaBuscador.
     */
    public VistaBuscador() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaBuscador and vista-buscador
     */
    public interface VistaBuscadorModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-principal template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-principal")
@JsModule("./src/vista-principal.js")
public class VistaPrincipal extends PolymerTemplate<VistaPrincipal.VistaPrincipalModel> {

    /**
     * Creates a new VistaPrincipal.
     */
    public VistaPrincipal() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPrincipal and vista-principal
     */
    public interface VistaPrincipalModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

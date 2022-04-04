package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-buscar template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscar")
@JsModule("./vista-buscar.js")
public class VistaZonaBuscador extends PolymerTemplate<VistaZonaBuscador.VistaBuscarModel> {

    /**
     * Creates a new VistaBuscar.
     */
    public VistaZonaBuscador() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaBuscar and vista-buscar
     */
    public interface VistaBuscarModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

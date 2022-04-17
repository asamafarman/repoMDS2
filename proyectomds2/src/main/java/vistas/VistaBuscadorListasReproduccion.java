package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-buscador-listas-reproduccion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscador-listas-reproduccion")
@JsModule("./src/vista-buscador-listas-reproduccion.js")
public class VistaBuscadorListasReproduccion extends PolymerTemplate<VistaBuscadorListasReproduccion.VistaBuscadorListasReproduccionModel> {

    /**
     * Creates a new VistaBuscadorListasReproduccion.
     */
    public VistaBuscadorListasReproduccion() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaBuscadorListasReproduccion and vista-buscador-listas-reproduccion
     */
    public interface VistaBuscadorListasReproduccionModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

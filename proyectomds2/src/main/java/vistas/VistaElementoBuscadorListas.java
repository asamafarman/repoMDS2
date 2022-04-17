package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-elemento-buscador-listas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-elemento-buscador-listas")
@JsModule("./src/vista-elemento-buscador-listas.js")
public class VistaElementoBuscadorListas extends PolymerTemplate<VistaElementoBuscadorListas.VistaElementoBuscadorListasModel> {

    /**
     * Creates a new VistaElementoBuscadorListas.
     */
    public VistaElementoBuscadorListas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaElementoBuscadorListas and vista-elemento-buscador-listas
     */
    public interface VistaElementoBuscadorListasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

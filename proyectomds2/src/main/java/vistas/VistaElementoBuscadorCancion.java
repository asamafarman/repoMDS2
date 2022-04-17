package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-elemento-buscador-cancion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-elemento-buscador-cancion")
@JsModule("./src/vista-elemento-buscador-cancion.js")
public class VistaElementoBuscadorCancion extends PolymerTemplate<VistaElementoBuscadorCancion.VistaElementoBuscadorCancionModel> {

    /**
     * Creates a new VistaElementoBuscadorCancion.
     */
    public VistaElementoBuscadorCancion() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaElementoBuscadorCancion and vista-elemento-buscador-cancion
     */
    public interface VistaElementoBuscadorCancionModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

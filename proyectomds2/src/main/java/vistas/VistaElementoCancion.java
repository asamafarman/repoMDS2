package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-elemento-cancion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-elemento-cancion")
@JsModule("./src/vista-elemento-cancion.js")
public class VistaElementoCancion extends PolymerTemplate<VistaElementoCancion.VistaElementoCancionModel> {

    /**
     * Creates a new VistaElementoCancion.
     */
    public VistaElementoCancion() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaElementoCancion and vista-elemento-cancion
     */
    public interface VistaElementoCancionModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

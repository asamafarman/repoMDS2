package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-elemento-buscador-autor template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-elemento-buscador-autor")
@JsModule("./src/vista-elemento-buscador-autor.js")
public class VistaElementoBuscadorAutor extends PolymerTemplate<VistaElementoBuscadorAutor.VistaElementoBuscadorAutorModel> {

    /**
     * Creates a new VistaElementoBuscadorAutor.
     */
    public VistaElementoBuscadorAutor() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaElementoBuscadorAutor and vista-elemento-buscador-autor
     */
    public interface VistaElementoBuscadorAutorModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

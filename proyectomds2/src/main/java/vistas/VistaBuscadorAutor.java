package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-buscador-autor template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscador-autor")
@JsModule("./src/vista-buscador-autor.js")
public class VistaBuscadorAutor extends PolymerTemplate<VistaBuscadorAutor.VistaBuscadorAutorModel> {

    /**
     * Creates a new VistaBuscadorAutor.
     */
    public VistaBuscadorAutor() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaBuscadorAutor and vista-buscador-autor
     */
    public interface VistaBuscadorAutorModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

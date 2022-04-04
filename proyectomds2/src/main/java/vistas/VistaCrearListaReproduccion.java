package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-crear-lista-reproduccion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-crear-lista-reproduccion")
@JsModule("./src/vista-crear-lista-reproduccion.js")
public class VistaCrearListaReproduccion extends PolymerTemplate<VistaCrearListaReproduccion.VistaCrearListaReproduccionModel> {

    /**
     * Creates a new VistaCrearListaReproduccion.
     */
    public VistaCrearListaReproduccion() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCrearListaReproduccion and vista-crear-lista-reproduccion
     */
    public interface VistaCrearListaReproduccionModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

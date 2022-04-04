package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-modificar-lista-reproduccion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-modificar-lista-reproduccion")
@JsModule("./src/vista-modificar-lista-reproduccion.js")
public class VistaModificarListaReproduccion extends PolymerTemplate<VistaModificarListaReproduccion.VistaModificarListaReproduccionModel> {

    /**
     * Creates a new VistaModificarListaReproduccion.
     */
    public VistaModificarListaReproduccion() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaModificarListaReproduccion and vista-modificar-lista-reproduccion
     */
    public interface VistaModificarListaReproduccionModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

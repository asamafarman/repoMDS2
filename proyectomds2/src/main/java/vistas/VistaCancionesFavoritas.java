package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-canciones-favoritas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciones-favoritas")
@JsModule("./src/vista-canciones-favoritas.js")
public class VistaCancionesFavoritas extends PolymerTemplate<VistaCancionesFavoritas.VistaCancionesFavoritasModel> {

    /**
     * Creates a new VistaCancionesFavoritas.
     */
    public VistaCancionesFavoritas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCancionesFavoritas and vista-canciones-favoritas
     */
    public interface VistaCancionesFavoritasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

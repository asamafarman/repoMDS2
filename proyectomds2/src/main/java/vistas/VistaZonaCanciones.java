package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-zona-canciones template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-zona-canciones")
@JsModule("./src/vista-zona-canciones.js")
public class VistaZonaCanciones extends PolymerTemplate<VistaZonaCanciones.VistaZonaCancionesModel> {

    /**
     * Creates a new VistaZonaCanciones.
     */
    public VistaZonaCanciones() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaZonaCanciones and vista-zona-canciones
     */
    public interface VistaZonaCancionesModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

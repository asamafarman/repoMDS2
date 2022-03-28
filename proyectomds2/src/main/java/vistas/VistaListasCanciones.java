package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-listas-canciones template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listas-canciones")
@JsModule("./src/vista-listas-canciones.js")
public class VistaListasCanciones extends PolymerTemplate<VistaListasCanciones.VistaListasCancionesModel> {

    /**
     * Creates a new VistaListasCanciones.
     */
    public VistaListasCanciones() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaListasCanciones and vista-listas-canciones
     */
    public interface VistaListasCancionesModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

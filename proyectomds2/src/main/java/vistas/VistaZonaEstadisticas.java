package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-estadisticas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-estadisticas")
@JsModule("./src/vista-estadisticas.js")
public class VistaZonaEstadisticas extends PolymerTemplate<VistaZonaEstadisticas.VistaEstadisticasModel> {

    /**
     * Creates a new VistaEstadisticas.
     */
    public VistaZonaEstadisticas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEstadisticas and vista-estadisticas
     */
    public interface VistaEstadisticasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

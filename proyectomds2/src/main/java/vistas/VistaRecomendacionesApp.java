package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-recomendaciones-app template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-recomendaciones-app")
@JsModule("./vista-recomendaciones-app.js")
public class VistaRecomendacionesApp extends PolymerTemplate<VistaRecomendacionesApp.VistaRecomendacionesAppModel> {

    /**
     * Creates a new VistaRecomendacionesApp.
     */
    public VistaRecomendacionesApp() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaRecomendacionesApp and vista-recomendaciones-app
     */
    public interface VistaRecomendacionesAppModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

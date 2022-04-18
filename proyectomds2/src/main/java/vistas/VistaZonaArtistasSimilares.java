package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-zona-artistas-similares template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-zona-artistas-similares")
@JsModule("./src/vista-zona-artistas-similares.js")
public class VistaZonaArtistasSimilares extends PolymerTemplate<VistaZonaArtistasSimilares.VistaZonaArtistasSimilaresModel> {

    /**
     * Creates a new VistaZonaArtistasSimilares.
     */
    public VistaZonaArtistasSimilares() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaZonaArtistasSimilares and vista-zona-artistas-similares
     */
    public interface VistaZonaArtistasSimilaresModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

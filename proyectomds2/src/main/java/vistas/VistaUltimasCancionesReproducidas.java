package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-ultimas-canciones-reproducidas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ultimas-canciones-reproducidas")
@JsModule("./src/vista-ultimas-canciones-reproducidas.js")
public class VistaUltimasCancionesReproducidas extends PolymerTemplate<VistaUltimasCancionesReproducidas.VistaUltimasCancionesReproducidasModel> {

    /**
     * Creates a new VistaUltimasCancionesReproducidas.
     */
    public VistaUltimasCancionesReproducidas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaUltimasCancionesReproducidas and vista-ultimas-canciones-reproducidas
     */
    public interface VistaUltimasCancionesReproducidasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-modificar-datos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-modificar-datos")
@JsModule("./src/vista-modificar-datos.js")
public class VistaModificarDatos extends PolymerTemplate<VistaModificarDatos.VistaModificarDatosModel> {

    /**
     * Creates a new VistaModificarDatos.
     */
    public VistaModificarDatos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaModificarDatos and vista-modificar-datos
     */
    public interface VistaModificarDatosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-perfil-usuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-perfil-usuario")
@JsModule("./src/vista-perfil-usuario.js")
public class VistaPerfilUsuario extends PolymerTemplate<VistaPerfilUsuario.VistaPerfilUsuarioModel> {

    /**
     * Creates a new VistaPerfilUsuario.
     */
    public VistaPerfilUsuario() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPerfilUsuario and vista-perfil-usuario
     */
    public interface VistaPerfilUsuarioModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

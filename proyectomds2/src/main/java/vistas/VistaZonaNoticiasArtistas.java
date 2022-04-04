package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-ultimas-noticias-artistas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ultimas-noticias-artistas")
@JsModule("./src/vista-ultimas-noticias-artistas.js")
public class VistaZonaNoticiasArtistas extends PolymerTemplate<VistaZonaNoticiasArtistas.VistaUltimasNoticiasArtistasModel> {

    /**
     * Creates a new VistaUltimasNoticiasArtistas.
     */
    public VistaZonaNoticiasArtistas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaUltimasNoticiasArtistas and vista-ultimas-noticias-artistas
     */
    public interface VistaUltimasNoticiasArtistasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

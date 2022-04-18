package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-artista")
@JsModule("./src/vista-artista.js")
public class VistaArtista extends PolymerTemplate<VistaArtista.VistaArtistaModel> {

    @Id("vista_artista")
	private Element vista_artista;

	/**
     * Creates a new VistaArtista.
     */
    public VistaArtista() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaArtista and vista-artista
     */
    public interface VistaArtistaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

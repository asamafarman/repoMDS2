package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-artista-cancion-mas-reproducida template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-artista-cancion-mas-reproducida")
@JsModule("./src/vista-artista-cancion-mas-reproducida.js")
public class VistaArtistaCancionMasReproducida extends PolymerTemplate<VistaArtistaCancionMasReproducida.VistaArtistaCancionMasReproducidaModel> {

    @Id("label_top_canciones")
	private Label label_top_canciones;
	@Id("top_canciones1")
	private Element top_canciones1;
	@Id("lista_top_canciones")
	private Element lista_top_canciones;

	/**
     * Creates a new VistaArtistaCancionMasReproducida.
     */
    public VistaArtistaCancionMasReproducida() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaArtistaCancionMasReproducida and vista-artista-cancion-mas-reproducida
     */
    public interface VistaArtistaCancionMasReproducidaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

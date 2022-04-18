package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-listas-donde-aparece template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listas-donde-aparece")
@JsModule("./src/vista-listas-donde-aparece.js")
public class VistaListasDondeAparece extends PolymerTemplate<VistaListasDondeAparece.VistaListasDondeApareceModel> {

    @Id("lablel_lista_donde_aparece")
	private Label lablel_lista_donde_aparece;
	@Id("listas_donde_aparece")
	private Element listas_donde_aparece;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaListasDondeAparece.
     */
    public VistaListasDondeAparece() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaListasDondeAparece and vista-listas-donde-aparece
     */
    public interface VistaListasDondeApareceModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

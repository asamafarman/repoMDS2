package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.PasswordField;

/**
 * A Designer generated component for the vista-principal template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-principal")
@JsModule("./src/vista-principal.js")
public class VistaPrincipal extends PolymerTemplate<VistaPrincipal.VistaPrincipalModel> {

    @Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("vaadinButton1")
	private Button vaadinButton1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinButton2")
	private Button vaadinButton2;
	@Id("vaadinButton3")
	private Button vaadinButton3;
	@Id("vaadinButton4")
	private Button vaadinButton4;
	@Id("vaadinButton5")
	private Button vaadinButton5;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinTextField")
	private TextField vaadinTextField;
	@Id("vaadinTextField1")
	private TextField vaadinTextField1;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinPasswordField")
	private PasswordField vaadinPasswordField;
	/**
     * Creates a new VistaPrincipal.
     */
    public VistaPrincipal() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPrincipal and vista-principal
     */
    public interface VistaPrincipalModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

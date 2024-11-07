// Client Code
public class Client {
    private UIFactory uiFactory;

    public Client(UIFactory uiFactory) {
        this.uiFactory = uiFactory;
    }

    public void createUI() {
        Button button = uiFactory.createButton();
        Text textField = uiFactory.createText();

        // Render UI elements
        button.renderAButton();
        textField.renderAText();
    }

    public static void main (String[] args) {
        // Select a Theme
        UIFactory ThemeExample = new LightThemeFactory();
        Client ThemeClient = new Client(ThemeExample);
        ThemeClient.createUI();

    }
}



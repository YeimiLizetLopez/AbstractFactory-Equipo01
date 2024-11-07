// Concrete Factory Implementation
class LightThemeFactory implements UIFactory {
    public Button createButton() {
        return new LightThemeButton();
    }

    public Text createText() { return new LightThemeText(); }
}


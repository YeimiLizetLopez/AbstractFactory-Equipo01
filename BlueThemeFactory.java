// Concrete Factory Implementations
class BlueThemeFactory implements UIFactory {
    public Button createButton() {
        return new BlueThemeButton();
    }

    public Text createText() {
        return new BlueThemeText();
    }
}


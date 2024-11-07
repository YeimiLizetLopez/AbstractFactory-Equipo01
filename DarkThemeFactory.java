// Concrete Factory Implementations
class DarkThemeFactory implements UIFactory {
    public Button createButton() { return new DarkThemeButton(); }

    public Text createText() { return new DarkThemeText(); }
}

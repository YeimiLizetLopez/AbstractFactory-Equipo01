// Concrete Product Implementations for Light Theme
class DarkThemeButton implements Button {
    public void renderAButton() {
        // Render a black button
        System.out.println(Colors.BLACK_BACKGROUND +
                "Dark Theme Button" + Colors.ANSI_RESET);
    }
}

class DarkThemeText implements Text {
    public void renderAText() {
        // Render a black text
        System.out.println(Colors.BLACK +
                "Dark Theme Text" + Colors.ANSI_RESET);
    }
}

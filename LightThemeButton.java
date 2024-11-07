// Concrete Product Implementations for Light Theme
class LightThemeButton implements Button {
    public void renderAButton() {
        // Render a white button
        System.out.println(Colors.WHITE_BACKGROUND +
                "Light Theme Button" + Colors.ANSI_RESET);
    }
}

class LightThemeText implements Text {
    public void renderAText() {
        // Render a white text
        System.out.println(Colors.WHITE +
                "Light Theme Text" + Colors.ANSI_RESET);
    }
}



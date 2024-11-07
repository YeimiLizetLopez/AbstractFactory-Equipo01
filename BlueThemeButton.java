// Concrete Product Implementations for Blue Theme
public class BlueThemeButton implements Button {
    public void renderAButton() {
        // Render a blue button
        System.out.println(Colors.BLUE_BACKGROUND +
                "Blue Theme Button" + Colors.ANSI_RESET);
    }
}

class BlueThemeText implements Text{
    public void renderAText() {
        //render a blue text
        System.out.println(Colors.BLUE +
                "Blue Theme Text" + Colors.ANSI_RESET);
    }
}


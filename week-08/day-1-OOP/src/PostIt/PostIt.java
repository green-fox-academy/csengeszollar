package PostIt;

import java.awt.*;

public class PostIt {
    Color backgroundColor;
    String textOnIt;
    Color textColor;

    public PostIt (Color backgroundColor, String textOnIt, Color textColor) {
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
        this.textOnIt = textOnIt;
    }
}

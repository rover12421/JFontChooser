package say.swing;

import org.junit.Test;

import java.awt.*;
import java.util.Locale;

public class JFontChooserTest {
    @Test
    public void showTest() {
        JFontChooser fontChooser = new JFontChooser(Locale.CHINA);
        int result = fontChooser.showDialog(null);
        if (result == JFontChooser.OK_OPTION) {
            Font font = fontChooser.getSelectedFont();
            System.out.println("Selected Font : " + font);
        }
    }
}

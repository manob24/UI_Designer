import javax.swing.*;
import java.awt.*;

public class DetailedButton extends Button{
    DetailedButton(Properties properties) {
        super(properties);
    }

    @Override
    public JButton create() {
        JButton button = new SimpleButton(properties).create();
        Font font = new Font(properties.fontName, properties.fontStyle, properties.fontSize);
        button.setFont(font);
        try {
            button.setBackground(Color.decode(properties.backgroundColor));
        } catch (Exception e) {
            System.out.println("only hex color code is supported");
        }
        return button;
    }
}

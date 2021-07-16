import javax.swing.*;
import java.awt.*;

public class SimpleButton extends Button{
    public SimpleButton(Properties properties) {
        super(properties);
    }

    @Override
    public JButton create() {
        JButton button = new JButton();
        button.setBounds(properties.x, properties.y, properties.width, properties.height);
        button.setText(properties.value);
        try {
            button.setForeground(Color.decode(properties.textColor));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return button;
    }
}

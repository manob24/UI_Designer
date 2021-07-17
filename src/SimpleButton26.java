import javax.swing.*;
import java.awt.*;

public class SimpleButton26 extends Button26 {
    public SimpleButton26(Properties26 properties) {
        super(properties);
    }

    //create a simple button from properties
    @Override
    public JButton create() {
        JButton button = new JButton();
        button.setBounds(properties.x, properties.y, properties.width, properties.height);      //set the boundary of the button
        button.setText(properties.value);                                                       //text to show on button
        try {
            button.setForeground(Color.decode(properties.textColor));                           // text color
        } catch (Exception e) {
            e.printStackTrace();
        }
        return button;
    }
}

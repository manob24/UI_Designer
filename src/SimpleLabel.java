import javax.swing.*;

public class SimpleLabel extends Label{
    SimpleLabel(Properties properties){super(properties);}
    @Override
    JLabel create() {
        JLabel label = new JLabel();
        label.setText(properties.value);
        label.setBounds(properties.x,properties.y, properties.width, properties.height);
        return label;
    }
}

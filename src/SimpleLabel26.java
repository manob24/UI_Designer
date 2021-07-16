import javax.swing.*;

public class SimpleLabel26 extends Label26 {
    SimpleLabel26(Properties26 properties){super(properties);}
    @Override
    JLabel create() {
        JLabel label = new JLabel();
        label.setText(properties.value);
        label.setBounds(properties.x,properties.y, properties.width, properties.height);
        return label;
    }
}

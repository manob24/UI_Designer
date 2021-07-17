import javax.swing.*;
import java.awt.*;

public class SimpleLabel26 extends Label26 {
    SimpleLabel26(Properties26 properties){super(properties);}
    @Override
    JLabel create() {
        JLabel label = new JLabel();
        label.setText(properties.value);                                                    //text
        label.setBounds(properties.x,properties.y, properties.width, properties.height);    //setting boundary of the label
        label.setForeground(Color.decode(properties.textColor));                            //text color
        return label;
    }
}

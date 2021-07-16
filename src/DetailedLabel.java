import javax.swing.*;
import java.awt.*;

public class DetailedLabel extends Label{
    DetailedLabel(Properties properties){
        super(properties);
    }
    @Override
    JLabel create() {
        JLabel label = new JLabel();
        label.setText(properties.value);
        label.setBounds(properties.x,properties.y, properties.width, properties.height);
        try {
            label.setForeground(Color.decode(properties.textColor));
        }catch (Exception e){
            System.out.println("only hexColor code is supported");
        }
        Font font = new Font(properties.fontName, properties.fontStyle, properties.fontSize);
        label.setFont(font);
        return  label;
    }
}

import javax.swing.*;
import java.awt.*;

public class DetailedLabel26 extends Label26 {
    DetailedLabel26(Properties26 properties){
        super(properties);
    }
    //create a text label
    @Override
    JLabel create() {
        JLabel label = new JLabel();
        label.setText(properties.value);
        label.setBounds(properties.x,properties.y, properties.width, properties.height);
        try {
            label.setForeground(Color.decode(properties.textColor));    //decodes color from hex color code
        }catch (Exception e){
            System.out.println("only hexColor code is supported");
        }
        Font font = new Font(properties.fontName, properties.fontStyle, properties.fontSize);   //creates new font from properties
        label.setFont(font);
        return  label;
    }
}

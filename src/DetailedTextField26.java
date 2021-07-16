import javax.swing.*;
import java.awt.*;

public class DetailedTextField26 extends TextField26 {
    DetailedTextField26(Properties26 properties) {
        super(properties);
    }

    @Override
    public JTextField create() {
        JTextField textField = new SimpleTextField26(properties).create();
        try{
            textField.setForeground(Color.decode(properties.textColor));
            textField.setBackground(Color.decode(properties.backgroundColor));
        }catch (Exception e){
            e.printStackTrace();
        }
        Font font = new Font(properties.fontName, properties.fontStyle, properties.fontSize);
        textField.setFont(font);
        return textField;
    }
}

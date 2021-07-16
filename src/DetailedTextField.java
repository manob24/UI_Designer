import javax.swing.*;
import java.awt.*;

public class DetailedTextField extends TextField{
    DetailedTextField(Properties properties) {
        super(properties);
    }

    @Override
    public JTextField create() {
        JTextField textField = new SimpleTextField(properties).create();
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

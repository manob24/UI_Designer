import javax.swing.*;
import java.awt.*;

public class DetailedTextField26 extends TextField26 {
    DetailedTextField26(Properties26 properties) {
        super(properties);
    }
    //create a edit box
    @Override
    public JTextField create() {
        JTextField textField = new SimpleTextField26(properties).create();  //this is for reducing redundancy as detailed text field contains all qualities of simple text field
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

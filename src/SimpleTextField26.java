import javax.swing.*;

public class SimpleTextField26 extends TextField26 {
    SimpleTextField26(Properties26 properties) {
        super(properties);
    }

    @Override
    public JTextField create() {
        JTextField textField = new JTextField();
        textField.setBounds(properties.x, properties.y, properties.width, properties.height);   //setting boundary of text field
        textField.setText(properties.value);                                                    //setting initial text of text field
        return textField;
    }
}

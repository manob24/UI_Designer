import javax.swing.*;

public class SimpleTextField extends TextField{
    SimpleTextField(Properties properties) {
        super(properties);
    }

    @Override
    public JTextField create() {
        JTextField textField = new JTextField();
        textField.setBounds(properties.x, properties.y, properties.width, properties.height);
        textField.setText(properties.value);
        return textField;
    }
}

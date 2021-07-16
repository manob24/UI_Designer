import javax.swing.*;

public abstract class UIDesignFactory {
    abstract JButton getButton(Properties properties);
    abstract JTextField getTextField(Properties properties);
    abstract JLabel getLabel(Properties properties);
}

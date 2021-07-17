import javax.swing.*;
//This is an abstract factory which is used by window manager
public abstract class UIDesignFactory26 {
    abstract JButton getButton(Properties26 properties);
    abstract JTextField getTextField(Properties26 properties);
    abstract JLabel getLabel(Properties26 properties);
}

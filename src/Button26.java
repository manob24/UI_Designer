import javax.swing.*;

public abstract class Button26 {
    protected Properties26 properties;              //properties of the button
    Button26(Properties26 properties){
        this.properties = properties;
    }
    public abstract JButton create();               //create a button
}

import javax.swing.*;
//This abstract class creates a text label using given properties
public abstract class Label26 {
    protected Properties26 properties;
    Label26(Properties26 properties){
        this.properties = properties;
    }
    abstract JLabel create();
}

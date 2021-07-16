import javax.swing.*;

public abstract class TextField26 {
    protected Properties26 properties;
    TextField26(Properties26 properties){
        this.properties = properties;
    }
    public abstract JTextField create();
}

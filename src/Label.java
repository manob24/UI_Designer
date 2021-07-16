import javax.swing.*;

public abstract class Label {
    protected Properties properties;
    Label(Properties properties){
        this.properties = properties;
    }
    abstract JLabel create();
}

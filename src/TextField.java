import javax.swing.*;

public abstract class TextField{
    protected Properties properties;
    TextField(Properties properties){
        this.properties = properties;
    }
    public abstract JTextField create();
}

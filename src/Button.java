import javax.swing.*;

public abstract class Button {
    protected Properties properties;
    Button(Properties properties){
        this.properties = properties;
    }
    public abstract JButton create();
}

import javax.swing.*;

public class WindowManager {
    UIDesignFactory26 uiDesignFactory;
    WindowManager(UIDesignFactory26 uiDesignFactory){
        this.uiDesignFactory = uiDesignFactory;
    }
    void loadUI(ConfigManager26 configManager){
        JFrame frame = new JFrame("Your UI");           //new ui frame
        while (configManager.hasMoreItems()){
            Properties26 properties = new Properties26(configManager.nextItem());
            if(properties.type.equalsIgnoreCase("Button")) {
               frame.add(uiDesignFactory.getButton(properties));                    //add a button to frame
            }else if(properties.type.equalsIgnoreCase("EditBox")){
                frame.add(uiDesignFactory.getTextField(properties));                //add a text field to frame
            }else if(properties.type.equalsIgnoreCase("Label")){
                frame.add(uiDesignFactory.getLabel(properties));                    //add a label to frame
            }
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(800,500);             //size of the frame
        frame.setVisible(true);
    }
}

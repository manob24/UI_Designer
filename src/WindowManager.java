import javax.swing.*;

public class WindowManager {
    void loadUI(ConfigManager configManager){
        UIDesignFactory simplisticDesign = SimplisticDesign.getInstance();
        UIDesignFactory detailedDesign = DetailedDesign.getInstance();

        JFrame frame = new JFrame("Your UI");
        while (configManager.hasMoreItems()){
            Properties properties = new Properties(configManager.nextItem());
            if(properties.type.equalsIgnoreCase("Button")) {
                if (properties.object.equalsIgnoreCase("simple")) {
                    frame.add(simplisticDesign.getButton(properties));
                } else {
                    frame.add(detailedDesign.getButton(properties));
                }
            }
            else if(properties.type.equalsIgnoreCase("EditBox")){
                if (properties.object.equalsIgnoreCase("simple")) {
                    frame.add(simplisticDesign.getTextField(properties));
                } else {
                    frame.add(detailedDesign.getTextField(properties));
                }
            }else if(properties.type.equalsIgnoreCase("Label")){
                if (properties.object.equalsIgnoreCase("simple")) {
                    frame.add(simplisticDesign.getLabel(properties));
                } else {
                    frame.add(detailedDesign.getLabel(properties));
                }
            }
        }
        frame.setLayout(null);
        frame.setSize(800,500);
        frame.setVisible(true);
    }
}

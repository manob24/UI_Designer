import javax.swing.*;

public class DetailedDesign extends UIDesignFactory{
    private static DetailedDesign detailedDesign = null;
    private DetailedDesign(){};
    @Override
    JButton getButton(Properties properties) {
        return new DetailedButton(properties).create();
    }

    @Override
    JTextField getTextField(Properties properties) {
        return new DetailedTextField(properties).create();
    }

    @Override
    JLabel getLabel(Properties properties) {
        return new DetailedLabel(properties).create();
    }

    public static DetailedDesign getInstance() {
        if(detailedDesign == null){
            detailedDesign = new DetailedDesign();
        }
        return detailedDesign;
    }
}

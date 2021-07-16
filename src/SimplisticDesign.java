import javax.swing.*;

public class SimplisticDesign extends UIDesignFactory{
    private  static  SimplisticDesign simplisticDesign = null;
    private SimplisticDesign(){}
    @Override
    JButton getButton(Properties properties) {
        return new SimpleButton(properties).create();
    }

    @Override
    JTextField getTextField(Properties properties) {
        return new SimpleTextField(properties).create();
    }

    @Override
    JLabel getLabel(Properties properties) {
        return new SimpleLabel(properties).create();
    }

    public static SimplisticDesign getInstance(){
        if(simplisticDesign == null){
            simplisticDesign = new SimplisticDesign();
        }
        return  simplisticDesign;
    }
}

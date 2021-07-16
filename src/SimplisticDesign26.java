import javax.swing.*;

public class SimplisticDesign26 extends UIDesignFactory26 {
    private  static SimplisticDesign26 simplisticDesign = null;
    private SimplisticDesign26(){}
    @Override
    JButton getButton(Properties26 properties) {
        return new SimpleButton26(properties).create();
    }

    @Override
    JTextField getTextField(Properties26 properties) {
        return new SimpleTextField26(properties).create();
    }

    @Override
    JLabel getLabel(Properties26 properties) {
        return new SimpleLabel26(properties).create();
    }

    public static SimplisticDesign26 getInstance(){
        if(simplisticDesign == null){
            simplisticDesign = new SimplisticDesign26();
        }
        return  simplisticDesign;
    }
}

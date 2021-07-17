/*This is a singleton class and a concrete UIDesignFactory class*/

import javax.swing.*;

public class DetailedDesign26 extends UIDesignFactory26 {
    private static DetailedDesign26 detailedDesign = null;
    private DetailedDesign26(){}
    @Override
    JButton getButton(Properties26 properties) {
        return new DetailedButton26(properties).create();
    }

    @Override
    JTextField getTextField(Properties26 properties) {
        return new DetailedTextField26(properties).create();
    }

    @Override
    JLabel getLabel(Properties26 properties) {
        return new DetailedLabel26(properties).create();
    }

    public static DetailedDesign26 getInstance() {                  //get the instance of this class
        if(detailedDesign == null){                                 //return new instance if not created previously otherwise return previous instance
            detailedDesign = new DetailedDesign26();
        }
        return detailedDesign;
    }
}

/* This class converts all attributes in hashmap in a proper way to use later */

import java.util.HashMap;

public class Properties26 {
    //constants
    final String TYPE = "type";
    final String VALUE = "value";
    final String X = "x";
    final String Y = "y";
    final String WIDTH = "width";
    final String HEIGHT = "height";
    final String TEXT_COLOR = "textColor";
    final String FONT_NAME = "fontName";
    final String FONT_STYLE = "fontStyle";
    final String FONT_SIZE = "fontSize";
    final String BACKGROUND_COLOR = "backgroundColor";

    //attribute names
    String type;
    int x;
    int y;
    int width;
    int height;
    String value;
    String textColor;
    String fontName;
    int fontStyle;
    int fontSize;
    String backgroundColor;


    Properties26(HashMap<String , String >hashMap){
        //strip() method trims whitespace from start and end of string
        type = hashMap.get(TYPE).strip();                       //which type of element is this e.g. Button, EditBox
        String xText = hashMap.get(X);                          //x coordinate
        if(xText != null && !xText.strip().equals("")){
            x = Integer.parseInt(xText.strip());
        }else{
            x = 100;                                            //default x coordinate
        }
        String yText = hashMap.get(Y);                          //y coordinate
        if(yText != null && !yText.strip().equals("")){
            y = Integer.parseInt(yText.strip());
        }else{
            y = 100;                                            //default y coordinate
        }
        String widthText = hashMap.get(WIDTH);
        if(widthText != null && !widthText.strip().equals("")){
            width = Integer.parseInt(widthText.strip());        //width of the element
        }else{
            width = 200;                                        //default width
        }
        String heightText = hashMap.get(HEIGHT);
        if(heightText != null && !heightText.strip().equals("")){
            height = Integer.parseInt(heightText.strip());      //height of the element
        }else{
            height = 40;                                        //default height
        }
        value = hashMap.get(VALUE);                             //value of the element
        if(value!=null) value = value.strip();
        textColor = hashMap.get(TEXT_COLOR);                    //text color
        if(textColor == null || textColor.strip().equals("")) textColor = "#000000";        //default text color
        else textColor = textColor.strip();
        backgroundColor = hashMap.get(BACKGROUND_COLOR);        //background color
        if(backgroundColor == null || backgroundColor.strip().equals("")) backgroundColor = "#FFFFFF";  //default background color
        else {
            backgroundColor = backgroundColor.strip();
        }
        fontName = hashMap.get(FONT_NAME);                      //font name
        if(fontName!=null) fontName = fontName.strip();
        String fontStyleText = hashMap.get(FONT_STYLE);         //font style e.g. BOLD, PLAIN
        if(fontStyleText!=null){
            if(fontStyleText.strip().equalsIgnoreCase("BOLD")){
                fontStyle = 1;                                  //BOLD code
            }else if(fontStyleText.strip().equalsIgnoreCase("ITALIC")){
                fontStyle = 2;                                  //ITALIC code
            }else{
                fontStyle = 0;                                  //PLAIN style code
            }
        }
        else fontStyle = 0;                                     //PLAIN set as default

        String fontSizeText = hashMap.get(FONT_SIZE);
        if(fontSizeText!=null && !fontSizeText.strip().equals("")) {
            fontSize = Integer.parseInt(fontSizeText.strip());
        }else{
            fontSize = 14;                                      //default font size
        }
    }
}

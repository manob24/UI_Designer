import java.util.HashMap;

public class Properties {
    final String OBJECT = "object";
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
    String type;
    String object;
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
    Properties(HashMap<String , String >hashMap){
        object = hashMap.get(OBJECT);
        type = hashMap.get(TYPE).strip();
        String xText = hashMap.get(X);
        if(xText != null && !xText.strip().equals("")){
            x = Integer.parseInt(xText.strip());
        }else{
            x = 100;
        }
        String yText = hashMap.get(Y);
        if(yText != null && !yText.strip().equals("")){
            y = Integer.parseInt(yText.strip());
        }else{
            y = 100;
        }
        String widthText = hashMap.get(WIDTH);
        if(widthText != null && !widthText.strip().equals("")){
            width = Integer.parseInt(widthText.strip());
        }else{
            width = 200;
        }
        String heightText = hashMap.get(HEIGHT);
        if(heightText != null && !heightText.strip().equals("")){
            height = Integer.parseInt(heightText.strip());
        }else{
            height = 40;
        }
        value = hashMap.get(VALUE);
        if(value!=null) value = value.strip();
        textColor = hashMap.get(TEXT_COLOR);
        if(textColor == null || textColor.strip().equals("")) textColor = "#000000";
        else textColor = textColor.strip();
        backgroundColor = hashMap.get(BACKGROUND_COLOR);
        if(backgroundColor == null || backgroundColor.strip().equals("")) backgroundColor = "#FFFFFF";
        else {
            backgroundColor = backgroundColor.strip();
        }
        fontName = hashMap.get(FONT_NAME);
        if(fontName!=null) fontName = fontName.strip();
        String fontStyleText = hashMap.get(FONT_STYLE);
        if(fontStyleText!=null){
            if(fontStyleText.strip().equalsIgnoreCase("BOLD")){
                fontStyle = 1;
            }else if(fontStyleText.strip().equalsIgnoreCase("ITALIC")){
                fontStyle = 2;
            }else{
                fontStyle = 0;
            }
        }
        else fontStyle = 0;

        String fontSizeText = hashMap.get(FONT_SIZE);
        if(fontSizeText!=null && !fontSizeText.strip().equals("")) {
            fontSize = Integer.parseInt(fontSizeText.strip());
        }else{
            fontSize = 14;
        }
    }
}

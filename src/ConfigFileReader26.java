import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class ConfigFileReader26 implements Reader26 {
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

    String path;
    File configFile;
    Scanner myReader;
    ConfigFileReader26(String path){
        this.path = path;
        loadFile();
    }

    private void loadFile(){
        try {
            configFile = new File(path);
            myReader = new Scanner(configFile);
        }
        catch (FileNotFoundException e){
            System.out.println("An error occurred in config file");
            e.printStackTrace();
        }
    }

    @Override
    public Boolean hasNextObject() {
        return myReader.hasNextLine();
    }

    @Override
    public HashMap<String, String> nextObject() {
        String data = myReader.nextLine();
        data = formatData(data);
        String[] objects = data.split(",");
        HashMap<String, String> hashMap = null;
        if(objects[0].strip().equalsIgnoreCase("Button") && objects.length == 7){
            hashMap = simpleObject(objects);
        }else if(objects[0].equalsIgnoreCase("Button") && objects.length == 11){
            hashMap = detailedObject(objects);
        }else if(objects[0].equalsIgnoreCase("EditBox") && objects.length == 6){
            hashMap = simpleObject(objects);
        }else if(objects[0].equalsIgnoreCase("EditBox") && objects.length == 11){
            hashMap = detailedObject(objects);
        }else if(objects[0].equalsIgnoreCase("Label") && objects.length == 6){
            hashMap = simpleObject(objects);
        }else if(objects[0].equalsIgnoreCase("Label") && objects.length == 10){
            hashMap = detailedObject(objects);
        }else {
            System.out.println("This format is not supported: "+data);
            System.out.println(objects[0] + " " + objects.length);
        }

        return hashMap;
    }

    private String formatData(String data) {
        String formatted = "";
        for (int i = 0; i < data.length(); i++) {
            if(data.charAt(i)==','){
                formatted = formatted.concat(", ");
            }
            else formatted = formatted.concat(String.valueOf(data.charAt(i)));
        }
        return formatted;
    }

    private HashMap<String, String> detailedObject(String[] objects) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("object", "detailed");
        if(objects[0].strip().equalsIgnoreCase("Button")){
            hashMap.put(TYPE, objects[0]);
            hashMap.put(VALUE, objects[1]);
            hashMap.put(X, objects[2]);
            hashMap.put(Y, objects[3]);
            hashMap.put(WIDTH, objects[4]);
            hashMap.put(HEIGHT, objects[5]);
            hashMap.put(TEXT_COLOR, objects[6]);
            hashMap.put(FONT_NAME, objects[7]);
            hashMap.put(FONT_STYLE, objects[8]);
            hashMap.put(FONT_SIZE, objects[9]);
            hashMap.put(BACKGROUND_COLOR, objects[10]);
        }else if(objects[0].strip().equalsIgnoreCase("EditBox")){
            hashMap.put(TYPE, objects[0]);
            hashMap.put(VALUE, objects[1]);
            hashMap.put(X, objects[2]);
            hashMap.put(Y, objects[3]);
            hashMap.put(WIDTH, objects[4]);
            hashMap.put(HEIGHT, objects[5]);
            hashMap.put(TEXT_COLOR, objects[6]);
            hashMap.put(FONT_NAME, objects[7]);
            hashMap.put(FONT_STYLE, objects[8]);
            hashMap.put(FONT_SIZE, objects[9]);
            hashMap.put(BACKGROUND_COLOR, objects[10]);
        }else if(objects[0].strip().equalsIgnoreCase("Label")){
            hashMap.put(TYPE, objects[0]);
            hashMap.put(VALUE, objects[1]);
            hashMap.put(X, objects[2]);
            hashMap.put(Y, objects[3]);
            hashMap.put(WIDTH, objects[4]);
            hashMap.put(HEIGHT, objects[5]);
            hashMap.put(TEXT_COLOR, objects[6]);
            hashMap.put(FONT_NAME, objects[7]);
            hashMap.put(FONT_STYLE, objects[8]);
            hashMap.put(FONT_SIZE, objects[9]);
        }
        return hashMap;
    }

    private HashMap<String, String> simpleObject(String[] objects) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("object", "simple");
        if(objects[0].strip().equalsIgnoreCase("Button")){
            hashMap.put(TYPE, objects[0]);
            hashMap.put(VALUE, objects[1]);
            hashMap.put(X, objects[2]);
            hashMap.put(Y, objects[3]);
            hashMap.put(WIDTH, objects[4]);
            hashMap.put(HEIGHT, objects[5]);
            hashMap.put(TEXT_COLOR, objects[6]);
        }else if(objects[0].strip().equalsIgnoreCase("EditBox")){
            hashMap.put(TYPE, objects[0]);
            hashMap.put(VALUE, objects[1]);
            hashMap.put(X, objects[2]);
            hashMap.put(Y, objects[3]);
            hashMap.put(WIDTH, objects[4]);
            hashMap.put(HEIGHT, objects[5]);
        }else if(objects[0].strip().equalsIgnoreCase("Label")){
            hashMap.put(TYPE, objects[0]);
            hashMap.put(VALUE, objects[1]);
            hashMap.put(X, objects[2]);
            hashMap.put(Y, objects[3]);
            hashMap.put(WIDTH, objects[4]);
            hashMap.put(HEIGHT, objects[5]);
        }
        return  hashMap;
    }

    public void closeFileReader(){
        myReader.close();
    }
}
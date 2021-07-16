import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.HashMap;
import java.util.List;

public class XMLReader implements Reader{
    String path;
    List<HashMap<String, String>> file;
    int currentInd = 0;
    XMLReader(String path){
        this.path = path;
        loadFile();
    }

    private void loadFile(){
        try {
            File inputFile = new File(path);
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            XMLHandler xmlHandler = new XMLHandler();
            saxParser.parse(inputFile, xmlHandler);
            while (!xmlHandler.doneParsing){}
            file = xmlHandler.getFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public Boolean hasNextObject() {
        return currentInd < file.size();
    }

    @Override
    public HashMap<String, String> nextObject() {
        HashMap<String , String> hashMap = file.get(currentInd++);
        hashMap.put("object", "detailed");
        return hashMap;
    }

}
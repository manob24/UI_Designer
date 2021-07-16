import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.HashMap;

class XMLHandler26 extends DefaultHandler {

    boolean doneParsing = false;
    private final ArrayList<HashMap<String, String >> file =  new ArrayList<>();
    private HashMap<String, String > hashMap = null;
    private int currentInd = 0;
    private boolean started = false;
    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        doneParsing = true;
    }

    @Override
    public void startElement(
            String uri, String localName, String qName, Attributes attributes)
            throws SAXException {
        hashMap = new HashMap<>();
        hashMap.put("type", qName);
        int size = attributes.getLength();
        for (int i = 0; i < size; i++) {
            hashMap.put(attributes.getQName(i), attributes.getValue(i));
        }
        if (hashMap != null && currentInd>0 ) {
            file.add(hashMap);
            hashMap = null;
            started = true;
            ++currentInd;
        }
        if(currentInd == 0){
            currentInd = 1;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        started = false;
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {
        if(started && currentInd>1){
            hashMap = file.get(currentInd - 2);
            hashMap.put("value", new String(ch, start, length));
            file.set(currentInd-2, hashMap);
            hashMap = null;
            started = false;
        }
    }

    public ArrayList<HashMap<String , String >> getFile(){
        return file;
    }
}
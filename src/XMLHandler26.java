import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.HashMap;

class XMLHandler26 extends DefaultHandler {

    boolean doneParsing = false;                        //parsing completed flag
    private final ArrayList<HashMap<String, String >> file =  new ArrayList<>();        //list of properties of elements as hashmap
    private HashMap<String, String > hashMap = null;        //it is used to add each element to list
    private int currentInd = 0;                             //index which is processing
    private boolean started = false;                        //element reading started flag

    //this method is triggered when document is ended
    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        doneParsing = true;             //parsing completed
    }

    //this is triggered when each element is started
    @Override
    public void startElement(
            String uri, String localName, String qName, Attributes attributes)
            throws SAXException {
        hashMap = new HashMap<>();
        hashMap.put("type", qName);
        int size = attributes.getLength();
        for (int i = 0; i < size; i++) {                            //adding attributes to hashmap
            hashMap.put(attributes.getQName(i), attributes.getValue(i));
        }
        if (hashMap != null && currentInd>0 ) {                     //root tag is escaped
            file.add(hashMap);
            hashMap = null;
            started = true;
            ++currentInd;
        }
        if(currentInd == 0){                                        //to count escapped root tag
            currentInd = 1;
        }
    }

    //this is triggered when each element ends
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        started = false;                                            //parsing ended
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {
        if(started && currentInd>1){                                //this is used when value is between tags
            hashMap = file.get(currentInd - 2);
            hashMap.put("value", new String(ch, start, length));
            file.set(currentInd-2, hashMap);
            hashMap = null;
            started = false;
        }
    }

    public ArrayList<HashMap<String , String >> getFile(){
        return file;
    }   //getter method of file
}
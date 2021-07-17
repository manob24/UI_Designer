import java.util.HashMap;

public interface ConfigManager26 {
    HashMap<String, String> nextItem();         //next element to add
    Boolean hasMoreItems();                     //check if there is another element
    String getItemType();                       //what type of element the file contains i.e. simple or detailed
}

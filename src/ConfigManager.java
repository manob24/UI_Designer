import java.util.HashMap;

public interface ConfigManager {
    HashMap<String, String> nextItem();
    Boolean hasMoreItems();
}

import java.util.HashMap;

public interface Reader26 {
    HashMap<String, String> nextObject();
    Boolean hasNextObject();
    String getObjectType();
}
//There are two types of reader i.e. ConfigFile Reader and XML Reader
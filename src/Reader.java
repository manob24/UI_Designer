import java.util.HashMap;

public interface Reader {
    HashMap<String, String> nextObject();
    Boolean hasNextObject();
}

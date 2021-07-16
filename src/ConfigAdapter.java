import java.util.HashMap;

public class ConfigAdapter implements ConfigManager{
    Reader reader;
    ConfigAdapter(Reader reader){
        this.reader = reader;
    }
    @Override
    public HashMap<String, String> nextItem() {
        return reader.nextObject();
    }

    @Override
    public Boolean hasMoreItems() {
        return reader.hasNextObject();
    }
}

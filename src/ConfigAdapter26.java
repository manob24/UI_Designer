/* This class adapts a reader class to a configManager */

import java.util.HashMap;

public class ConfigAdapter26 implements ConfigManager26 {
    Reader26 reader;
    ConfigAdapter26(Reader26 reader){
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

    @Override
    public String getItemType() {
        return reader.getObjectType();
    }
}

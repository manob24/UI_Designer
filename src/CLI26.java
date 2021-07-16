import java.util.Scanner;

public class CLI26 {
    ConfigManager26 configManager = null;
    Reader26 reader = null;
    WindowManager windowManager;
    void execute(){
        System.out.println("Enter the path of the file");
        Scanner scn = new Scanner(System.in);
        String fileName = scn.nextLine();
        String type = extractFileType(fileName);
        if(type.equals("xml")){
            reader = new XMLReader26(fileName);
        }else if(type.equals("conf")){
            reader = new ConfigFileReader26(fileName);
        }else{
            System.out.println("File is not supported");
            return;
        }
        configManager = new ConfigAdapter26(reader);
        String itemType = configManager.getItemType();
        if(itemType.equals("simple")){
            windowManager = new WindowManager(SimplisticDesign26.getInstance());
        }else {
            windowManager = new WindowManager(DetailedDesign26.getInstance());
        }
        windowManager.loadUI(configManager);
    }

    String extractFileType(String fileName){
        String[] splitName = fileName.split("\\.");
        return splitName[splitName.length-1];
    }
}

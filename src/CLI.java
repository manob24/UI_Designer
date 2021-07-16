import java.util.Scanner;

public class CLI {
    ConfigManager configManager = null;
    Reader reader = null;
    WindowManager windowManager;
    void execute(){
        System.out.println("Enter the path of the file");
        Scanner scn = new Scanner(System.in);
        String fileName = scn.nextLine();
        String type = extractFileType(fileName);
        if(type.equals("xml")){
            reader = new XMLReader(fileName);
        }else if(type.equals("conf")){
            reader = new ConfigFileReader(fileName);
        }else{
            System.out.println("File is not supported");
            return;
        }
        configManager = new ConfigAdapter(reader);
        windowManager = new WindowManager();
        windowManager.loadUI(configManager);
    }

    String extractFileType(String fileName){
        String[] splitName = fileName.split("\\.");
        return splitName[splitName.length-1];
    }
}

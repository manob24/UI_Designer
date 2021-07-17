import java.util.Scanner;

public class CLI26 {
    ConfigManager26 configManager = null;
    Reader26 reader = null;
    WindowManager windowManager;
    void execute(){
        System.out.println("Enter the path of the file");
        Scanner scn = new Scanner(System.in);
        String fileName = scn.nextLine();
        String type = extractFileType(fileName);            //extracting file type from file name
        if(type.equals("xml")){
            reader = new XMLReader26(fileName);
        }else if(type.equals("conf")){
            reader = new ConfigFileReader26(fileName);
        }else{
            System.out.println("File is not supported");
            return;
        }
        configManager = new ConfigAdapter26(reader);
        String itemType = configManager.getItemType();      //whether the input file contains simple or detailed objects
        if(itemType.equals("simple")){
            windowManager = new WindowManager(SimplisticDesign26.getInstance());
        }else {
            windowManager = new WindowManager(DetailedDesign26.getInstance());
        }
        windowManager.loadUI(configManager);                //load the UI
    }

    String extractFileType(String fileName){
        //for extracting file type -- first split using '.' and last element of array is the file type
        String[] splitName = fileName.split("\\.");
        return splitName[splitName.length-1];
    }
}

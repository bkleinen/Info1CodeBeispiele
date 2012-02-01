import java.util.*;
public class AboutSwitch
{
    static  boolean shouldRun = true;
  
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        while(shouldRun){
       
            /*
            String command = scanner.nextLine();
            switch (command){
                case "print": 
                result = print();
                break;
                case "help": 
                result = help();
                break;
                case "bye": 
                result = bye();

                break;
                default:
                result = "Command not known";
            }
            
           System.out.println(result);
           */
        }

    }

    private static String print(){
        return "PRINTING";
    }

    private static String help(){
        return "HELPING";
    }

    private static String bye(){
        shouldRun = false;
        return "Bye!";
    }
}

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
                print();
                break;
                case "help": 
                help();
                break;
                case "bye": 
                bye();

                break;
                default:
                System.out.println("Command not known");
            }
            */
        }

    }

    private static void print(){
        System.out.println("PRINTING");
    }

    private static void help(){
        System.out.println("HELPING");
    }

    private static void bye(){
        System.out.println("Bye!");
        shouldRun = false;}
}

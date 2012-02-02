import java.util.*;
public class AboutSwitch
{
    boolean shouldRun = true;

    Scanner scanner = new Scanner(System.in);
    HashMap<String,Command> commandMap = new HashMap<String,Command>();
    public static final int RUN_ID = 4;
    public AboutSwitch(){
        addCommand(new Print("print"));
        addCommand(new Command("help"){
                String handle(){ return "HELPING";}});
        addCommand(new Command("bye"){String handle(){return bye();}});
 

    }
    private void addCommand(Command command){
        commandMap.put(command.commandString,command);
    }
    public static void main(String[] args){
        AboutSwitch aboutSwitch = new AboutSwitch();
        aboutSwitch.dorun();
    }

    private Command getCommand(String commandString){
        Command command = commandMap.get(commandString);
        if (command == null)
            return new Command("dummy"){String handle(){return "Command not found";}};
        else
            return command;

    }

    public void dorun(){

        while(shouldRun){
            System.out.print(">");
            String command = scanner.nextLine();
            String result = getCommand(command).handle();
            System.out.println(result);

        }

    }

    private  String print(){
        return "PRINTING";
    }

    private  String help(){
        return "HELPING";
    }

    private  String run(){
        return "I'm RUNNING";
    }

    private String bye(){
        shouldRun = false;
        return "Bye!";
    }

    abstract class Command{
        String commandString;
        boolean shouldContinue;
        public Command(String commandString){
            this.commandString = commandString;
        }

        abstract String handle();

    }
    class Print extends Command{
        public Print(String commandString){
            super(commandString);
        }

        String handle(){
            return "PRINTING";
        }
    }

}

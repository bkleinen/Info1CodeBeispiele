import java.util.Scanner;
public class AboutExceptions
{
    public  String aMethod(String parameter) throws Exception {
        if ((parameter == null) || "".equals(parameter) || "nix".equals(parameter)){
            throw new Exception("I can't process this parameter: "+parameter);
        }
        return parameter + "changed";

    }

    private String method2(String p)throws Exception {
        return "method2 "+aMethod(p);
    }

    private String method1(String p)throws Exception {
        return "method1 "+method2(p);
    }

    public void  methodInteractingWithUser(){
        boolean shouldRun = true;
        System.out.println("Welcome to AboutExceptions");
        Scanner input = new Scanner(System.in);
        while(shouldRun){
            
            try{
                
                System.out.print("> ");
                String command = input.nextLine();
                System.out.println("result: "+method1(command));
            } catch (Exception e){
                System.out.println("Exception caught: "+e);
                //e.printStackTrace();
            }}
    }

    public static void main(String[] args){
        AboutExceptions instance = new AboutExceptions();
        instance.methodInteractingWithUser();
    }
}


/**
 * Write a description of class AboutAutoboxing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AboutAutoboxing
{
    public static void main(){

        main(new String[0]);
    }

    public static void main(String[] args){

        Integer anInteger;
        anInteger = 4;
        System.out.println("Integer: "+anInteger);
        int i = 5;
     
    }

    public static void hello(Integer x){
        System.out.println("Integer: "+x);
    }

    public static void hello(long x){
        System.out.println("long: "+x);
    }
    


}

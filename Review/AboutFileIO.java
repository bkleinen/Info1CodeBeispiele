import java.io.*;
public class AboutFileIO
{
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("aboutfiles.txt");
            
            writer.write("erste Zeile\n");
            writer.write("zweite Zeile\n");
            writer.close();
            writer.write("dritte Zeile\n");
            
        } catch(IOException e){
            System.out.println("Caught: "+e);
        }

    }

}


import java.io.File;


public class Printer {
    
    public static void print(File[] files , String indent){

        if(files == null){}
        else{
            for (File file : files) {
                file.list();
                if(file.isDirectory())
                {System.out.println("+");}
                else
                {System.out.println("+");}
                
                }
            }
        }
        
    }
    
}

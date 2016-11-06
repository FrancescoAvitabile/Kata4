
package kata4;

import java.io.File;


public class Kata4 {

    
    public static void main(String[] args) {
   
        String names[] = {""};
        File file = new File("C:");
        
        names = file.list();
        
        for (String name : names) {
            System.out.println(name);
        }
        
        
        
        
        
    }
    
}

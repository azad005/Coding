import java.io.*;

public class A {
    public static void main(String[] args) {
        
            
            FileWriter fw = new FileWriter("abc.txt");
            fw.write("Hello All");
            fw.close();
        
    }
}
            
            FileReader fr = new FileReader("abc.txt");
            int i;
            while ((i = fr.read()) != -1) 
                System.out.println((char) i);
            
            fr.close();
}
}

    
    


import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            
            ServerSocket ss = new ServerSocket(1155); 
            System.out.println("Server is running and waiting for client...");
            
            
            Socket s = ss.accept(); 
            System.out.println("Client connected!");
            
            
            String str = "Hello World";
            
     
            OutputStream os = s.getOutputStream(); 
            PrintStream ps = new PrintStream(os);
            ps.print(str); 
            ps.close();
            
           
            s.close();
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

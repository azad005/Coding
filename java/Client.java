import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            
            Socket s = new Socket("localhost", 1155);
            
          
            InputStream is = s.getInputStream();
            
          
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            
         
            String response;
            while ((response = br.readLine()) != null) {
                System.out.println(response);
            }
            
           
            br.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

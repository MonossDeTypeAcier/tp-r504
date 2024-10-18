import java.io.*;
import java.net.*;
public class ServeurTCP3 {
    public static void main( String[] args )
    {
        try{
            ServerSocket socketserver = new ServerSocket(2016);
            System.out.println("Serveur en attente");
            while (true) {
                
            
                
                Socket socket =socketserver.accept();
                System.out.println("Connection d'un client");
                DataInputStream dIn =new DataInputStream(socket.getInputStream());
                String msg= dIn.readUTF();
                System.out.println("Message: "+ msg); 
                System.out.println("1");
                String rev = new StringBuilder(msg).reverse().toString();
                System.out.println("2");
                System.out.println("Message: "+ rev);
                DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
                dOut.writeUTF(rev);
                socket.close();
            }
            
                   
        }
        catch (Exception ex)
        {System.out.println("Erreur");}
    }
}

package gvvghost.javaapp2;
import java.net.*;
import java.util.*;
import java.io.*;

public class JavaApp2
{
    public static void main(String[] args)
    {
        try
        {
            Socket clientSocket = new Socket("192.168.0.100" , 5555);
            InputStream inputStream = clientSocket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            String messege = dataInputStream.readUTF();
            System.out.println(messege);
            dataInputStream.close();
            inputStream.close();
            clientSocket.close();
        }
        catch (ConnectException e)
        {
            System.out.println("Cannot connect!");
        }
        catch (IOException e)
        {}
    }
}

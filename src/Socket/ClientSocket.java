package Socket;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket {
    private final static String hostname = "localhost";
    private final static int port = 1234;

    public static void SendhelloToServer(String Name){
        try (Socket socket = new Socket(hostname, port)) {
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            writer.println("Hello, Server! I'm " +  Name);

            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String response = reader.readLine();
            System.out.println("Received from server: " + response);

        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}

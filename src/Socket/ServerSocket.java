package Socket;

import java.io.*;
import java.net.Socket;

public class ServerSocket {

    public static void ListenToClients(){
        int port = 1234;
        try (java.net.ServerSocket serverSocket = new java.net.ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            String message = reader.readLine();
            System.out.println("Received from client: " + message);

            writer.println("Hello from server! You said: " + message);

            socket.close();
        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}

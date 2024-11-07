package Socket;

import Session1.ArrowSwitch;
import Session1.BankAccount;
import lib.Myprintln;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDateTime;

class ClientHandler extends Thread {
    private final Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try (BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true)) {

            String command;
            while ((command = input.readLine()) != null) {
                System.out.println("Received command: " + command);

                // Call different functions based on the command
                String response = processCommand(command);
                output.println(response);

                if ("EXIT".equalsIgnoreCase(command)) {
                    System.out.println("Client disconnected.");
                    break;
                }
            }
        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    private String processCommand(String command) {
        switch (command.toUpperCase()) {
            case "ARROWSWITCH":
                ArrowSwitch As = new ArrowSwitch();
                return As.detect_gender("ali");
            case "BANKACCOUNT":
                BankAccount bk = new BankAccount(5660.0);
                bk.deposit(25.5);
                bk.withdraw(25.5);
                Myprintln.println(bk.info());
                return bk.info();
            case "EXIT":
                return "Goodbye!";
            default:
                return "Unknown command";
        }
    }
}
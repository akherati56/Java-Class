package App;

import Interface.MGraphic;
import View.Client.Desktop;

public class Client {
    private static MGraphic g;

    public Client() {
        Thread graphicThread = new Thread(() -> {
            g = new Desktop();
        });
        graphicThread.start();
    }

    public static void main(String[] args) {
        Client client = new Client();
    }
}

package App;

import GUI.Client.Graphic;

public class Client {
    private static Graphic g;
    private final int width = 400, height = 300;

    public Client(){
        Thread graphicThread = new Thread(() -> {
            g = new Graphic(width, height);
        });
        graphicThread.start();
    }

    public static void main(String[] args) {
        Client client = new Client();
    }
}

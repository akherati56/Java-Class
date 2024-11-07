package Session2_1;

import javax.swing.*;

public class Graphic {

    private static int width, height;

    public Graphic(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public Graphic() {
        this.height = 300;
        this.width = 400;
    }

    public void CreateWindow() {
        // Create the main frame (window)
        JFrame frame = new JFrame("My Java GUI App");
        frame.setSize(this.width , this.height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);

    }
}

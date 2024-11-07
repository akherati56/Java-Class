package GUI.Client;

import GUI.Client.Interface.GInterface;
import GUI.Client.Session1.TestSocket;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Graphic {

    private int width, height;
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JButton sendMessageToServerButton;
    private JFrame frame;
    private ArrayList<JFrame> window;

    public Graphic(int width, int height) {
        this.width = width;
        this.height = height;

        frame = new JFrame();
        init();

        sendMessageToServerButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                TestSocket exerciseWindow = new TestSocket();
                NewWindow(exerciseWindow);
            }
        });
    }

    public JFrame NewWindow(GInterface gInterface){
        JFrame window = new JFrame();
        window.setContentPane(gInterface.getMainPanel());
        window.setLocationRelativeTo(null);
        window.pack();
        window.setVisible(true);
        return window;
    }

    public void init(){
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

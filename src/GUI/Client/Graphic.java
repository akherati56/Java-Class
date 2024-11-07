package GUI.Client;

import GUI.Client.Interface.GInterface;
import GUI.Client.Session1.TestSocket;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graphic {

    private final int width;
    private final int height;
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JButton sendMessageToServerButton;
    private JTextArea mainCommandsARROWSWITCHBANKACCOUNTTextArea;
    private final JFrame frame;
    private ArrayList<JFrame> window;
    private final Map<JButton, GInterface> Listeners = new HashMap<>();

    public Graphic(int width, int height) {
        this.width = width;
        this.height = height;

        frame = new JFrame();
        init();

        // Create hashmap to store button and related window
        mapButtonListeners();

        // bind button and window by listener
        RunListeners();
    }

    public void mapButtonListeners(){
        TestSocket exerciseWindow = new TestSocket();
        Listeners.put(sendMessageToServerButton, exerciseWindow);
    }

    public void RunListeners(){
        for (Map.Entry<JButton, GInterface> entry : Listeners.entrySet()){
            JButton jButton = entry.getKey();
            GInterface gInterface = entry.getValue();

            jButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    NewWindow(gInterface);
                }
            });
        }
    }

    public void NewWindow(GInterface gInterface){
        JFrame window = new JFrame();
        window.setContentPane(gInterface.getMainPanel());
        window.setLocationRelativeTo(null);
        window.pack();
        window.setVisible(true);
    }

    public void init(){
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

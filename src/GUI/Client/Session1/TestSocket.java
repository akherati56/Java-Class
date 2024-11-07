package GUI.Client.Session1;

import Socket.ClientSocket;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TestSocket {
    private JPanel panel1;
    private JButton button1;
    private JTextField Name;
    private JTabbedPane tabbedPane1;

    public TestSocket() {
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Thread serverThread = new Thread(() -> {
                    ClientSocket.SendhelloToServer(Name.getText());
                });
                serverThread.start();
            }
        });
    }

    public JPanel getMainPanel() {
        return panel1;
    }

}

package View.Client.Session1;

import Interface.GInterface;
import Socket.ClientSocket;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TestSocket implements GInterface {
    private JPanel panel1;
    private JButton button1;
    private JTextField Command;
    private JTabbedPane tabbedPane1;
    private JTextArea result;

    public TestSocket() {
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Thread serverThread = new Thread(() -> {
                    result.setText(ClientSocket.SendCommand(Command.getText()));
                });
                serverThread.start();
            }
        });
    }

    public JPanel getMainPanel() {
        return panel1;
    }

}

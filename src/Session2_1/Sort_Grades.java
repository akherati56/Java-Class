package Session2_1;

import Session1.Grade;
import lib.Myprintln;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sort_Grades {
    private JPanel panel1;
    private JButton button1;

    public Sort_Grades() {
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                // Convert Grades from 0-100 format into A-F format
                Grade g = new Grade();
                Myprintln.println(g.convert_grades(99));

                System.out.println(e.getX());
            }
        });
    }

    public JPanel getMainPanel() {
        return panel1;
    }

}

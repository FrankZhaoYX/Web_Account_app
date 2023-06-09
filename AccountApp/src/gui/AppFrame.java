package gui;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class AppFrame {
    public static void main(String[] args) {
        // Inital Canvas of APP
        JFrame f = new JFrame();
        f.setSize(500, 450);
        f.setTitle("Personal Account App");
        // set the features of App
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Inital the button of App
        JToolBar tb = new JToolBar();
        JButton bSpend = new JButton("Overall");
        JButton bRecord = new JButton("Add");
        JButton bCategory = new JButton("Category");
        JButton bReport = new JButton("Monthly Report");
        JButton bConfig = new JButton("Setting");
        JButton bBackup = new JButton("Backup");
        JButton bRecover = new JButton("Recovery");

        tb.add(bSpend);
        tb.add(bRecord);
        tb.add(bCategory);
        tb.add(bReport);
        tb.add(bConfig);
        tb.add(bBackup);
        tb.add(bRecover);
        f.setLayout(new BorderLayout());
        f.add(tb, BorderLayout.NORTH);
        f.add(new JPanel(), BorderLayout.CENTER);

        f.setVisible(true);

        bSpend.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        bRecord.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        bCategory.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        bConfig.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        bBackup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        bRecover.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}

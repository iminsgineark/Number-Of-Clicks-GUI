package com.JAVA_DSA;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NumberOfClicks_GUI implements ActionListener {
    int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    public NumberOfClicks_GUI(){
        JFrame frame = new JFrame();
        frame.setSize(700,500);
        JButton button = new JButton("Click Here");
        button.addActionListener(this);
         label = new JLabel("Number Of Clicks : 0");
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100,100,10,100));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);
        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("CLick Counter With GUI");
        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new NumberOfClicks_GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number Of Clicks : " + count);
        System.out.println(e);
    }
}


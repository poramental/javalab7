import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame  {
    JFrame frame =new JFrame("Графические интерфейсы");

    JButton button = new JButton("Задание 1");
    JButton button1 = new JButton("Задание 2");
    JButton button2 = new JButton("Задание 3");
    JButton button3 = new JButton("Задание 4");
    JLabel label = new JLabel("Графические интерфейсы");

    Main(){
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        label.setBounds(370,150,800,100);
        label.setFont(new Font("Verdana", Font.TYPE1_FONT, 50));
        frame.add(label);


        button.setBounds(500,300,500,100);
        button.setBackground(new Color(223, 227, 215));
        button.setFont(new Font("Verdana", Font.TYPE1_FONT, 50));
        frame.add(button);

        button1.setBounds(500,410,500,100);
        button1.setBackground(new Color(223, 227, 215));
        button1.setFont(new Font("Verdana", Font.TYPE1_FONT, 50));
        frame.add(button1);

        button2.setBounds(500,520,500,100);
        button2.setBackground(new Color(223, 227, 215));
        button2.setFont(new Font("Verdana", Font.TYPE1_FONT, 50));
        frame.add(button2);

        button3.setBounds(500,630,500,100);
        button3.setBackground(new Color(223, 227, 215));
        button3.setFont(new Font("Verdana", Font.TYPE1_FONT, 50));
        frame.add(button3);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new lab1();
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new lab2();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new lab3();
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new lab4();
            }
        });

    }


    public static void main(String[] args) {
        new Main();

    }


}
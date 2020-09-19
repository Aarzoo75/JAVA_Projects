package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

public class calculator implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextArea textarea = new JTextArea(2, 18); //2 10

    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    JButton button9 = new JButton();
    JButton button0 = new JButton();

    JButton buttonadd = new JButton();
    JButton buttonsub = new JButton();
    JButton buttonmul = new JButton();
    JButton buttondiv = new JButton();
    JButton buttonclear = new JButton();
    JButton buttondot = new JButton();
    JButton buttonequal = new JButton();

    double number1, number2, result;
    int addc = 0, mulc = 0;
    int divc = 0, subc = 0;

    public calculator(){
        frame.setSize(600,800); //340 450
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Aarzoo's calculator");

        //frame.setResizable(false);

        frame.add(panel);
        panel.setBackground(Color.white);
        Border border = BorderFactory.createLineBorder(Color.RED,4);

        panel.add(textarea);

        textarea.setBackground(Color.BLACK);
        Border tborder = BorderFactory.createLineBorder(Color.white, 3);
        textarea.setBorder(tborder);
        Font font = new Font("arial", Font.BOLD, 33);
        textarea.setFont(font);
        textarea.setForeground(Color.WHITE);

        textarea.setPreferredSize(new Dimension(2, 10));
        textarea.setLineWrap(true);

        button1.setPreferredSize(new Dimension(142, 143));
        button1.setIcon(new ImageIcon("C:\\Users\\NFPC\\Downloads\\button 1.png"));

        button2.setPreferredSize(new Dimension(133, 134));
        button2.setIcon(new ImageIcon("C:\\Users\\NFPC\\Downloads\\button 2.png"));

        button3.setPreferredSize(new Dimension(133, 131));
        button3.setIcon(new ImageIcon("C:\\Users\\NFPC\\Downloads\\button 3.png"));

        button4.setPreferredSize(new Dimension(132, 130));
        button4.setIcon(new ImageIcon("C:\\Users\\NFPC\\Downloads\\button 4.png"));

        button5.setPreferredSize(new Dimension(134, 128));
        button5.setIcon(new ImageIcon("C:\\Users\\NFPC\\Downloads\\button 5.png"));

        button6.setPreferredSize(new Dimension(132, 128));
        button6.setIcon(new ImageIcon("C:\\Users\\NFPC\\Downloads\\button 6.png"));

        button7.setPreferredSize(new Dimension(132, 128));
        button7.setIcon(new ImageIcon("C:\\Users\\NFPC\\Downloads\\button 7.png"));

        button8.setPreferredSize(new Dimension(133, 128));
        button8.setIcon(new ImageIcon("C:\\Users\\NFPC\\Downloads\\button 8.png"));

        button9.setPreferredSize(new Dimension(132, 128));
        button9.setIcon(new ImageIcon("C:\\Users\\NFPC\\Downloads\\button 9.png"));

        button0.setPreferredSize(new Dimension(131, 127));
        button0.setIcon(new ImageIcon("C:\\Users\\NFPC\\Downloads\\button 0.png"));

        buttondot.setPreferredSize(new Dimension( 132, 128));
        buttondot.setIcon(new ImageIcon("C:\\Users\\NFPC\\Downloads\\button dot.png"));

        buttonsub.setPreferredSize(new Dimension(135, 130));
        buttonsub.setIcon(new ImageIcon("C:\\Users\\NFPC\\Downloads\\button sub.png"));

        buttonmul.setPreferredSize(new Dimension(135, 132));
        buttonmul.setIcon(new ImageIcon("C:\\Users\\NFPC\\Downloads\\button mul.png"));

        buttondiv.setPreferredSize(new Dimension(135, 133));
        buttondiv.setIcon(new ImageIcon("C:\\Users\\NFPC\\Downloads\\button div.png"));

        buttonadd.setPreferredSize(new Dimension(133, 127));
        buttonadd.setIcon(new ImageIcon("C:\\Users\\NFPC\\Downloads\\button add.png"));

        buttonclear.setPreferredSize(new Dimension(130, 126));
        buttonclear.setIcon(new ImageIcon("C:\\Users\\NFPC\\Downloads\\button clear.png"));

        buttonequal.setPreferredSize(new Dimension(130, 125));
        buttonequal.setIcon(new ImageIcon("C:\\Users\\NFPC\\Downloads\\button equal.png"));

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button0);
        panel.add(buttondot);
        panel.add(buttonsub);
        panel.add(buttonmul);
        panel.add(buttondiv);
        panel.add(buttonadd);
        panel.add(buttonequal);
        panel.add(buttonclear);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener((ActionListener) this);
        button6.addActionListener((ActionListener) this);
        button7.addActionListener((ActionListener) this);
        button8.addActionListener((ActionListener) this);
        button9.addActionListener((ActionListener) this);
        button0.addActionListener((ActionListener) this);
        buttondot.addActionListener((ActionListener) this);
        buttonadd.addActionListener((ActionListener) this);
        buttonsub.addActionListener((ActionListener) this);
        buttonmul.addActionListener((ActionListener) this);
        buttondiv.addActionListener((ActionListener) this);
        buttonclear.addActionListener((ActionListener) this);
        buttonequal.addActionListener((ActionListener) this);

    }

    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if (source == buttonclear)
        {
            number1 = 0.0;
            number2 = 0.0;
            textarea.setText("");
        }
        if (source == button1)
        {
            textarea.append("1");
        }
        if (source == button2)
        {
            textarea.append("2");
        }
        if (source == button3)
        {
            textarea.append("3");
        }
        if (source == button4)
        {
            textarea.append("4");
        }
        if (source == button5)
        {
            textarea.append("5");
        }
        if (source == button6)
        {
            textarea.append("6");
        }
        if (source == button7)
        {
            textarea.append("7");
        }
        if (source == button8)
        {
            textarea.append("8");
        }
        if (source == button9)
        {
            textarea.append("9");
        }
        if (source == button0)
        {
            textarea.append("0");
        }
        if (source == buttondot)
        {
            textarea.append(".");
        }
        if (source == buttonadd)
        {
            number1 = number_reader();
            textarea.setText("+");
            addc = 1;
            divc = 0;
            subc = 0;
            mulc = 0;
        }
        if (source == buttondiv)
        {
            number1 = number_reader();
            textarea.setText("");
            addc = 0;
            divc = 1;
            subc = 0;
            mulc = 0;
        }
        if (source == buttonsub)
        {
            number1 = number_reader();
            textarea.setText("");
            addc = 0;
            divc = 0;
            subc = 1;
            mulc = 0;
        }
        if (source == buttonmul)
        {
            number1 = number_reader();
            textarea.setText("");
            addc = 0;
            divc = 0;
            subc = 0;
            mulc = 1;
        }
        if (source == buttonequal)
        {
            number2 = number_reader();
            textarea.setText("");
            if (addc > 0)
            {
                result = number1 + number2;
                textarea.setText(Double.toString(result));
            }
            if (subc > 0)
            {
                result = number1 - number2;
                textarea.setText(Double.toString(result));
            }
            if (mulc > 0)
            {
                result = number1 * number2;
                textarea.setText(Double.toString(result));
            }
            if (divc > 0)
            {
                result = number1 / number2;
                textarea.setText(Double.toString(result));
            }
        }
    }

    public double number_reader(){
        double num1;
        String s;
        s = textarea.getText();
        num1 = Double.parseDouble(s);
        return num1;
    }

    public static void main(String[] args) {
        calculator cals = new calculator();
    }

}

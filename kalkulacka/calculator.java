package kalkulacka;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton add, sub, mul, div, equ, dec, clr, del;
    JPanel panel;

    Font font = new Font("Monospaced", Font.BOLD, 30);

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    calculator(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(null);
        frame.setResizable(false);

        textField = new JTextField();
        textField.setBounds(50,25, 300, 50);
        textField.setFont(new Font("Monospaced", Font.BOLD, 40));
        textField.setForeground(Color.WHITE);
        textField.setEditable(false);
        textField.setBackground(Color.black);
        textField.setBorder(javax.swing.BorderFactory.createEmptyBorder());

        add = new JButton("+");
        sub = new JButton("-");
        equ = new JButton("=");
        mul = new JButton("*");
        div = new JButton("/");
        clr = new JButton("Clear");
        del = new JButton("Delete");
        dec = new JButton(".");

        functionButtons[0] = add;
        functionButtons[1] = sub;
        functionButtons[2] = mul;
        functionButtons[3] = div;
        functionButtons[4] = dec;
        functionButtons[5] = equ;
        functionButtons[6] = del;
        functionButtons[7] = clr;

        for (int i = 0; i < 8; i++){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(font);
            functionButtons[i].setFocusable(false);
            functionButtons[i].setBackground(new Color(255, 171, 0));
            functionButtons[i].setForeground(Color.WHITE);
            functionButtons[i].setBorder(javax.swing.BorderFactory.createEmptyBorder());
        }

        for (int i = 0; i < 10; i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(font);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setBackground(Color.DARK_GRAY);
            numberButtons[i].setForeground(Color.WHITE);
            numberButtons[i].setBorder(javax.swing.BorderFactory.createEmptyBorder());
        }

        del.setBounds(50, 430, 145, 50);
        clr.setBounds(205, 430, 145, 50);

        panel = new JPanel();
        panel.setBounds(50, 100 ,300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(Color.BLACK);

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(add);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(sub);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mul);
        panel.add(dec);
        panel.add(numberButtons[0]);
        panel.add(equ);
        panel.add(div);

        frame.add(panel);
        frame.add(del);
        frame.add(clr);
        frame.add(textField);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++){
            if(e.getSource() == numberButtons[i]){
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == dec){
            textField.setText(textField.getText().concat("."));
        }

        if (e.getSource() == add){
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }

        if (e.getSource() == sub){
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }

        if (e.getSource() == mul){
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }

        if (e.getSource() == div){
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }

        if (e.getSource() == equ){
            num2 = Double.parseDouble(textField.getText());
            switch (operator){

                case '+': result = num1 + num2;
                    textField.setText(String.valueOf(result));
                break;
                case '-': result = num1 - num2;
                    textField.setText(String.valueOf(result));
                break;
                case '*': result = num1 * num2;
                    textField.setText(String.valueOf(result));
                break;
                case '/':
                    if (num2 == 0.0)
                    {
                        textField.setText("Cant divide by zero");
                        break;
                    }
                    result = num1 / num2;
                    textField.setText(String.valueOf(result));
                break;
            }
            num1 = result;
        }

        if (e.getSource() == clr){
            textField.setText("");
        }

        if (e.getSource() == del){
            String temp = textField.getText();
            temp = temp.substring(0, temp.length()-1);
            textField.setText(temp);
        }
    }
}

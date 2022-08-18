package com.codebind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    private JTextField ResultText;
    private JButton ACButton;
    private JButton Button5;
    private JButton Button4;
    private JButton ReduceButton;
    private JButton Button7;
    private JButton Button8;
    private JButton PercentButton;
    private JButton Button9;
    private JButton Button6;
    private JButton DivideButton;
    private JButton MultiplyButton;
    private JButton MinusButton;
    private JButton Button1;
    private JButton Button2;
    private JButton Button3;
    private JButton PlusButton;
    private JButton RefreshButton;
    private JButton Button0;
    private JButton button19;
    private JButton EqualsButton;
    private JPanel DotButton;
    String s1;
    String s2;
    String res;
    double ds1;
    double ds2;
    double dres;
    boolean operationStarted = false;
    char operation;
  //  char operation;
    public App() {


        EqualsButton.setEnabled(false);
        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(ResultText.getText().startsWith("0") && operationStarted == false)
                    s1 = ResultText.getText().substring(1) + Button1.getText();
                else if (ResultText.getText().startsWith("0") && operationStarted == true) {
                    ResultText.setText("");
                    s2 = ResultText.getText().substring(1) + Button1.getText();
                }
                else if (!(ResultText.getText().startsWith("0")) && operationStarted == false)
                    s1 = ResultText.getText() + Button1.getText();
                else if (!(ResultText.getText().startsWith("0")) && operationStarted == true) {
                    ResultText.setText("");
                    s2 = ResultText.getText() + Button1.getText();
                }
                ResultText.setText(s1);




            }
        });
        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ResultText.getText().startsWith("0") && operationStarted == false) {
                    s1 = ResultText.getText().substring(1) + Button2.getText();
                    ResultText.setText(s1);
                }
                else if (ResultText.getText().startsWith("0") && operationStarted == true) {
                    ResultText.setText("");
                    s2 = ResultText.getText().substring(1) + Button2.getText();
                    ResultText.setText(s2);
                }
                else if (!(ResultText.getText().startsWith("0")) && operationStarted == false) {
                    s1 = ResultText.getText() + Button2.getText();
                    ResultText.setText(s1);
                }
                else if (!(ResultText.getText().startsWith("0")) && operationStarted == true) {
                    ResultText.setText("");
                    s2 = ResultText.getText() + Button2.getText();
                    ResultText.setText(s2);
                }



            }
        });
        Button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ResultText.getText().startsWith("0") && operationStarted == false) {
                    s1 = ResultText.getText().substring(1) + Button3.getText();
                    ResultText.setText(s1);
                }
                else if (ResultText.getText().startsWith("0") && operationStarted == true) {
                    ResultText.setText("");
                    s2 = ResultText.getText().substring(1) + Button3.getText();
                    ResultText.setText(s2);
                }
                else if (!(ResultText.getText().startsWith("0")) && operationStarted == false) {
                    s1 = ResultText.getText() + Button3.getText();
                    ResultText.setText(s1);
                }
                else if (!(ResultText.getText().startsWith("0")) && operationStarted == true) {
                    ResultText.setText("");
                    s2 = ResultText.getText() + Button3.getText();
                    ResultText.setText(s2);
                }


            }
        });
        Button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ResultText.getText().startsWith("0") && operationStarted == false) {
                    s1 = ResultText.getText().substring(1) + Button4.getText();
                    ResultText.setText(s1);
                }
                else if (ResultText.getText().startsWith("0") && operationStarted == true) {
                    ResultText.setText("");
                    s2 = ResultText.getText().substring(1) + Button4.getText();
                    ResultText.setText(s2);
                }
                else if (!(ResultText.getText().startsWith("0")) && operationStarted == false) {
                    s1 = ResultText.getText() + Button4.getText();
                    ResultText.setText(s1);
                }
                else if (!(ResultText.getText().startsWith("0")) && operationStarted == true) {
                    ResultText.setText("");
                    s2 = ResultText.getText() + Button4.getText();
                    ResultText.setText(s2);
                }


            }
        });
        Button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ResultText.getText().startsWith("0") && operationStarted == false) {
                    s1 = ResultText.getText().substring(1) + Button5.getText();
                    ResultText.setText(s1);
                }
                else if (ResultText.getText().startsWith("0") && operationStarted == true) {
                    ResultText.setText("");
                    s2 = ResultText.getText().substring(1) + Button5.getText();
                    ResultText.setText(s2);
                }
                else if (!(ResultText.getText().startsWith("0")) && operationStarted == false) {
                    s1 = ResultText.getText() + Button5.getText();
                    ResultText.setText(s1);
                }
                else if (!(ResultText.getText().startsWith("0")) && operationStarted == true) {
                    ResultText.setText("");
                    s2 = ResultText.getText() + Button5.getText();
                    ResultText.setText(s2);
                }


            }
        });
        Button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ResultText.getText().startsWith("0") && operationStarted == false) {
                    s1 = ResultText.getText().substring(1) + Button6.getText();
                    ResultText.setText(s1);
                }
                else if (ResultText.getText().startsWith("0") && operationStarted == true) {
                    ResultText.setText("");
                    s2 = ResultText.getText().substring(1) + Button6.getText();
                    ResultText.setText(s2);
                }
                else if (!(ResultText.getText().startsWith("0")) && operationStarted == false) {
                    s1 = ResultText.getText() + Button6.getText();
                    ResultText.setText(s1);
                }
                else if (!(ResultText.getText().startsWith("0")) && operationStarted == true) {
                    ResultText.setText("");
                    s2 = ResultText.getText() + Button6.getText();
                    ResultText.setText(s2);
                }


            }
        });
        Button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ResultText.getText().startsWith("0") && operationStarted == false) {
                    s1 = ResultText.getText().substring(1) + Button7.getText();
                    ResultText.setText(s1);
                }
                else if (ResultText.getText().startsWith("0") && operationStarted == true) {
                    ResultText.setText("");
                    s2 = ResultText.getText().substring(1) + Button7.getText();
                    ResultText.setText(s2);
                }
                else if (!(ResultText.getText().startsWith("0")) && operationStarted == false) {
                    s1 = ResultText.getText() + Button7.getText();
                    ResultText.setText(s1);
                }
                else if (!(ResultText.getText().startsWith("0")) && operationStarted == true) {
                    ResultText.setText("");
                    s2 = ResultText.getText() + Button7.getText();
                    ResultText.setText(s2);
                }


            }
        });
        Button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ResultText.getText().startsWith("0") && operationStarted == false) {
                    s1 = ResultText.getText().substring(1) + Button8.getText();
                    ResultText.setText(s1);
                }
                else if (ResultText.getText().startsWith("0") && operationStarted == true) {
                    ResultText.setText("");
                    s2 = ResultText.getText().substring(1) + Button8.getText();
                    ResultText.setText(s2);
                }
                else if (!(ResultText.getText().startsWith("0")) && operationStarted == false) {
                    s1 = ResultText.getText() + Button8.getText();
                    ResultText.setText(s1);
                }
                else if (!(ResultText.getText().startsWith("0")) && operationStarted == true) {
                    ResultText.setText("");
                    s2 = ResultText.getText() + Button8.getText();
                    ResultText.setText(s2);
                }


            }
        });
        Button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ResultText.getText().startsWith("0") && operationStarted == false) {
                    s1 = ResultText.getText().substring(1) + Button9.getText();
                    ResultText.setText(s1);
                }
                else if (ResultText.getText().startsWith("0") && operationStarted == true) {
                    ResultText.setText("");
                    s2 = ResultText.getText().substring(1) + Button9.getText();
                    ResultText.setText(s2);
                }
                else if (!(ResultText.getText().startsWith("0")) && operationStarted == false) {
                    s1 = ResultText.getText() + Button9.getText();
                    ResultText.setText(s1);
                }
                else if (!(ResultText.getText().startsWith("0")) && operationStarted == true) {
                    ResultText.setText("");
                    s2 = ResultText.getText() + Button9.getText();
                    ResultText.setText(s2);
                }
            }
        });
        Button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ResultText.getText().startsWith("0") && operationStarted == false) {
                    s1 = ResultText.getText().substring(1) + Button0.getText();
                    ResultText.setText(s1);
                }
                else if (ResultText.getText().startsWith("0") && operationStarted == true) {
                    ResultText.setText("");
                    s2 = ResultText.getText().substring(1) + Button0.getText();
                    ResultText.setText(s2);
                }
                else if (!(ResultText.getText().startsWith("0")) && operationStarted == false) {
                    s1 = ResultText.getText() + Button0.getText();
                    ResultText.setText(s1);
                }
                else if (!(ResultText.getText().startsWith("0")) && operationStarted == true) {
                    ResultText.setText("");
                    s2 = ResultText.getText() + Button0.getText();
                    ResultText.setText(s2);
                }


            }
        });
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = "0";
                s2 = "0";
                ResultText.setText(s1);
            }
        });
        PlusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operationStarted = true;
                operation = '+';

                if (operationStarted)
                    ResultText.setText(PlusButton.getText());

                EqualsButton.setEnabled(true);
            }
        });
        MinusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operationStarted = true;
                operation = '-';
                //s1.concat(operation)
                if (operationStarted)
                    ResultText.setText(MinusButton.getText());

                EqualsButton.setEnabled(true);
            }
        });
        MultiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                operation = '*';
                operationStarted = true;

                if(operationStarted)
                    ResultText.setText(MultiplyButton.getText());

                EqualsButton.setEnabled(true);
            }
        });
        DivideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                operation = '/';
                operationStarted = true;

                if(operationStarted)
                    ResultText.setText(DivideButton.getText());

                EqualsButton.setEnabled(true);
            }
        });
        PercentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                operation = '%';
                operationStarted = true;

                if(operationStarted)
                    ResultText.setText(DivideButton.getText());

                EqualsButton.setEnabled(true);
            }
        });
        ReduceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //operation = '-';

                if(operationStarted == false) {
                    //s1.substring();
                    s1 = s1.substring(0,s1.length() - 1);
                    ResultText.setText(s1);
                }
                else {
                    ResultText.setText(s2.substring(0,s2.length() - 1));
                }
            }
        });
        ResultText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();

                if((c > '0' && c < '9') && c != KeyEvent.VK_BACK_SPACE)
                e.consume();
            }
        });
        EqualsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operation) {
                    case '+':
                        ds1 = Double.parseDouble(s1);
                        ds2 = Double.parseDouble(s2);
                        dres = ds1 + ds2;
                        break;
                    case '-':
                        ds1 = Double.parseDouble(s1);
                        ds2 = Double.parseDouble(s2);
                        dres = ds1 - ds2;
                        break;
                    case '*':
                        ds1 = Double.parseDouble(s1);
                        ds2 = Double.parseDouble(s2);
                        dres = ds1 * ds2;
                        break;
                    case '/':
                        ds1 = Double.parseDouble(s1);
                        ds2 = Double.parseDouble(s2);
                        try {
                            dres = ds1 / ds2;
                        }
                        catch (Exception exception)
                        {
                            JOptionPane.showMessageDialog(null,JOptionPane.ERROR_MESSAGE);
                        }

                        break;
                    case '%':
                        ds1 = Integer.parseInt(s1);
                        ds2 = Integer.parseInt(s2);
                        dres = ds1 % ds2;

                        break;

                }
                ResultText.setText(String.valueOf(dres));
                operationStarted = false;
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().DotButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }
}

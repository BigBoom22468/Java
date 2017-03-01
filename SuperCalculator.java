import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SuperCalculator extends JFrame {
    JTextArea display1= new JTextArea();
    JTextArea display2= new JTextArea();
    JTextArea display3= new JTextArea();
    JPanel buttonPanel = new JPanel(new GridLayout(6,3));
    JPanel buttonPanel2 = new JPanel(new GridLayout(2,2));
    //JButton button0 = new JButton("0");
    //JButton button1 = new JButton("1");
    //JButton button2 = new JButton("2");
    //JButton button3 = new JButton("3");
    //JButton button4 = new JButton("4");
    //JButton button5 = new JButton("5");
    //JButton button6 = new JButton("6");
    JButton buttoncos = new JButton("cos");
    JButton buttonsin = new JButton("sin");
    JButton buttone = new JButton("e");
    JButton buttonSum = new JButton("+");
    JButton buttonBack = new JButton("C");
    JButton buttonDivide = new JButton("/");
    JButton buttonSub = new JButton("-");
    JButton buttonMul = new JButton("x");
    JButton buttontan = new JButton( "tan");
    //JButton buttonStart = new JButton("=");
    double firstValue = 0;
    String firstValueS;
    String operation = "+";
    SuperCalculator() {
        setBounds(570, 300, 300, 300);




        buttone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //  int secondValue = Integer.valueOf(display2.getText());
                display1.setText("e");
                //   display1.setText("");
                //  operation = "*";
            }
        });

        buttonsin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValueS = String.valueOf(display1.getText());
                double x;
                if(firstValueS.equals("e")) {
                    x = 2.718281828;
                }
                else {
                    x = new Double(firstValueS);
                }
                double factorial = 1;
                double sin = x;
                double xx = x;
                for(int i = 1; i < 50; i++){
                    xx = xx*x*x;
                    factorial = factorial*2*i*(2*i + 1);
                    if(i%2 == 0){
                        sin += xx/factorial;
                    }
                    else
                    {
                        sin -= xx/factorial;
                    }
                }
                display3.setText(sin +"");
            }
        });

        buttoncos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValueS = String.valueOf(display1.getText());
                double x;
                if(firstValueS.equals("e")) {
                    x = 2.718281828;
                }
                else {
                    x = new Double(firstValueS);
                }
                //firstValue = Double.valueOf(display1.getText());
               // double x = firstValue;
                double factorial = 1;
                double cos = 1;
                double xx = 1;
                for(int i = 1; i < 50; i++){
                    xx = xx*x*x;
                    factorial = factorial*2*i*(2*i - 1);
                    if(i%2 == 0){
                        cos += xx/factorial;
                    }
                    else
                    {
                        cos -= xx/factorial;
                    }
                }

                display3.setText(cos +"");
            }
        });

        buttontan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValueS = String.valueOf(display1.getText());
                double x;
                if(firstValueS.equals("e")) {
                    x = 2.718281828;
                }
                else {
                    x = new Double(firstValueS);
                }
               // firstValue = Double.valueOf(display1.getText());
               // double x = firstValue;
                double tan;
                double factorial = 1;
                double cos = 1;
                double xx = 1;
                for(int i = 1; i < 50; i++){
                    xx = xx*x*x;
                    factorial = factorial*2*i*(2*i - 1);
                    if(i%2 == 0){
                        cos += xx/factorial;
                    }
                    else
                    {
                        cos -= xx/factorial;
                    }
                }
                factorial = 1;
                double sin = x;
                xx = x;
                for(int i = 1; i < 50; i++){
                    xx = xx*x*x;
                    factorial = factorial*2*i*(2*i + 1);
                    if(i%2 == 0){
                        sin += xx/factorial;
                    }
                    else
                    {
                        sin -= xx/factorial;
                    }
                }
                tan = sin/cos;

                display3.setText(tan +"");
            }
        });

        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // String temp = display1.getText();
                // display1.setText(temp.substring(0, temp.length() - 1));
                // display2.setText(temp.substring(0, temp.length() - 1));
                // display3.setText(temp.substring(0, temp.length() - 1));
                display1.setText("");
                display2.setText("");
                display3.setText("");
            }
        });
        buttonSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //firstValue = Double.valueOf(display1.getText());
                firstValueS = String.valueOf(display1.getText());
                //double x;
                if(firstValueS.equals("e")) {
                    firstValue = 2.718281828;
                }
                else {
                    firstValue = new Double(firstValueS);
                }
                double secondValue = Double.valueOf(display2.getText());
                display3.setText((firstValue+secondValue)+"");
                //   display1.setText("");
                operation = "+";
            }
        });
        buttonMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValueS = String.valueOf(display1.getText());
                //double x;
                if(firstValueS.equals("e")) {
                    firstValue = 2.718281828;
                }
                else {
                    firstValue = new Double(firstValueS);
                }
               // firstValue = Double.valueOf(display1.getText());
                double secondValue = Double.valueOf(display2.getText());
                display3.setText((firstValue*secondValue)+"");
                //   display1.setText("");
                operation = "*";
            }
        });


        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValueS = String.valueOf(display1.getText());
                //double x;
                if(firstValueS.equals("e")) {
                    firstValue = 2.718281828;
                }
                else {
                    firstValue = new Double(firstValueS);
                }
                //firstValue = Double.valueOf(display1.getText());
                double secondValue = Double.valueOf(display2.getText());
                display3.setText((firstValue/secondValue)+"");
                //  display1.setText("");
                operation = "/";
            }
        });
        buttonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValueS = String.valueOf(display1.getText());
                //double x;
                if(firstValueS.equals("e")) {
                    firstValue = 2.718281828;
                }
                else {
                    firstValue = new Double(firstValueS);
                }
               // firstValue = Double.valueOf(display1.getText());
                double secondValue = Double.valueOf(display2.getText());
                display3.setText((firstValue-secondValue)+"");
                // display1.setText("");
                operation = "-";
            }
        });
        // buttonStart.addActionListener(new ActionListener() {
        //    @Override
        //    public void actionPerformed(ActionEvent e) {
        //       int secondValue = Integer.valueOf(display2.getText());
        //       if("+".equals(operation)){
        //          display3.setText((firstValue+secondValue)+"");
        //       }
        //      if("-".equals(operation)){
        //          display3.setText((firstValue-secondValue)+"");
        //       }
        //       if("*".equals(operation)){
        //           display3.setText((firstValue*secondValue)+"");
        //       }
        //       if("/".equals(operation)){
        //           display3.setText((firstValue/secondValue)+"");
        //       }
        //      firstValue = 0;
        //       operation = "+";
        //   }
        // });
        setLayout(new BorderLayout());
        //add(display1, BorderLayout.NORTH);
        //add(display2, BorderLayout.);
        // add(display2);
        add(buttonPanel2, BorderLayout.NORTH);
        add(buttonPanel,BorderLayout.CENTER);
        // add(buttonStart,BorderLayout.SOUTH);
        //buttonPanel.add(display2);
        buttonPanel2.add(display1);
        buttonPanel2.add(display2);
        //buttonPanel.add(button3);
        //buttonPanel.add(button4);
        //buttonPanel.add(button5);
        //buttonPanel.add(button6);
        //buttonPanel.add(button7);
        //buttonPanel.add(button8);
        buttonPanel.add(buttone);
        buttonPanel.add(buttonsin);
        buttonPanel.add(buttoncos);
        buttonPanel.add(buttonSum);
        buttonPanel.add(buttonSub);
        buttonPanel.add(buttonMul);
        buttonPanel.add(buttonBack);
        buttonPanel.add(buttonDivide);
        buttonPanel.add(display3);
        buttonPanel.add(buttontan);

        setVisible(true);
    }

    public static void main(String[] args) {
        new SuperCalculator();
    }
}


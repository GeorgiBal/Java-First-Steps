import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    private double total1 = 0;
    private double total2 = 0;
    private char math_operator;

    private JPanel JavaCalculator;
    private JTextField textDisplay;
    private JButton btnEquals;
    private JButton btnMultiply;
    private JButton btn2;
    private JButton btn3;
    private JButton btn5;
    private JButton btn8;
    private JButton btnPoint;
    private JButton btnPlus;
    private JButton btn6;
    private JButton btn9;
    private JButton btnClear;
    private JButton btnMinus;
    private JButton btnDivide;
    private JButton btn1;
    private JButton btn4;
    private JButton btn7;
    private JButton btn0;

    private void getOperator(String btnText){
        math_operator = btnText.charAt(0);
        total1 += Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
    }

    public Calculator() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn1Text = textDisplay.getText() + btn1.getText();
                textDisplay.setText(btn1Text);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn2Text = textDisplay.getText() + btn2.getText();
                textDisplay.setText(btn2Text);

            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn3Text = textDisplay.getText() + btn3.getText();
                textDisplay.setText(btn3Text);

            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn4Text = textDisplay.getText() + btn4.getText();
                textDisplay.setText(btn4Text);

            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn5Text = textDisplay.getText() + btn5.getText();
                textDisplay.setText(btn5Text);

            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn6Text = textDisplay.getText() + btn6.getText();
                textDisplay.setText(btn6Text);

            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn7Text = textDisplay.getText() + btn7.getText();
                textDisplay.setText(btn7Text);

            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn8Text = textDisplay.getText() + btn8.getText();
                textDisplay.setText(btn8Text);

            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn9Text = textDisplay.getText() + btn9.getText();
                textDisplay.setText(btn9Text);

            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn0Text = textDisplay.getText() + btn0.getText();
                textDisplay.setText(btn0Text);

            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = btnPlus.getText();
                getOperator(btnText);
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator) {
                    case '+' -> total2 = total1 + Double.parseDouble(textDisplay.getText());
                    case '-' -> total2 = total1 - Double.parseDouble(textDisplay.getText());
                    case '/' -> total2 = total1 / Double.parseDouble(textDisplay.getText());
                    case '*' -> total2 = total1 * Double.parseDouble(textDisplay.getText());
                }
                textDisplay.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textDisplay.setText("");
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textDisplay.getText().equals("")) {
                    textDisplay.setText("0.");
                }else if (textDisplay.getText().contains(".")) {
                    btnPoint.setEnabled(false);
                }else {
                    String btnPointText = textDisplay.getText() + btnPoint.getText();
                    textDisplay.setText(btnPointText);
                }
                btnPoint.setEnabled(true);
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = btnMinus.getText();
                getOperator(btnText);
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = btnDivide.getText();
                getOperator(btnText);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = btnMultiply.getText();
                getOperator(btnText);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

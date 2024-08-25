import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program extends JFrame implements ActionListener{
    JFrame frame = new JFrame("Somar valores");
    JLabel firstNumberLabel = new JLabel("Primeiro número");
    JLabel secondNumberLabel = new JLabel("Segundo número");
    JLabel resultLabel = new JLabel("Total da soma");
    JTextField input_one = new JTextField(10);
    JTextField input_two = new JTextField(10);
    JTextField result = new JTextField(10);
    JButton btn = new JButton("Somar");

    public Program() {
        frame.add(firstNumberLabel);
        frame.add(input_one);
        frame.add(secondNumberLabel);
        frame.add(input_two);
        frame.add(resultLabel);
        frame.add(result);
        frame.add(btn);

        btn.setBounds(150, 100, 100, 40);
        btn.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 150, 10));
        frame.setSize(350, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Program();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int firstValue = Integer.parseInt(input_one.getText());
        int secondtValue = Integer.parseInt(input_two.getText());
        int sumResult = firstValue + secondtValue;
        result.setText(String.valueOf(sumResult));
    }
}

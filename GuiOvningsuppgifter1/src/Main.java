import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        String name;

        JFrame windows = new JFrame();
        windows.setTitle("Greeting");
        windows.setSize(400, 300);
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windows.setLocationRelativeTo(null);


        JPanel inputPanle = new JPanel();
        inputPanle.setPreferredSize(new Dimension(0, 100));
        final JTextField input1 = new JTextField("Name");


        input1.setPreferredSize(new Dimension(150, 40));
        inputPanle.add(input1, BorderLayout.CENTER);

        JPanel outputPanel = new JPanel();
        outputPanel.setPreferredSize(new Dimension(350, 100));

        final JLabel output = new JLabel();
        output.setPreferredSize(new Dimension(150, 50));

        outputPanel.add(output, BorderLayout.EAST);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(400, 50));

        JButton buttonOne = new JButton("Greet");
        buttonOne.setPreferredSize(new Dimension(130, 40));


        buttonPanel.add(buttonOne, BorderLayout.CENTER);

        windows.add(inputPanle, BorderLayout.NORTH);
        windows.add(outputPanel, BorderLayout.CENTER);
        windows.add(buttonPanel, BorderLayout.SOUTH);

        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                output.setText("Result: Hello " + String.valueOf(input1.getText()+"      "));
            }
        });

        windows.setVisible(true);
    }

        public static String printout(String name){
            return name;

        }

    }

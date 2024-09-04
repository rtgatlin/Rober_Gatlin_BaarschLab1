import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPanel extends JPanel {
    private JTextField input;
    private JLabel label;
    private JPanel panel;
    private PursePanel money;
    private Register reg;


    public RegisterPanel() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.black);
        money = new PursePanel();
        panel = new JPanel();
        reg = new Register();
        panel.setPreferredSize(new Dimension(300, 30));
        panel.setBackground(Color.pink);

        label = new JLabel("How much money do you have? $");
        label.setFont(new Font("TimesNewRoman", Font.PLAIN, 12));
        label.setForeground(Color.green);
        panel.add(label);

        input = new JTextField();
        input.setPreferredSize(new Dimension(100, 20));
        input.setFont(new Font("TimesNewRoman", Font.PLAIN, 12));
        input.addActionListener(new userListener());
        panel.add(input);


        this.add(panel);
        this.add(money);
        //this.add(label);
        //this.add(input);




    }

    private class userListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput=input.getText();
            double cash = Double.parseDouble(userInput);
            money.myPurse = reg.makeChange(cash);
            money.revalidate();
            money.repaint();
            System.out.println(money.myPurse);
            //input.setText("Thanks");
        }
    }
}

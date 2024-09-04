import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.util.HashMap;

public class PursePanel extends JPanel {
    public Purse myPurse = new Purse();
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setPreferredSize(new Dimension(500, 500));


        for (Map.Entry<Denomination, Integer> moneyList : myPurse.cash.entrySet()){


            for (int i = 0; i < moneyList.getValue(); i++) {
                JLabel purseLabel = new JLabel();
                ImageIcon picture = new ImageIcon(moneyList.getKey().img());
                picture.setImage(picture.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
                purseLabel.setIcon(picture);
                purseLabel.setBounds(50, 50, 30, 30);
                this.add(purseLabel);
            }
        }
        //repaint();
    }
}


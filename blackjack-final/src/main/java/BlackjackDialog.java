package src.main.java;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BlackjackDialog {
    public static void showStartMsg() {
        // Images
        ImageIcon blackjackStart = new ImageIcon(Blackjack.class.getResource("/src/main/resources/blackjack-game.png"));

        // JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Order in column

        // Label for image
        JLabel blackjackStartLabelImg = new JLabel(blackjackStart);
        blackjackStartLabelImg.setAlignmentX(Component.CENTER_ALIGNMENT); // Img center

        // Label for text
        JLabel blackjackStartLabelText = new JLabel("Welcome to Blackjack");
        blackjackStartLabelText.setAlignmentX(Component.CENTER_ALIGNMENT); // Text Center

        // Add image & label to JPanel
        panel.add(blackjackStartLabelImg);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Space between img & label
        panel.add(blackjackStartLabelText);

        JOptionPane.showMessageDialog(null, panel, "Blackjack", JOptionPane.PLAIN_MESSAGE);
    }
}

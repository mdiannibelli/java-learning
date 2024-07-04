package src.main.java;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BlackjackDialog {
    public static void showStartMsg() {
        // Image
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

        // Label font & size
        blackjackStartLabelText.setFont(new Font("Arial", Font.BOLD, 18));

        // Add image & label to JPanel
        panel.add(blackjackStartLabelImg);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Space between img & label
        panel.add(blackjackStartLabelText);

        JOptionPane.showMessageDialog(null, panel, "Blackjack", JOptionPane.PLAIN_MESSAGE);
    }

    public static void showGiveUserCardsMsg() {
        // Image
        ImageIcon giveUserCard = new ImageIcon(Blackjack.class.getResource("/src/main/resources/user-cards.png"));

        // JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Order in column

        // Label for image
        JLabel giveUserCardImg = new JLabel(giveUserCard);
        giveUserCardImg.setAlignmentX(Component.CENTER_ALIGNMENT); // Img center

        // Label for text
        JLabel giveUserCardText = new JLabel("Dealing user's cards...");
        giveUserCardText.setAlignmentX(Component.CENTER_ALIGNMENT); // Text Center

        // Label font & size
        giveUserCardText.setFont(new Font("Arial", Font.BOLD, 18));

        // Add image & label to JPanel
        panel.add(giveUserCardImg);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Space between img & label
        panel.add(giveUserCardText);

        JOptionPane.showMessageDialog(null, panel, "User cards", JOptionPane.PLAIN_MESSAGE);
    }

    public static void showGiveCrupierCardsMsg() {
        // Image
        ImageIcon giveCrupierCard = new ImageIcon(Blackjack.class.getResource("/src/main/resources/crupier-cards.png"));

        // JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Order in column

        // Label for image
        JLabel giveCrupierCardImg = new JLabel(giveCrupierCard);
        giveCrupierCardImg.setAlignmentX(Component.CENTER_ALIGNMENT); // Img center

        // Label for text
        JLabel giveCrupierCardText = new JLabel("Dealing crupier's cards...");
        giveCrupierCardText.setAlignmentX(Component.CENTER_ALIGNMENT); // Text Center

        // Label font & size
        giveCrupierCardText.setFont(new Font("Arial", Font.BOLD, 18));

        // Add image & label to JPanel
        panel.add(giveCrupierCardImg);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Space between img & label
        panel.add(giveCrupierCardText);

        JOptionPane.showMessageDialog(null, panel, "Crupier cards", JOptionPane.PLAIN_MESSAGE);
    }
}

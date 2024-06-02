import javax.swing.*;
import java.awt.event.*;

public class SpecialKeysDemo extends JFrame {
    public SpecialKeysDemo() {
        setTitle("Special Keys Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        add(textArea);

        // Add key listener to the text area
        textArea.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                String keyText = KeyEvent.getKeyText(keyCode);

                // Handle arrow keys
                if (keyCode == KeyEvent.VK_UP) {
                    textArea.append("Up arrow key pressed\n");
                } else if (keyCode == KeyEvent.VK_DOWN) {
                    textArea.append("Down arrow key pressed\n");
                } else if (keyCode == KeyEvent.VK_LEFT) {
                    textArea.append("Left arrow key pressed\n");
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    textArea.append("Right arrow key pressed\n");
                }

                // Handle function keys
                if (keyCode >= KeyEvent.VK_F1 && keyCode <= KeyEvent.VK_F12) {
                    textArea.append("Function key " + keyText + " pressed\n");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SpecialKeysDemo().setVisible(true);
            }
        });
    }
}
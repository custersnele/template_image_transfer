import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Client {

    public void start(String serverAddress, int serverPort) {
        // TODO: create a connection with the server

        // TODO: select a file

        // TODO: send the file

        // TODO: receive the converted file

        // TODO: display the converted file
    }

    public File selectFile() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();
        } else {
            return null;
        }
    }

    public void displayImage(BufferedImage image) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Received Image");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ImageIcon imageIcon = new ImageIcon(image);
            JLabel label = new JLabel(imageIcon);
            frame.getContentPane().add(label, BorderLayout.CENTER);
            frame.pack();
            frame.setVisible(true);
        });
    }
}

package Utility;

import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {

    private final Image img;

    public ImagePanel(String img) {
        this(new ImageIcon(img).getImage());
    }

    public ImagePanel(Image img) {
        this.img = img;
        Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(null);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = this.getSize().width;
        int height = this.getSize().height;

        if (this.img != null) {
            //Add the size of the window in drawImage method()
            g.drawImage(this.img, 0, 0, width, height, null);
        }
    }
}
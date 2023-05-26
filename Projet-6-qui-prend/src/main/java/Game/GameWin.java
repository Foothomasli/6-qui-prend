package Game;
import javax.swing.*;
import java.awt.*;

/*
public class GameWin extends JFrame{
    void launch(){
        this.setVisible(true);
        this.setSize(1000,800);
        this.setLocationRelativeTo(null);
        this.setTitle("6 QUI PREND");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static Image bg = Toolkit.getDefaultToolkit().createImage("Image/background.jpg");

    @Override
    public void paint(Graphics g) {
        g.drawImage(bg,0,0,1000,800,null);
    }

    public static void main(String[] args) {
        GameWin gameWin = new GameWin();
        gameWin.launch();
    }
}
*/
public class GameWin extends JFrame {
    public static Image bg = Toolkit.getDefaultToolkit().createImage("Image/background.jpg");

    public GameWin() {
        this.setVisible(true);
        this.setSize(1000, 800);
        this.setLocationRelativeTo(null);
        this.setTitle("6 QUI PREND");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(bg, 0, 0, null);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GameWin gameWin = new GameWin();
        });
    }
}




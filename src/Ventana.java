import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public Ventana(){
        setVentana();
        initComponents();
    }

    private void setVentana(){
        setSize(300, 300);
        setTitle("Mi Primera Ventana");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        this.revalidate();
        setMaximumSize(new Dimension(600, 600));
        setMinimumSize(new Dimension(200, 200));
        this.getContentPane().setBackground(Color.gray);
    }

    private void initComponents(){
        setPanels();
    }

    private void setPanels(){
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        JPanel CenterPanel = new JPanel();
        CenterPanel.setBackground(Color.red);
        this.getContentPane().add(CenterPanel);

        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.black);
        this.getContentPane().add(northPanel);

        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.blue);
        this.getContentPane().add(southPanel);

        JPanel eastPanel = new JPanel();
        eastPanel.setBackground(Color.green);
        this.getContentPane().add(eastPanel);

        JPanel westPanel = new JPanel();
        westPanel.setBackground(Color.YELLOW);
        this.getContentPane().add(westPanel);
    }

    public static void main(String[] args) {
        Ventana v = new Ventana();
        v.setVisible(true);
    }


}

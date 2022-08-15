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
        this.setLayout(null);
    }

    private void initComponents(){
        setPanels();
    }

    private void setPanels(){
        //this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        JPanel centerPanel = new JPanel();
        centerPanel.setBounds(0, 0, 100, 100);
        centerPanel.setBackground(Color.red);
        this.getContentPane().add(centerPanel);

        JPanel northPanel = new JPanel();
        northPanel.setBounds(100, 100, 100, 100);
        northPanel.setBackground(Color.black);
        this.getContentPane().add(northPanel);

        JPanel southPanel = new JPanel();
        southPanel.setBounds(0, 100, 100, 100);
        southPanel.setBackground(Color.blue);
        this.getContentPane().add(southPanel);

        JPanel eastPanel = new JPanel();
        eastPanel.setBounds(100, 0, 100, 100);
        eastPanel.setBackground(Color.green);
        this.getContentPane().add(eastPanel);

        JPanel westPanel = new JPanel();
        westPanel.setBounds(200, 200, 200, 100);
        westPanel.setBackground(Color.YELLOW);
        this.getContentPane().add(westPanel);
    }

    public static void main(String[] args) {
        Ventana v = new Ventana();
        v.setVisible(true);
    }


}

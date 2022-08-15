import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public Ventana(){
        setVentana();
        initComponents();
    }

    private void setVentana(){
        setSize(600, 600);
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
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.ORANGE);
        panel.setBounds(0, 0, 600, 600);
        this.getContentPane().add(panel);

        JLabel label = new JLabel("Esto es una etiqueta: ", SwingConstants.CENTER);
        label.setBounds(10, 10, 250, 30);
        label.setForeground(Color.GRAY);
        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(label);
    }

    public static void main(String[] args) {
        Ventana v = new Ventana();
        v.setVisible(true);
    }


}

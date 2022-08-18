import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Ventana extends JFrame {

    public JPanel panel;
    public JLabel label, imgLabel;

    public JButton button;

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
        //setLabels();
        setButtons();
    }

    private void setPanels(){
        //this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        panel = new JPanel();
        this.panel.setBackground(Color.ORANGE);
        this.panel.setLayout(null);
        this.panel.setBounds(0, 0, 600, 600);
        this.getContentPane().add(panel);
    }

    private void setLabels(){
        label = new JLabel("Esto es una etiqueta: ", SwingConstants.CENTER);
        label.setBounds(10, 10, 400, 100);
        label.setForeground(Color.BLUE);
        label.setBackground(Color.white);
        label.setOpaque(true);
        File file = new File("AgentOrange.ttf");
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, file);
            Font sizeFont = font.deriveFont(20F);
            label.setFont(sizeFont);
        } catch (FontFormatException e) {
            throw new RuntimeException("Error en la creación de la fuente. ", e);
        } catch (IOException e) {
            throw new RuntimeException("Error de entrada/salida. ", e);
        }

        this.panel.add(label);

        ImageIcon gameImg = new ImageIcon("horizon.jpg");
        imgLabel = new JLabel();
        imgLabel.setBounds(100, 150, 250, 250);
        imgLabel.setIcon(new ImageIcon(gameImg.getImage().getScaledInstance(imgLabel.getWidth(), imgLabel.getHeight(), Image.SCALE_SMOOTH)));

        this.panel.add(imgLabel);
    }

    public void setButtons(){
        button = new JButton("Agregar Labels");
        button.setBounds(200, 250, 180,40);
        this.panel.add(button);

    }
    public static void main(String[] args) {
        Ventana v = new Ventana();
        v.setVisible(true);
    }


}

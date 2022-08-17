import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

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

        panel.add(label);
    }

    public static void main(String[] args) {
        Ventana v = new Ventana();
        v.setVisible(true);
    }


}

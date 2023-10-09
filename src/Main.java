import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    private JPanel jpnlMain;
    private JLabel jlblCelsiu;
    private JTextField jtxtTemp;
    private JButton btnConvert;
    private JLabel jlblFahr;

    public Main() {
        setTitle("Celsius Converter");
        setContentPane(jpnlMain);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(280, 100);
        setLocationRelativeTo(null);
        setVisible(true);

        btnConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempFahr = (int)((Double.parseDouble(jtxtTemp.getText())) * 1.8 + 32);
                jlblFahr.setText(tempFahr + " Fahrenheit ");
            }
        });
    }

    /**
     * Run program
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }

}

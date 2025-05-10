package buoithuchanh;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class bai55 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private Timer timer;
    private Random random;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    bai55 frame = new bai55();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public bai55() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 400); 
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null); 

        setContentPane(contentPane);

        random = new Random();

        
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                contentPane.setBackground(randomColor);
            }
        });
        timer.start(); 

        
        JButton btnStop = new JButton("Stop");
        btnStop.setBounds(150, 170, 100, 30); 
        contentPane.add(btnStop);

       
        btnStop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.stop(); 
            }
        });
    }
}

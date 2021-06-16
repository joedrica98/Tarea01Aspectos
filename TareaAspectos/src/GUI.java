import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAmarillo = new JButton("Amarillo");
		btnAmarillo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contentPane.setBackground(Color.YELLOW);
				color("Amarillo");
			}
		});
		btnAmarillo.setBounds(10, 227, 89, 23);
		contentPane.add(btnAmarillo);
		
		JButton btnAzul = new JButton("Azul");
		btnAzul.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contentPane.setBackground(Color.BLUE);
				color("Azul");
			}
		});
		btnAzul.setBounds(170, 227, 89, 23);
		contentPane.add(btnAzul);
		
		JButton btnRojo = new JButton("Rojo");
		btnRojo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contentPane.setBackground(Color.RED);
				color("Rojo");
			}
		});
		btnRojo.setBounds(335, 227, 89, 23);
		contentPane.add(btnRojo);
	}
	
	public void color(String color) {
		System.out.println(color);
	}
}

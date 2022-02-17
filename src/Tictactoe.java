import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class Tictactoe {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=-202,378
	 */
	private final JComboBox comboBox = new JComboBox();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tictactoe window = new Tictactoe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tictactoe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.GREEN, 3));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.BLUE, 3));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.BLUE, 3));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.RED, 3));
		panel.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_9_2 = new JPanel();
		panel.add(panel_9_2);
		panel_9_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_9_1 = new JPanel();
		panel_9_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_9_1);
		panel_9_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_9_3 = new JPanel();
		panel_9_3.setBorder(new LineBorder(Color.GREEN, 3));
		panel.add(panel_9_3);
		panel_9_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.BLUE, 3));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_9_4 = new JPanel();
		panel.add(panel_9_4);
		panel_9_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_9_5 = new JPanel();
		panel.add(panel_9_5);
		panel_9_5.setLayout(new BorderLayout(0, 0));
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;

public class Tictactoe {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=-202,378
	 */
	private final JComboBox comboBox = new JComboBox();
	private JTextField ycount;
	private JTextField xcount;
	private int xCount = 0;
	private int yCount = 0;
	private String startGame = "X";
	private int b1 = 10;
	private int b2 = 10;
	private int b3 = 10;
	private int b4 = 10;
	private int b5 = 10;
	private int b6 = 10;
	private int b7 = 10;
	private int b8 = 10;
	private int b9 = 10;
	private int d = 0;
	 

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
	private void winningGame() {
		if(b1==1 && b2==1 && b3==1) {
			JOptionPane.showMessageDialog(frame, "PLayer x wins","Tic tac toes",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			xcount.setText(String.valueOf(xCount));
		}
		else if(b4==1 && b5==1 && b6==1) {
			JOptionPane.showMessageDialog(frame, "PLayer x wins","Tic tac toes",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			xcount.setText(String.valueOf(xCount));
		}
		else if(b7==1 && b8==1 && b9==1) {
			JOptionPane.showMessageDialog(frame, "PLayer x wins","Tic tac toes",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			xcount.setText(String.valueOf(xCount));
		}
		else if(b1==1 && b5==1 && b9==1) {
			JOptionPane.showMessageDialog(frame, "PLayer x wins","Tic tac toes",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			xcount.setText(String.valueOf(xCount));
		}
		else if(b3==1 && b6==1 && b9==1) {
			JOptionPane.showMessageDialog(frame, "PLayer x wins","Tic tac toes",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			xcount.setText(String.valueOf(xCount));
		}
		else if(b2==1 && b5==1 && b8==1) {
			JOptionPane.showMessageDialog(frame, "PLayer x wins","Tic tac toes",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			xcount.setText(String.valueOf(xCount));
		}
		else if(b3==1 && b5==1 && b7==1) {
			JOptionPane.showMessageDialog(frame, "PLayer x wins","Tic tac toes",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			xcount.setText(String.valueOf(xCount));
		}
		else if(b1==1 && b4==1 && b7==1) {
			JOptionPane.showMessageDialog(frame, "PLayer x wins","Tic tac toes",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			xcount.setText(String.valueOf(xCount));
		}
		// player 0
		else if(b1==0 && b2==0 && b3==0) {
			JOptionPane.showMessageDialog(frame, "PLayer 0 wins","Tic tac toes",JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			ycount.setText(String.valueOf(yCount));
		}
		else if(b4==0 && b5==0 && b6==0) {
			JOptionPane.showMessageDialog(frame, "PLayer 0 wins","Tic tac toes",JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			ycount.setText(String.valueOf(yCount));
		}
		else if(b7==0 && b8==0 && b9==0) {
			JOptionPane.showMessageDialog(frame, "PLayer 0 wins","Tic tac toes",JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			ycount.setText(String.valueOf(yCount));
		}
		else if(b1==0 && b5==0 && b9==0) {
			JOptionPane.showMessageDialog(frame, "PLayer 0 wins","Tic tac toes",JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			ycount.setText(String.valueOf(yCount));
		}
		else if(b3==0 && b6==0 && b9==0) {
			JOptionPane.showMessageDialog(frame, "PLayer 0 wins","Tic tac toes",JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			ycount.setText(String.valueOf(yCount));
		}
		else if(b2==0 && b5==0 && b8==0) {
			JOptionPane.showMessageDialog(frame, "PLayer O wins","Tic tac toes",JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			ycount.setText(String.valueOf(yCount));
		}
		else if(b3==0 && b5==0 && b7==0) {
			JOptionPane.showMessageDialog(frame, "PLayer O wins","Tic tac toes",JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			ycount.setText(String.valueOf(yCount));
		}
		else if(b1==0 && b4==0 && b7==0) {
			JOptionPane.showMessageDialog(frame, "PLayer O wins","Tic tac toes",JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			ycount.setText(String.valueOf(yCount));
		}
		else if (d == 9) {
			JOptionPane.showMessageDialog(frame, "you DRAW! ","Tic tac toes",JOptionPane.INFORMATION_MESSAGE);
			yCount += 1;
			xCount += 1;
			 
		}
	}
	
	private void choosePlayer(){
		if(startGame.equalsIgnoreCase("X")) {
			startGame = "O";
		}
		else {
			startGame = "X";
		}
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
		
		JButton btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(startGame);
				if(startGame.equalsIgnoreCase("x")) {
					btn1.setForeground(Color.blue);
					b1 = 1;
					d++;
				}
				else {
					btn1.setForeground(Color.green);
					b1 = 0;
					d++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn1.setFont(new Font("Dialog", Font.BOLD, 22));
		panel_3.add(btn1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.GREEN, 3));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton btn2 = new JButton("");
		btn2.setFont(new Font("Dialog", Font.BOLD, 22));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn2.setText(startGame);
				if(startGame.equalsIgnoreCase("x")) {
					btn2.setForeground(Color.blue);
					b2 = 1;
					d++;
				}
				else {
					btn2.setForeground(Color.green);
					b2 =0;
					d++;
				}
				choosePlayer();
				winningGame();
			}
		});
		panel_2.add(btn2, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.BLUE, 3));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setText(startGame);
				if(startGame.equalsIgnoreCase("x")) {
					btn3.setForeground(Color.blue);
					b3 =1;
					d++;
				}
				else {
					btn3.setForeground(Color.green);
					b3 = 0;
					d++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn3.setFont(new Font("Dialog", Font.BOLD, 22));
		panel_1.add(btn3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JButton btnPlayerx = new JButton("PLAYERX");
		btnPlayerx.setFont(new Font("Dialog", Font.BOLD, 14));
		btnPlayerx.setForeground(Color.GREEN);
		btnPlayerx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_4.add(btnPlayerx, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		xcount = new JTextField();
		xcount.setFont(new Font("Dialog", Font.BOLD, 21));
		xcount.setText("0");
		panel_5.add(xcount, BorderLayout.CENTER);
		xcount.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.BLUE, 3));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setText(startGame);
				if(startGame.equalsIgnoreCase("x")) {
					btn4.setForeground(Color.blue);
					b4 =1;
					d++;
				}
				else {
					btn4.setForeground(Color.green);
					b4 = 0;
					d++;
					
				}
				choosePlayer();
				winningGame();
			}
		});
		btn4.setFont(new Font("Dialog", Font.BOLD, 22));
		panel_6.add(btn4, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton btn5 = new JButton("");
		btn5.setFont(new Font("Dialog", Font.BOLD, 22));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn5.setText(startGame);
				if(startGame.equalsIgnoreCase("x")) {
					btn5.setForeground(Color.blue);
					b5 = 1;
					d++;
				}
				else {
					btn5.setForeground(Color.green);
					b5 = 0;
					d++;
				}
				choosePlayer();
				winningGame();
			}
		});
		panel_7.add(btn5, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.RED, 3));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn6.setText(startGame);
				if(startGame.equalsIgnoreCase("x")) {
					btn6.setForeground(Color.blue);
					b6 = 1;
					d++;
				}
				else {
					btn6.setForeground(Color.green);
					b6 = 0;
					d++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn6.setFont(new Font("Dialog", Font.BOLD, 22));
		panel_8.add(btn6, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JButton btnPlayer = new JButton("PLAYER0");
		btnPlayer.setFont(new Font("Dialog", Font.BOLD, 14));
		btnPlayer.setForeground(Color.ORANGE);
		panel_9.add(btnPlayer, BorderLayout.CENTER);
		
		JPanel panel_9_2 = new JPanel();
		panel.add(panel_9_2);
		panel_9_2.setLayout(new BorderLayout(0, 0));
		
		ycount = new JTextField();
		ycount.setFont(new Font("Dialog", Font.BOLD, 21));
		ycount.setText("\n0\n");
		panel_9_2.add(ycount, BorderLayout.CENTER);
		ycount.setColumns(10);
		
		JPanel panel_9_1 = new JPanel();
		panel_9_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_9_1);
		panel_9_1.setLayout(new BorderLayout(0, 0));
		
		JButton btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setText(startGame);
				if(startGame.equalsIgnoreCase("x")) {
					btn7.setForeground(Color.blue);
					b7 = 1;
					d++;
				}
				else {
					btn7.setForeground(Color.green);
					b7 = 0;
					d++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn7.setFont(new Font("Dialog", Font.BOLD, 22));
		panel_9_1.add(btn7, BorderLayout.CENTER);
		
		JPanel panel_9_3 = new JPanel();
		panel_9_3.setBorder(new LineBorder(Color.GREEN, 3));
		panel.add(panel_9_3);
		panel_9_3.setLayout(new BorderLayout(0, 0));
		
		JButton btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setText(startGame);
				if(startGame.equalsIgnoreCase("x")) {
					btn8.setForeground(Color.blue);
					b8 =1;
					d++;
				}
				else {
					btn8.setForeground(Color.green);
					b8 = 0;
					d++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn8.setFont(new Font("Dialog", Font.BOLD, 22));
		panel_9_3.add(btn8, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.BLUE, 3));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JButton btn9 = new JButton("");
		btn9.setFont(new Font("Dialog", Font.BOLD, 22));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn9.setText(startGame);
				if(startGame.equalsIgnoreCase("x")) {
					btn9.setForeground(Color.blue);
					b9 = 1;
					d++;
				}
				else {
					btn9.setForeground(Color.green);
					b9 = 0;
					d++;
				}
				choosePlayer();
				winningGame();
			}
		});
		panel_10.add(btn9, BorderLayout.CENTER);
		
		JPanel panel_9_4 = new JPanel();
		panel.add(panel_9_4);
		panel_9_4.setLayout(new BorderLayout(0, 0));
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(null);
				btn2.setText(null);
				btn3.setText(null);
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				btn8.setText(null);
				btn9.setText(null);
				b1 = 10;
				b2 = 10;
				b3 = 10;
				b4 = 10;
				b5 = 10;
				b6 = 10;
				b7 = 10;
				b8 = 10;
				b9 = 10;
				d=0;
			 
				
			}
		});
		btnReset.setForeground(Color.RED);
		panel_9_4.add(btnReset, BorderLayout.CENTER);
		
		JPanel panel_9_5 = new JPanel();
		panel.add(panel_9_5);
		panel_9_5.setLayout(new BorderLayout(0, 0));
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("exit");
				if(JOptionPane.showConfirmDialog(frame,"confirm you want to quit","tic tac toe game",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(Color.RED);
		panel_9_5.add(btnExit, BorderLayout.CENTER);
	}
}

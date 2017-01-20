import java.awt.Color;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class TicTacToePC {

	private JPanel panel;
	public JButton[] buttons;
	private final int SIZE = 3;
	private GridLayout experimentLayout;

	public int number;
	public int round = 0;
	public ArrayList<Integer> mNumbers = new ArrayList<Integer>();
	public ArrayList<String> fieldAndSymbol = new ArrayList<String>();
	public static final int CROSS = 1;
	public static final int NOUGHT = 2;
	public static int currentPlayer;
	public static boolean noDraw = false;
	boolean[] boardState = new boolean[8];

	public TicTacToePC() {

		JFrame frame = new JFrame("Tic Tac Toe");

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);

		experimentLayout = new GridLayout(SIZE, SIZE);
		panel = new JPanel();
		panel.setLayout(experimentLayout);


		buttons = new JButton[9];
		addButtons(panel);

		frame.add(panel);

		frame.setVisible(true);
	}

	public void disableButtons() {
		for (int k = 0; k < 3; k++) {
		
				buttons[k].setEnabled(false);
			
		}
	}

	public void showWinMessageForX() {
		JOptionPane.showMessageDialog(null, " X WINS!", " " + " ", JOptionPane.INFORMATION_MESSAGE);
	}

	public void showWinMessageForO() {
		JOptionPane.showMessageDialog(null, " O WINS!", " " + " ", JOptionPane.INFORMATION_MESSAGE);
	}

	public void showDrawMessage() {
		JOptionPane.showMessageDialog(null, "Draw!", " " + " ", JOptionPane.INFORMATION_MESSAGE);
	}

	public void checkForWinX() {

		for (int k = 0; k < 3; k++) {

			if (buttons[k].getText() == "X" && buttons[k + 3].getText() == "X" && buttons[k + 6].getText() == "X") {

				buttons[k].setBackground(Color.CYAN);
				buttons[k + 3].setBackground(Color.CYAN);
				buttons[k + 6].setBackground(Color.CYAN);
				disableButtons();
				showWinMessageForX();

			}

		}

		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			if (buttons[3 * i].getText() == "X" && buttons[3 * i + 1].getText() == "X"
					&& buttons[3 * i + 2].getText() == "X") {

				buttons[3 * i].setBackground(Color.CYAN);
				buttons[3 * i + 1].setBackground(Color.CYAN);
				buttons[3 * i + 2].setBackground(Color.CYAN);
				disableButtons();
				showWinMessageForX();

			}

		}
		if (buttons[0].getText() == "X" && buttons[4].getText() == "X" && buttons[8].getText() == "X") {
			buttons[0].setBackground(Color.CYAN);
			buttons[4].setBackground(Color.CYAN);
			buttons[8].setBackground(Color.CYAN);
			disableButtons();
			showWinMessageForX();
		}

		if (buttons[2].getText() == "X" && buttons[4].getText() == "X" && buttons[6].getText() == "X") {
			buttons[2].setBackground(Color.CYAN);
			buttons[4].setBackground(Color.CYAN);
			buttons[6].setBackground(Color.CYAN);
			disableButtons();
			showWinMessageForX();
		}

	}

	public void checkForWinO() {

		for (int k = 0; k < 3; k++) {

			if (buttons[k].getText() == "O" && buttons[k + 3].getText() == "O" && buttons[k + 6].getText() == "O") {

				buttons[k].setBackground(Color.CYAN);
				buttons[k + 3].setBackground(Color.CYAN);
				buttons[k + 6].setBackground(Color.CYAN);
				disableButtons();
				showWinMessageForO();

			}

		}

		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			if (buttons[3 * i].getText() == "O" && buttons[3 * i + 1].getText() == "O"
					&& buttons[3 * i + 2].getText() == "O") {

				buttons[3 * i].setBackground(Color.CYAN);
				buttons[3 * i + 1].setBackground(Color.CYAN);
				buttons[3 * i + 2].setBackground(Color.CYAN);
				disableButtons();
				showWinMessageForO();

			}

		}
		if (buttons[0].getText() == "O" && buttons[4].getText() == "O" && buttons[8].getText() == "O") {
			buttons[0].setBackground(Color.CYAN);
			buttons[4].setBackground(Color.CYAN);
			buttons[8].setBackground(Color.CYAN);
			disableButtons();
			showWinMessageForO();
		}

		if (buttons[2].getText() == "O" && buttons[4].getText() == "O" && buttons[6].getText() == "O") {
			buttons[2].setBackground(Color.CYAN);
			buttons[4].setBackground(Color.CYAN);
			buttons[6].setBackground(Color.CYAN);
			disableButtons();
			showWinMessageForO();
		}

	}


//	public void pcTurn(String x, ActionEvent e) {
//
//		// Blocking "X" for win on sides on the middle
//		// Blocking "X" for win on Middle
//		if (buttons[0][0].getText() == "X" && buttons[0][2].getText() == "X" && buttons[0][1].getText() == " ") {
//			buttons[0][1].setText("O");
//			buttons[0][1].setEnabled(false);
//		} else
//
//		if (buttons[0][0].getText() == "X" && buttons[2][0].getText() == "X" && buttons[1][0].getText() == " ") {
//			buttons[1][0].setText("O");
//			buttons[1][0].setEnabled(false);
//		} else
//
//		if (buttons[2][0].getText() == "X" && buttons[2][2].getText() == "X" && buttons[2][1].getText() == " ") {
//			buttons[2][1].setText("O");
//			buttons[2][1].setEnabled(false);
//		} else
//
//		if (buttons[0][2].getText() == "X" && buttons[2][2].getText() == "X" && buttons[1][2].getText() == " ") {
//			buttons[1][2].setText("O");
//			buttons[1][2].setEnabled(false);
//		} else
//
//		// Blocking "X" for win on Middle
//		if (buttons[1][0].getText() == "X" && buttons[1][1].getText() == "X" && buttons[1][2].getText() == " ") {
//			buttons[1][2].setText("O");
//			buttons[1][2].setEnabled(false);
//		} else
//
//		if (buttons[1][2].getText() == "X" && buttons[1][1].getText() == "X" && buttons[1][0].getText() == " ") {
//			buttons[1][0].setText("O");
//			buttons[1][0].setEnabled(false);
//		} else
//
//		if (buttons[2][1].getText() == "X" && buttons[1][1].getText() == "X" && buttons[0][1].getText() == " ") {
//			buttons[0][1].setText("O");
//			buttons[0][1].setEnabled(false);
//		} else
//
//		if (buttons[0][1].getText() == "X" && buttons[1][1].getText() == "X" && buttons[2][1].getText() == " ") {
//			buttons[2][1].setText("O");
//			buttons[2][1].setEnabled(false);
//		} else
//
//		// Blocking "X" WIn on Sides
//		if (buttons[0][0].getText() == "X" && buttons[0][1].getText() == "X" && buttons[0][2].getText() == " ") {
//			buttons[0][2].setText("O");
//			buttons[0][2].setEnabled(false);
//		} else if (buttons[0][0].getText() == "X" && buttons[1][0].getText() == "X" && buttons[2][0].getText() == " ") {
//			buttons[2][0].setText("O");
//			buttons[2][0].setEnabled(false);
//		}
//
//		else
//		// Win for PC Sides
//		if (buttons[0][0].getText() == "O" && buttons[0][1].getText() == "O" && buttons[0][2].getText() == " ") {
//			buttons[0][2].setText("O");
//			buttons[0][2].setEnabled(false);
//		} else if (buttons[0][0].getText() == "O" && buttons[1][0].getText() == "O") {
//			buttons[2][0].setText("O");
//			buttons[2][0].setEnabled(false);
//		}
//
//		else
//
//		if (buttons[2][0].getText() == "O" && buttons[2][1].getText() == "O" && buttons[2][2].getText() == " ") {
//			buttons[2][2].setText("O");
//			buttons[2][2].setEnabled(false);
//		}
//
//		else
//
//		if (buttons[2][2].getText() == "O" && buttons[1][2].getText() == "O" && buttons[0][2].getText() == " ") {
//			buttons[0][2].setText("O");
//			buttons[0][2].setEnabled(false);
//		}
//
//		// Win for PC Middle
//		else if (buttons[1][0].getText() == "O" && buttons[1][1].getText() == "O" && buttons[1][2].getText() == " ") {
//			buttons[1][2].setText("O");
//			buttons[1][2].setEnabled(false);
//		} else
//
//		if (buttons[1][2].getText() == "O" && buttons[1][1].getText() == "O" && buttons[1][0].getText() == " ") {
//			buttons[1][0].setText("O");
//			buttons[1][0].setEnabled(false);
//		} else
//
//		if (buttons[2][1].getText() == "O" && buttons[1][1].getText() == "O" && buttons[0][1].getText() == " ") {
//			buttons[0][1].setText("O");
//			buttons[0][1].setEnabled(false);
//		} else
//
//		if (buttons[0][1].getText() == "O" && buttons[1][1].getText() == "O" && buttons[2][1].getText() == " ") {
//			buttons[2][1].setText("O");
//			buttons[2][1].setEnabled(false);
//		} else
//
//		// Middle
//		if (buttons[1][1].getText() == " ") {
//			buttons[1][1].setText("O");
//			buttons[1][1].setEnabled(false);
//		} else
//
//		if (buttons[2][0].getText() == "X" && buttons[2][1].getText() == "X" && buttons[2][2].getText() == " ") {
//			buttons[2][2].setText("O");
//			buttons[2][2].setEnabled(false);
//		}
//
//		else
//
//		if (buttons[2][2].getText() == "X" && buttons[1][2].getText() == "X" && buttons[0][2].getText() == " ") {
//			buttons[0][2].setText("O");
//			buttons[0][2].setEnabled(false);
//		}
//
//		else
//
//		if (buttons[1][1].getText() == " ") {
//			buttons[1][1].setText("O");
//			buttons[1][1].setEnabled(false);
//		} else
//		// Corners. Because why not?
//		if (buttons[0][0].getText() == " ") {
//			buttons[0][0].setText("O");
//			buttons[0][0].setEnabled(false);
//		} else if (buttons[0][2].getText() == " ") {
//			buttons[0][2].setText("O");
//			buttons[0][2].setEnabled(false);
//		} else if (buttons[2][0].getText() == " ") {
//			buttons[2][0].setText("O");
//			buttons[2][0].setEnabled(false);
//		} else if (buttons[2][2].getText() == " ") {
//			buttons[2][2].setText("O");
//			buttons[2][2].setEnabled(false);
//		} else if
//
//		// The Last empty fields
//		(buttons[0][0].getText() == (" ")) {
//			buttons[0][0].setText("O");
//			buttons[0][0].setEnabled(false);
//		} else if (buttons[0][1].getText() == (" ")) {
//			buttons[0][1].setText("O");
//			buttons[0][1].setEnabled(false);
//		} else if (buttons[0][2].getText() == (" ")) {
//			buttons[0][2].setText("O");
//			buttons[0][2].setEnabled(false);
//		} else if (buttons[1][0].getText() == (" ")) {
//			buttons[1][0].setText("O");
//			buttons[1][0].setEnabled(false);
//		} else if (buttons[1][1].getText() == (" ")) {
//			buttons[1][1].setText("O");
//			buttons[1][1].setEnabled(false);
//		} else if (buttons[1][2].getText() == (" ")) {
//			buttons[1][2].setText("O");
//			buttons[1][2].setEnabled(false);
//		} else if (buttons[2][0].getText() == (" ")) {
//			buttons[2][0].setText("O");
//			buttons[2][0].setEnabled(false);
//		} else if (buttons[2][1].getText() == (" ")) {
//			buttons[2][1].setText("O");
//			buttons[2][1].setEnabled(false);
//		} else if (buttons[2][2].getText() == (" ")) {
//			buttons[2][2].setText("O");
//			buttons[2][2].setEnabled(false);
//		}
//
//	}

	public void addButtons(JPanel panel) {

		// MagicNumbers();

		for (int k = 0; k < 9; k++) {
			 {
				for(int l = 0;  l < 8; l++)
				{
					{
						String valueFromInt = Integer.toString(l);
						buttons[k] = new JButton(" ");
						buttons[k].setName(valueFromInt);

					}

				}
				

				buttons[k].addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						// this makes sure the button you are pressing is the
						// button variable
						if (e.getSource() == buttons[0] || e.getSource() == buttons[1]
								|| e.getSource() == buttons[2] || e.getSource() == buttons[3]
								|| e.getSource() == buttons[4]|| e.getSource() == buttons[5]
								|| e.getSource() == buttons[6] || e.getSource() == buttons[7]
								|| e.getSource() == buttons[8]) 
						{

							((AbstractButton) e.getSource()).setText("X");
							((AbstractButton) e.getSource()).setEnabled(false);

							System.out.println("X");
							//pcTurn("O", e);

							round++;
							System.out.println("Round: " + round);
							if (round == 5) {
								showDrawMessage();
							}
							checkForWinX();
							checkForWinO();
													
							if(round == 9 && noDraw  == false)
							{
								showDrawMessage();
							}

						}
					}
				});

				panel.add(buttons[k]);

			}
		}
	}

	public static void main(String[] args) {

		final JFrame parent = new JFrame();
		JButton button = new JButton();
		button.setPreferredSize(new Dimension(40, 40));

		button.setText("Start The Game!");
		parent.setSize(200, 100);
		parent.setLocationRelativeTo(null);
		parent.add(button);

		parent.setVisible(true);

		button.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				new TicTacToePC();

			}
		});

	}

}
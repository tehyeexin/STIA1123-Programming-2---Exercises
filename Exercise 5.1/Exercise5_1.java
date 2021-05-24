package Exercise5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Exercise5_1 {

	private JFrame frame;
	private JTextField Num1TextField;
	private JTextField Num2TextField;
	private JTextField AnswerTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise5_1 window = new Exercise5_1();
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
	public Exercise5_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 513, 345);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Num1TextField = new JTextField();
		Num1TextField.setForeground(Color.BLACK);
		Num1TextField.setBackground(Color.WHITE);
		Num1TextField.setHorizontalAlignment(SwingConstants.CENTER);
		Num1TextField.setBounds(75, 50, 146, 39);
		frame.getContentPane().add(Num1TextField);
		Num1TextField.setColumns(10);
		
		Num2TextField = new JTextField();
		Num2TextField.setForeground(Color.BLACK);
		Num2TextField.setBackground(Color.WHITE);
		Num2TextField.setHorizontalAlignment(SwingConstants.CENTER);
		Num2TextField.setBounds(266, 50, 152, 39);
		frame.getContentPane().add(Num2TextField);
		Num2TextField.setColumns(10);
		
		JButton AddButton = new JButton("ADD (+)");
		AddButton.setBackground(Color.LIGHT_GRAY);
		AddButton.setForeground(Color.BLACK);
		AddButton.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ans = 0;
				try {
					int num1 = Integer.parseInt(Num1TextField.getText());
					int num2 = Integer.parseInt(Num2TextField.getText());
				
					ans = num1 + num2;
					AnswerTextField.setText(Integer.toString(ans));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Invalid number. \nPlease try again.");
				}
			}
		});
		AddButton.setBounds(85, 117, 126, 39);
		frame.getContentPane().add(AddButton);
		
		JButton MinusButton = new JButton("MINUS (-)");
		MinusButton.setForeground(Color.BLACK);
		MinusButton.setBackground(Color.LIGHT_GRAY);
		MinusButton.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		MinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = 0;
				try {
					int num1 = Integer.parseInt(Num1TextField.getText());
					int num2 = Integer.parseInt(Num2TextField.getText());
				
					ans = num1 - num2;
					AnswerTextField.setText(Integer.toString(ans));
				}
				catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "Invalid number. \nPlease try again.");
				}
			}
		});
		MinusButton.setBounds(276, 117, 127, 39);
		frame.getContentPane().add(MinusButton);
		
		JLabel AnswerLabel = new JLabel("The answer is");
		AnswerLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		AnswerLabel.setBounds(84, 198, 146, 36);
		frame.getContentPane().add(AnswerLabel);
		
		AnswerTextField = new JTextField();
		AnswerTextField.setBackground(Color.WHITE);
		AnswerTextField.setHorizontalAlignment(SwingConstants.CENTER);
		AnswerTextField.setBounds(245, 198, 162, 39);
		frame.getContentPane().add(AnswerTextField);
		AnswerTextField.setColumns(10);
	}
}

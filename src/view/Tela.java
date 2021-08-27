package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.funcionamento;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		funcionamento n = new funcionamento();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Jogar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n.sortidos();
				textField.setText(n.sortidos());
				textField_1.setText(n.Sortido2());
				textField_2.setText(n.Sortidos3());
				/*
				n.WinAndLose();
				if(n.WinAndLose()== true) {
					JOptionPane.showMessageDialog(null,"Você ganhou");
				}*/
				btnNewButton.setVisible(false);
			}
		});
		btnNewButton.setBounds(290, 196, 89, 23);
		contentPane.add(btnNewButton);
		textField = new JTextField();
		textField.setBounds(65, 107, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setEditable(false);

		
		textField_1 = new JTextField();
		textField_1.setBounds(175, 107, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setEditable(false);
		
		textField_2 = new JTextField();
		textField_2.setBounds(290, 107, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setEditable(false);
	}
}

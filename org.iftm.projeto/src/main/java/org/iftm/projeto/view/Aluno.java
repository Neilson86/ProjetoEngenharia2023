package org.iftm.projeto.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class Aluno {

	private JFrame frame;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aluno window = new Aluno();
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
	public Aluno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAluno = new JLabel("REQUERER MATRICULA");
		lblAluno.setHorizontalAlignment(SwingConstants.CENTER);
		lblAluno.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAluno.setBounds(10, 0, 424, 20);
		frame.getContentPane().add(lblAluno);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "DISCIPLINAS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		painelCampos.setBounds(10, 46, 383, 187);
		frame.getContentPane().add(painelCampos);
		
		JPanel panel = new JPanel();
		panel.setBounds(384, 37, 96, 118);
		painelCampos.add(panel);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(161, 187, 202, 20);
		painelCampos.add(textField_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BANCO DE DADOS ", "ENGENHARIA", "PROGRAMAÇAO", "DIDATICA", "LIBRAS ", "MATEMATICA DISCRETA ", "ROBOTICA ", "HISTORIA DA EDUÇAÇAO ", "FILOSOFIA ", "SOCIOLOGIA"}));
		comboBox.setBounds(47, 37, 283, 22);
		painelCampos.add(comboBox);
		
		JButton btnNewButton = new JButton("CANCELAR");
		btnNewButton.setBounds(74, 124, 89, 23);
		painelCampos.add(btnNewButton);
		
		JButton btnComfirmar = new JButton("COMFIRMAR");
		btnComfirmar.setBounds(221, 124, 109, 23);
		painelCampos.add(btnComfirmar);
	}
}

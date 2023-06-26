package org.iftm.projeto.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;

public class Aluno1 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aluno1 window = new Aluno1();
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
	public Aluno1() {
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
		
		JPanel painelCampos = new JPanel();
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "CURSOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		painelCampos.setBounds(24, 49, 383, 187);
		frame.getContentPane().add(painelCampos);
		
		JPanel panel = new JPanel();
		panel.setBounds(384, 37, 96, 118);
		painelCampos.add(panel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(161, 187, 202, 20);
		painelCampos.add(textField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"COMPUTAÇAO", "LOGISTICA", "MARKETING"}));
		comboBox.setBounds(47, 37, 283, 22);
		painelCampos.add(comboBox);
		
		JButton btnNewButton = new JButton("CANCELAR");
		btnNewButton.setBounds(74, 124, 89, 23);
		painelCampos.add(btnNewButton);
		
		JButton btnComfirmar = new JButton("COMFIRMAR");
		btnComfirmar.setBounds(221, 124, 109, 23);
		painelCampos.add(btnComfirmar);
		
		JLabel lblConsultarCurso = new JLabel("CONSULTAR CURSO");
		lblConsultarCurso.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultarCurso.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblConsultarCurso.setBounds(10, 11, 424, 20);
		frame.getContentPane().add(lblConsultarCurso);
	}

}

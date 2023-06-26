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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Aluno2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aluno2 window = new Aluno2();
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
	public Aluno2() {
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
		painelCampos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "DISCIPLINAS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		painelCampos.setBounds(0, 31, 424, 235);
		frame.getContentPane().add(painelCampos);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BANCO DE DADOS ", "ENGENHARIA", "PROGRAMAÇAO", "DIDATICA", "LIBRAS ", "MATEMATICA DISCRETA ", "ROBOTICA ", "HISTORIA DA EDUÇAÇAO ", "FILOSOFIA ", "SOCIOLOGIA"}));
		comboBox.setBounds(74, 11, 283, 22);
		painelCampos.add(comboBox);
		
		JButton btnNewButton = new JButton("CANCELAR");
		btnNewButton.setBounds(73, 167, 89, 23);
		painelCampos.add(btnNewButton);
		
		JButton btnComfirmar = new JButton("COMFIRMAR");
		btnComfirmar.setBounds(216, 167, 109, 23);
		painelCampos.add(btnComfirmar);
		
		JLabel lblNewLabel = new JLabel("NOME DISCLINA");
		lblNewLabel.setBounds(10, 44, 89, 14);
		painelCampos.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(129, 41, 228, 20);
		painelCampos.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ANO/SEMESTRE");
		lblNewLabel_1.setBounds(10, 69, 89, 14);
		painelCampos.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(129, 66, 228, 20);
		painelCampos.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("SITUAÇAO/FALTAS");
		lblNewLabel_2.setBounds(10, 100, 109, 14);
		painelCampos.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NOTAS/RESULTADO");
		lblNewLabel_3.setBounds(10, 142, 97, 14);
		painelCampos.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(129, 97, 228, 20);
		painelCampos.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(129, 134, 228, 20);
		painelCampos.add(textField_3);
		
		JLabel lblConsultarDisciplina = new JLabel("CONSULTAR DISCIPLINA");
		lblConsultarDisciplina.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultarDisciplina.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblConsultarDisciplina.setBounds(10, 0, 424, 20);
		frame.getContentPane().add(lblConsultarDisciplina);
	}
}

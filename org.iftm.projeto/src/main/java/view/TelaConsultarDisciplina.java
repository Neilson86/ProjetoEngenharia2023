package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class TelaConsultarDisciplina extends JInternalFrame {
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
					TelaConsultarDisciplina frame = new TelaConsultarDisciplina();
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
	public TelaConsultarDisciplina() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(5, 0, 434, 266);
		getContentPane().add(panel);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "DISCIPLINAS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		painelCampos.setBounds(0, 31, 424, 235);
		panel.add(painelCampos);
		
		JComboBox comboBox = new JComboBox();
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
		textField.setColumns(10);
		textField.setBounds(129, 41, 228, 20);
		painelCampos.add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("ANO/SEMESTRE");
		lblNewLabel_1.setBounds(10, 69, 89, 14);
		painelCampos.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(129, 66, 228, 20);
		painelCampos.add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("SITUA\u00C3\u2021AO/FALTAS");
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
		panel.add(lblConsultarDisciplina);

	}

}

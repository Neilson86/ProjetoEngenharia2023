package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TelaDisciplinas extends JInternalFrame {
	private JTextField textFieldNome;
	private JTextField textFieldCargaHoraria;
	private JTextField textFieldDisciplinaCadastrada;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDisciplinas frame = new TelaDisciplinas();
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
	public TelaDisciplinas() {
		setBounds(100, 100, 530, 450);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("DISCIPLINAS");
		lblTitulo.setBounds(0, 0, 518, 20);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		getContentPane().add(lblTitulo);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setBounds(0, 149, 518, 184);
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "DADOS DISCIPLINA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		getContentPane().add(painelCampos);
		
		JLabel lblNOME = new JLabel("NOME : ");
		lblNOME.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNOME.setBounds(10, 26, 46, 14);
		painelCampos.add(lblNOME);
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		textFieldNome.setBounds(92, 23, 324, 20);
		painelCampos.add(textFieldNome);
		
		JLabel lblCARGAHORARIA = new JLabel("CARGA HORÁRIA: ");
		lblCARGAHORARIA.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCARGAHORARIA.setBounds(10, 60, 106, 14);
		painelCampos.add(lblCARGAHORARIA);
		
		textFieldCargaHoraria = new JTextField();
		textFieldCargaHoraria.setColumns(10);
		textFieldCargaHoraria.setBounds(114, 57, 302, 20);
		painelCampos.add(textFieldCargaHoraria);
		
		textFieldDisciplinaCadastrada = new JTextField();
		textFieldDisciplinaCadastrada.setColumns(10);
		textFieldDisciplinaCadastrada.setBounds(161, 95, 255, 20);
		painelCampos.add(textFieldDisciplinaCadastrada);
		
		JLabel lblDISCIPLINACADASTRADA = new JLabel("DISCIPLINA CADASTRADA : ");
		lblDISCIPLINACADASTRADA.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDISCIPLINACADASTRADA.setBounds(11, 98, 141, 14);
		painelCampos.add(lblDISCIPLINACADASTRADA);
		
		JLabel lblSala = new JLabel("SALA :\r\n");
		lblSala.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSala.setBounds(10, 139, 57, 14);
		painelCampos.add(lblSala);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(160, 136, 255, 20);
		painelCampos.add(textField);
		
		JButton btnSALVAR = new JButton("SALVAR");
		btnSALVAR.setBounds(271, 367, 89, 23);
		getContentPane().add(btnSALVAR);
		btnSALVAR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnEDITAR = new JButton("EDITAR");
		btnEDITAR.setBounds(157, 367, 89, 23);
		getContentPane().add(btnEDITAR);
		btnEDITAR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblPROFESSOR = new JLabel("PROFESSOR: ");
		lblPROFESSOR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPROFESSOR.setBounds(10, 47, 78, 13);
		getContentPane().add(lblPROFESSOR);
		
		JComboBox comboBoxPROFESSOR = new JComboBox();
		comboBoxPROFESSOR.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBoxPROFESSOR.setModel(new DefaultComboBoxModel(new String[] {"Insira um nome", "Bruno", "Elisa", "Maria D' Lourdes", "Wilton", "Andr\u00E9 Souza", "Andr\u00E9 Lemos", "Wesley", "Ant\u00F4nio", "Marcos", "J\u00FAlia"}));
		comboBoxPROFESSOR.setBounds(86, 43, 334, 21);
		getContentPane().add(comboBoxPROFESSOR);
		
		JLabel lblCURSO = new JLabel("CURSO: ");
		lblCURSO.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCURSO.setBounds(11, 97, 78, 13);
		getContentPane().add(lblCURSO);
		
		JComboBox comboBoxCURSO = new JComboBox();
		comboBoxCURSO.setModel(new DefaultComboBoxModel(new String[] {"Insira um nome", "Computa\u00E7\u00E3o", "Web Design", "Mecatr\u00F4nica", "Banco de Dados", "Engenharia de Software", "Java", "Phyton", "MSQL Server"}));
		comboBoxCURSO.setBounds(87, 93, 334, 21);
		getContentPane().add(comboBoxCURSO);

	}
}

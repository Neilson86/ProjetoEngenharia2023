package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import org.hibernate.annotations.ForeignKey;

import control.AlunoControla;
import control.DisciplinaControla;
import model.Aluno;
import model.Disciplina;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastrarDisciplinas extends JInternalFrame {
	
	@ManyToOne
	@JoinColumn(name="Coordenador", nullable =false)
	@ForeignKey(name="Coordenador_fk")
	
	private Disciplina Disciplina;
	private DisciplinaControla controle = new DisciplinaControla();
	Disciplina disciplina;
	
	private JTextField textNome;
	private JTextField textCargaHoraria;
	private JTextField textDISCIPLINACADASTRADA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastrarDisciplinas frame = new TelaCadastrarDisciplinas();
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
	public TelaCadastrarDisciplinas() {
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
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(98, 24, 353, 20);
		painelCampos.add(textNome);
		
		JLabel lblCARGAHORARIA = new JLabel("CARGA HOR�RIA: ");
		lblCARGAHORARIA.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCARGAHORARIA.setBounds(10, 60, 106, 14);
		painelCampos.add(lblCARGAHORARIA);
		
		textCargaHoraria = new JTextField();
		textCargaHoraria.setColumns(10);
		textCargaHoraria.setBounds(114, 57, 337, 20);
		painelCampos.add(textCargaHoraria);
		
		JLabel lblDISCIPLINACADASTRADA = new JLabel("DISCIPLINA CADASTRADA : ");
		lblDISCIPLINACADASTRADA.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDISCIPLINACADASTRADA.setBounds(11, 98, 141, 14);
		painelCampos.add(lblDISCIPLINACADASTRADA);
		
		textDISCIPLINACADASTRADA = new JTextField();
		textDISCIPLINACADASTRADA.setColumns(10);
		textDISCIPLINACADASTRADA.setBounds(149, 96, 302, 20);
		painelCampos.add(textDISCIPLINACADASTRADA);
		
		JButton btnSALVAR = new JButton("SALVAR");
		btnSALVAR.addActionListener(new ActionListener() {
			private JLabel txtNome;
			private JLabel txtCargaHoraria;
			private JLabel txtDisciplinaCadastrada;
			
			public void actionPerformed(ActionEvent e) {
				/*Disciplina = new Disciplina(null,txtNome.getText(),txtCargaHoraria.getText(),txtDisciplinaCadastrada.getText(),);	*/		}
		});
		btnSALVAR.setBounds(271, 367, 89, 23);
		getContentPane().add(btnSALVAR);
		btnSALVAR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnEDITAR = new JButton("EDITAR");
		btnEDITAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disciplina =new Disciplina(null,, null)*/
			}
		});
		btnEDITAR.setBounds(157, 367, 89, 23);
		getContentPane().add(btnEDITAR);
		btnEDITAR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblPROFESSOR = new JLabel("PROFESSOR: ");
		lblPROFESSOR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPROFESSOR.setBounds(10, 47, 78, 13);
		getContentPane().add(lblPROFESSOR);
		
		JComboBox cbPROFESSOR = new JComboBox();
		cbPROFESSOR.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cbPROFESSOR.setModel(new DefaultComboBoxModel(new String[] {"Insira um nome", "Bruno", "Elisa", "Maria D' Lourdes", "Wilton", "Andr\u00E9 Souza", "Andr\u00E9 Lemos", "Wesley", "Ant\u00F4nio", "Marcos", "J\u00FAlia"}));
		cbPROFESSOR.setBounds(86, 43, 334, 21);
		getContentPane().add(cbPROFESSOR);
		
		JLabel lblCURSO = new JLabel("CURSO: ");
		lblCURSO.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCURSO.setBounds(11, 97, 78, 13);
		getContentPane().add(lblCURSO);
		
		JComboBox cbCURSO = new JComboBox();
		cbCURSO.setModel(new DefaultComboBoxModel(new String[] {"Insira um nome", "Computa\u00E7\u00E3o", "Web Design", "Mecatr\u00F4nica", "Banco de Dados", "Engenharia de Software", "Java", "Phyton", "MSQL Server"}));
		cbCURSO.setBounds(87, 93, 334, 21);
		getContentPane().add(cbCURSO);

	}
}

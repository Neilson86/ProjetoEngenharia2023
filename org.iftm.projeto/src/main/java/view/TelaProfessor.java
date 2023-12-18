package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import org.hibernate.annotations.ForeignKey;

import javax.swing.JTextField;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.swing.JButton;
import javax.swing.JComboBox;
import control.ProfessorControla;
import model.Professor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaProfessor extends JInternalFrame {
	@ManyToOne
	@JoinColumn(name="Disciplina", nullable =false)
	@JoinColumn(name="Matricula", nullable =false)
	@ForeignKey(name="Disciplina_fk, Matricula_fk")
	
	private ProfessorControla controle = new ProfessorControla();
	Professor professor;
	
	private JTextField StringNome;
	private JTextField StringCPF;
	private JTextField StringCodigo;
	private JTextField StringSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProfessor frame = new TelaProfessor();
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
	public TelaProfessor() {
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(null, "CADASTRAR PROFESSOR", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		painelCampos.setBounds(0, 27, 438, 244);
		getContentPane().add(painelCampos);
		
		JLabel lblNOME = new JLabel("NOME : ");
		lblNOME.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNOME.setBounds(21, 34, 46, 14);
		painelCampos.add(lblNOME);
		
		StringNome = new JTextField();
		StringNome.setColumns(10);
		StringNome.setBounds(60, 32, 332, 20);
		painelCampos.add(StringNome);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCPF.setBounds(21, 118, 46, 14);
		painelCampos.add(lblCPF);
		
		StringCPF = new JTextField();
		StringCPF.setColumns(10);
		StringCPF.setBounds(60, 116, 332, 20);
		painelCampos.add(StringCPF);
		
		JButton btnSALVAR = new JButton("SALVAR");
		btnSALVAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				professor = new Professor(null,StringNome.getText(), StringCPF.getText(),StringSenha.getText());	
				controle.inserir(professor);
				JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso");
				StringCodigo.setText(String.valueOf(professor.getIdProfessor()));
			}
		});
		btnSALVAR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSALVAR.setBounds(303, 192, 89, 23);
		painelCampos.add(btnSALVAR);
		
		JLabel lblCODIGO = new JLabel("CODIGO: ");
		lblCODIGO.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCODIGO.setBounds(21, 78, 60, 14);
		painelCampos.add(lblCODIGO);
		
		StringCodigo = new JTextField();
		StringCodigo.setFont(new Font("Tahoma", Font.BOLD, 11));
		StringCodigo.setEnabled(false);
		StringCodigo.setColumns(10);
		StringCodigo.setBounds(70, 72, 322, 20);
		painelCampos.add(StringCodigo);
		
		JLabel lblSENHA = new JLabel("SENHA:");
		lblSENHA.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSENHA.setBounds(21, 152, 46, 14);
		painelCampos.add(lblSENHA);
		
		StringSenha = new JTextField();
		StringSenha.setColumns(10);
		StringSenha.setBounds(60, 150, 332, 20);
		painelCampos.add(StringSenha);
		
		JLabel lblTitulo = new JLabel("PROFESSOR");
		lblTitulo.setBounds(109, 10, 235, 20);
		getContentPane().add(lblTitulo);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));

	}
}

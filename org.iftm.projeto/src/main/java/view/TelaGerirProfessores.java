package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import org.hibernate.annotations.ForeignKey;

import control.DisciplinaControla;
import control.ProfessorControla;
import model.Disciplina;
import model.Professor;

import javax.swing.JTextField;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class TelaGerirProfessores extends JInternalFrame {
	
	@ManyToOne
	@JoinColumn(name="Coordenador", nullable =false)
	@ForeignKey(name="Coordenador_fk")
	
	private Professor Professor;
	/*private ProfessorControla controla = new ProfessorControla();*/
	Professor professor;
	
	private JTextField StringNOME;
	private JTextField StringCPF;
	private JTextField StringDISCIPLINACADASTRADA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGerirProfessores frame = new TelaGerirProfessores();
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
	public TelaGerirProfessores() {
		setBounds(100, 100, 546, 387);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("PROFESSORES");
		lblTitulo.setBounds(0, 0, 534, 20);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		getContentPane().add(lblTitulo);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(null, "GERIR PROFESSORES", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		painelCampos.setBounds(10, 33, 514, 315);
		getContentPane().add(painelCampos);
		
		JLabel lblNOME = new JLabel("NOME : ");
		lblNOME.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNOME.setBounds(10, 26, 46, 14);
		painelCampos.add(lblNOME);
		
		StringNOME = new JTextField();
		StringNOME.setColumns(10);
		StringNOME.setBounds(92, 23, 271, 20);
		painelCampos.add(StringNOME);
		
		JLabel lblCPF = new JLabel("CPF : ");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCPF.setBounds(10, 60, 46, 14);
		painelCampos.add(lblCPF);
		
		StringCPF = new JTextField();
		StringCPF.setColumns(10);
		StringCPF.setBounds(92, 57, 271, 20);
		painelCampos.add(StringCPF);
		
		JLabel lblDISCIPLINACADASTRADA = new JLabel("DISCIPLINA CADASTRADA : ");
		lblDISCIPLINACADASTRADA.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDISCIPLINACADASTRADA.setBounds(10, 98, 141, 14);
		painelCampos.add(lblDISCIPLINACADASTRADA);
		
		JButton btnSALVAR = new JButton("SALVAR");
		btnSALVAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSALVAR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSALVAR.setBounds(274, 148, 89, 23);
		painelCampos.add(btnSALVAR);
		
		JButton btnEDITAR = new JButton("EDITAR");
		btnEDITAR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEDITAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							}
		});
		btnEDITAR.setBounds(175, 148, 89, 23);
		painelCampos.add(btnEDITAR);
		
		JComboBox cbDisciplinas = new JComboBox();
		cbDisciplinas.setBounds(153, 94, 210, 22);
		painelCampos.add(cbDisciplinas);

	}
}

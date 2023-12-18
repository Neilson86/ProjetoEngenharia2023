package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.ForeignKey;

import control.CursoControla;

import javax.swing.JTextField;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class TelaCurso extends JInternalFrame {
	
	@ManyToOne
	@JoinColumn(name="Disciplina", nullable =false)
	@JoinColumn(name="Matricula", nullable =false)
	@JoinColumn(name="Professor", nullable =false)
	@ForeignKey(name="Disciplina_fk, Matricula_fk,Professor_fk")
	
	private TelaCurso objeto;
	private CursoControla controle = new CursoControla();
	
	private JTextField textNome;
	private JTextField textCargaHoraria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCurso frame = new TelaCurso();
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
	public TelaCurso() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(null, "CADASTRAR CURSOS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		painelCampos.setBounds(0, 27, 438, 244);
		getContentPane().add(painelCampos);
		
		JLabel lblNOME = new JLabel("NOME : ");
		lblNOME.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNOME.setBounds(20, 50, 46, 14);
		painelCampos.add(lblNOME);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(65, 48, 332, 20);
		painelCampos.add(textNome);
		
		JLabel lblCPF = new JLabel("CARGA HORÁRIA: ");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCPF.setBounds(23, 97, 101, 14);
		painelCampos.add(lblCPF);
		
		textCargaHoraria = new JTextField();
		textCargaHoraria.setColumns(10);
		textCargaHoraria.setBounds(121, 95, 271, 20);
		painelCampos.add(textCargaHoraria);
		
		JButton btnSALVAR = new JButton("SALVAR");
		btnSALVAR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSALVAR.setBounds(303, 166, 89, 23);
		painelCampos.add(btnSALVAR);
		
		JButton btnEDITAR = new JButton("EDITAR");
		btnEDITAR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEDITAR.setBounds(166, 166, 89, 23);
		painelCampos.add(btnEDITAR);
		
		JLabel lblTitulo = new JLabel("CURSOS");
		lblTitulo.setBounds(109, 10, 210, 20);
		getContentPane().add(lblTitulo);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));

	}

	public List<view.TelaProfessor> getTelaProfessor() {
		return getTelaProfessor();
	}

	public void setTelaProfessor(List<view.TelaProfessor> telaProfessor) {
		List<TelaProfessor> TelaProfessor = telaProfessor;
	}

}

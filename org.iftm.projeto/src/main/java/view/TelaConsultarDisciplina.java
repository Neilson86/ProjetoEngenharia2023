package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import org.hibernate.annotations.ForeignKey;

import control.DisciplinaControla;
import model.Curso;
import model.Disciplina;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;

public class TelaConsultarDisciplina extends JInternalFrame {
	
	@ManyToOne
	@JoinColumn(name="Aluno", nullable =false)
	@ForeignKey(name="Aluno_fk")
	
	private TelaConsultarDisciplina objeto;
	private DisciplinaControla controla = new DisciplinaControla();

	
	private JTextField textcodigo;

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
		
		JPanel painelDisciplina = new JPanel();
		painelDisciplina.setBackground(new Color(240, 240, 240));
		painelDisciplina.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "DISCIPLINAS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		painelDisciplina.setBounds(0, 31, 424, 235);
		panel.add(painelDisciplina);
		painelDisciplina.setLayout(null);
		
		
		JComboBox cbNome = new JComboBox();
		cbNome.setBounds(74, 60, 283, 22);
		painelDisciplina.add(cbNome);
		
		JButton btnFechar = new JButton("FECHAR");
		btnFechar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnFechar.setBounds(248, 167, 109, 23);
		painelDisciplina.add(btnFechar);
		
		JLabel lblNomeDisciplina = new JLabel("NOME");
		lblNomeDisciplina.setBounds(10, 63, 45, 14);
		lblNomeDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 12));
		painelDisciplina.add(lblNomeDisciplina);
		
		JLabel lblCodigoDisciplina = new JLabel("CÓDIGO");
		lblCodigoDisciplina.setBounds(10, 102, 53, 14);
		lblCodigoDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 12));
		painelDisciplina.add(lblCodigoDisciplina);
		
		textcodigo = new JTextField();
		textcodigo.setBounds(74, 100, 283, 20);
		textcodigo.setColumns(10);
		painelDisciplina.add(textcodigo);
		
		JLabel lblConsultarDisciplina = new JLabel("CONSULTAR DISCIPLINA");
		lblConsultarDisciplina.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultarDisciplina.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblConsultarDisciplina.setBounds(10, 0, 424, 20);
		panel.add(lblConsultarDisciplina);
		
	}

}

package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import control.AlunoControla;
import control.CursoControla;
import model.Aluno;
import model.Curso;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaConsultarCurso extends JInternalFrame {
	
	private CursoControla controla = new CursoControla();
	ArrayList<Curso> cursos;
	Curso curso;
	
	
	private JTextField TxtCargaHoraria;
	private JComboBox cbCurso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConsultarCurso frame = new TelaConsultarCurso();
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
	public TelaConsultarCurso() {
		
		//carregar todos os cursos cadastrados
		cursos = (ArrayList<Curso>) controla.buscarTodos();
		
		
		setBounds(100, 100, 362, 220);
		getContentPane().setLayout(null);
		
		JLabel lblConsultarCurso = new JLabel("CONSULTAR CURSO");
		lblConsultarCurso.setBounds(0, 0, 350, 20);
		lblConsultarCurso.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultarCurso.setFont(new Font("Tahoma", Font.BOLD, 16));
		getContentPane().add(lblConsultarCurso);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setBounds(0, 20, 438, 251);
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "CURSOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		getContentPane().add(painelCampos);
		
		cbCurso = new JComboBox();
		cbCurso.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//pega o indice selecionado na combobox e buscava a carga horaria na lista de curso
				int selecionado = cbCurso.getSelectedIndex();
				String ch = String.valueOf(cursos.get(selecionado).getCargaHoraria());
				TxtCargaHoraria.setText(ch);
	
				Curso cursoSelecionado = (Curso)cbCurso.getSelectedItem();
				TxtCargaHoraria.setText(String.valueOf(cursoSelecionado.getCargaHoraria()));
				
				
				//versão otimizada: pega o objeto selecionado, converte para curso e pega a carga horária.
				TxtCargaHoraria.setText(String.valueOf(((Curso)cbCurso.getSelectedItem()).getCargaHoraria()));
			}
		});
		cbCurso.setBounds(25, 37, 305, 22);
		painelCampos.add(cbCurso);
		
		JButton btnFechar = new JButton("FECHAR" + "");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFechar.setBounds(221, 132, 109, 23);
		painelCampos.add(btnFechar);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Carga Hor\u00E1ria", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(25, 69, 305, 53);
		painelCampos.add(panel);
		panel.setLayout(null);
		
		TxtCargaHoraria = new JTextField();
		TxtCargaHoraria.setText("");
		TxtCargaHoraria.setFont(new Font("Tahoma", Font.BOLD, 15));
		TxtCargaHoraria.setEnabled(false);
		TxtCargaHoraria.setBounds(10, 21, 263, 19);
		panel.add(TxtCargaHoraria);
		TxtCargaHoraria.setColumns(10);

		//primeiro copiamos os nomes dos cursos para um vetor com nomes, do mesmo tamanho e com a mesma disposição
		String nomeCursos[] = new String[cursos.size()];
		for(int i=0; i<cursos.size();i++) {
			nomeCursos[i] = cursos.get(i).getNome();
		}
		cbCurso.setModel(new DefaultComboBoxModel(nomeCursos));
		//toArray converte uma lista em um vetor
		//preenche a combobox com  o vetor de objetos cursos
		cbCurso.setModel(new DefaultComboBoxModel(cursos.toArray()));
	}
}

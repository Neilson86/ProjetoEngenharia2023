package view;
import java.time.Instant;
import java.util.Iterator;
import java.util.List;
import control.AlunoControla;
import model.Aluno;
import control.CoordenadorControla;
import model.Coordenador;
import control.CursoControla;
import model.Curso;
import control.DisciplinaControla;
import model.Disciplina;
import control.MatriculaControla;
import model.Matricula;
import control.ProfessorControla;
import model.Professor;

public class ProgramaSecretariaIftm2 {
	public static void main(String[] args) {
		//inserindo
		Aluno a1 = new Aluno("Alessandro Belizário","1023325689", "alessandrobelizario@gmail.com", Instant.parse("2007-12-03T10:15:30.00Z"), "01");
		Aluno a2 = new Aluno("Leonardo Duarte", "564231895", "leonardoduarte@gmail.com", Instant.parse("2007-12-03T10:15:30.00Z"), "02");
		Aluno a3 = new Aluno("Neilson Silva", "2013368975", "neilsonsilva@gmail.com", Instant.parse("2007-12-03T10:15:30.00Z"), "03");
		
		Coordenador co1 = new Coordenador(null, "Marcos Antônio", 222336954, "coord1");
		Coordenador co2 = new Coordenador(null, "André Santos", 1335216635, "coord2");
		Coordenador co3 = new Coordenador(null, "Maria Souza", 986235413, "coord3");
		
		Curso c1 =new Curso(null, "Computação",null);
		
		Disciplina d1 = new Disciplina(null, "Algorítmos", null);
		Disciplina d2 = new Disciplina(null, "Raciocínio Lógico", null);
		Disciplina d3 = new Disciplina(null, "Lógica de Programação", null);
		Disciplina d4 = new Disciplina(null, "Sistemas para Internet", null);
		Disciplina d5 = new Disciplina(null, "História da Computação", null);
		Disciplina d6 = new Disciplina(null, "Banco de Dados", null);
		Disciplina d7 = new Disciplina(null, "Robótica", null);
		Disciplina d8 = new Disciplina(null, "Teória da Computação", null);
		
		Matricula m1 = new Matricula(null, "Alessandro Belizário", null);
		Matricula m2 = new Matricula(null, "Leonardo Duarte", null);
		Matricula m3 = new Matricula(null, "Neilson Silva", null);
		
		Professor p1 = new Professor(null, "Carlos Jorge", 222333355, "prof1");
		Professor p2 = new Professor(null, "Bruno José", 225699874, "prof2");
		Professor p3 = new Professor(null, "Helena Santos", 598766425, "prof3");
		Professor p4 = new Professor(null, "Juliana Martins", 321564897, "prof4");
		

		AlunoControla controle1 = new AlunoControla();	
		controle1.inserir(a1);
		
		
		//buscando a1
		a1 = controle1.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
		System.out.println(a1.getNome()); // substitua por um método get do seu projeto
		
		//modificando
		a1.setNome("Neilson Lima"); // no seu caso utilize um método set do seu projeto
		controle1.alterar(a1);
		
		//buscar todos
		List<Aluno> objetos1 = controle1.buscarTodos();
		for (Iterator iterator = objetos1.iterator(); iterator.hasNext();) {
			Aluno obj = (Aluno) iterator.next();
			System.out.println(obj.getNome());
		}	
		
		//excluir objetos1
		controle1.excluir(objetos1.get(0));		
		
		//excluir por id
		controle1.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor	
		
		AlunoControla controle2 = new AlunoControla();	
		controle2.inserir(a2);
		
		//buscando a2	
		a2 = controle2.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
		System.out.println(a1.getNome()); // substitua por um método get do seu projeto	
		
		//modificando
		a2.setNome("Neilson Lima"); // no seu caso utilize um método set do seu projeto
		controle1.alterar(a2);
				
		//buscar todos
		List<Aluno> objetos2 = controle1.buscarTodos();
        for (Iterator iterator = objetos2.iterator(); iterator.hasNext();) {
		Aluno obj = (Aluno) iterator.next();
	    System.out.println(obj.getNome());
	    
        }
        
      //excluir ojetos2
      	controle2.excluir(objetos2.get(0));
      				
      //excluir por id
      	controle2.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor	
      		        	
        AlunoControla controle3 = new AlunoControla();	
		controle3.inserir(a3);
		
		//buscando a3	
	    a3 = controle3.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
	    System.out.println(a1.getNome()); // substitua por um método get do seu projeto	
	
	    //modificando
	    a3.setNome("Neilson Lima"); // no seu caso utilize um método set do seu projeto
	    controle3.alterar(a2);
			
	    //buscar todos
	    List<Aluno> objetos3 = controle3.buscarTodos();
	    for (Iterator iterator = objetos3.iterator(); iterator.hasNext();) {
	   	Aluno obj = (Aluno) iterator.next();
	    System.out.println(obj.getNome());
		}	
		
		//excluir objetos3
		controle3.excluir(objetos3.get(0));
				
		//excluir por id
		controle3.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor	
		
		// Coordenador1
		CoordenadorControla controla1 = new CoordenadorControla();	
		controla1.inserir(co1);
		
			        	
       
		CoordenadorControla controla2 = new CoordenadorControla();	
		controla2.inserir(co2);
		
		a2 = controle2.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
		System.out.println(a1.getNome()); // substitua por um método get do seu projeto	
		
		//modificando
		a2.setNome("Neilson Lima"); // no seu caso utilize um método set do seu projeto
		controle1.alterar(a2);
				
		//buscar todos
		List<Aluno> objetos2 = controle1.buscarTodos();
        for (Iterator iterator = objetos2.iterator(); iterator.hasNext();) {
		Aluno obj = (Aluno) iterator.next();
	    System.out.println(obj.getNome());
	    
        }
        
      //excluir ojetos2
      	controle2.excluir(objetos2.get(0));
      				
      //excluir por id
      	controle2.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor	
      		        	
       
		CoordenadorControla controla3 = new CoordenadorControla();	
		controla3.inserir(co3);
		
		a2 = controle2.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
		System.out.println(a1.getNome()); // substitua por um método get do seu projeto	
		
		//modificando
		a2.setNome("Neilson Lima"); // no seu caso utilize um método set do seu projeto
		controle1.alterar(a2);
				
		//buscar todos
		List<Aluno> objetos2 = controle1.buscarTodos();
        for (Iterator iterator = objetos2.iterator(); iterator.hasNext();) {
		Aluno obj = (Aluno) iterator.next();
	    System.out.println(obj.getNome());
	    
        }
        
      //excluir ojetos2
      	controle2.excluir(objetos2.get(0));
      				
      //excluir por id
      	controle2.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor	
      		        	
       
	}		
}
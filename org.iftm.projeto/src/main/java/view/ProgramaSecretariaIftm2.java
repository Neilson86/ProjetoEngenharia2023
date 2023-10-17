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
		
		
		//buscando Aluno a1
		a1 = controle1.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
		System.out.println(a1.getNome()); // substitua por um método get do seu projeto
		
		//modificando
		a1.setNome("Alessandro Belizário"); // no seu caso utilize um método set do seu projeto
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
		
		/////////////////////////////////////////////////////////////////////////////////////////
		//buscando Aluno a2	
		a2 = controle2.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
		System.out.println(a2.getNome()); // substitua por um método get do seu projeto	
		
		//modificando
		a2.setNome("Leonardo Duarte"); // no seu caso utilize um método set do seu projeto
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
      	
      	/////////////////////////////////////////////////////////////////////////////////////////	        	
        AlunoControla controle3 = new AlunoControla();	
		controle3.inserir(a3);
		
		//buscando Aluno a3	
	    a3 = controle3.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
	    System.out.println(a3.getNome()); // substitua por um método get do seu projeto	
	
	    //modificando
	    a3.setNome("Neilson Lima"); // no seu caso utilize um método set do seu projeto
	    controle3.alterar(a3);
			
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
		/////////////////////////////////////////////////////////////////////////////////////
		
		// Coordenador1
		CoordenadorControla controla1 = new CoordenadorControla();	
		controla1.inserir(co1);
		

		co1 = controla1.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
		System.out.println(co1.getNome()); // substitua por um método get do seu projeto	
		
		//modificando
		co1.setNome("Marcos Antônio"); // no seu caso utilize um método set do seu projeto
		controla1.alterar(co1);
				
		//buscar todos
		List<Coordenador> obj1 = controla1.buscarTodos();
        for (Iterator iterator = obj1.iterator(); iterator.hasNext();) {
		Coordenador obj = (Coordenador) iterator.next();
	    System.out.println(obj.getNome());
	    
        }
        
      //excluir objetos1
      	controla1.excluir(obj1.get(0));
      				
      //excluir por id
      	controla1.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor	
      		        	
		/////////////////////////////////////////////////////////////////////////////////////////	        	
       
		CoordenadorControla controla2 = new CoordenadorControla();	
		controla2.inserir(co2);
		
		co2 = controla2.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
		System.out.println(co2.getNome()); // substitua por um método get do seu projeto	
		
		//modificando
		co2.setNome("André Santos"); // no seu caso utilize um método set do seu projeto
		controla1.alterar(co2);
				
		//buscar todos
		List<Coordenador> obj2 = controla1.buscarTodos();
        for (Iterator iterator = obj2.iterator(); iterator.hasNext();) {
		Coordenador obj = (Coordenador) iterator.next();
	    System.out.println(obj.getNome());
	    
        }
        
      //excluir ojetos2
      	controla2.excluir(obj2.get(0));
      				
      //excluir por id
      	controla2.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor	
      		        	
       //////////////////////////////////////////////////////////////////////////////////////////
		CoordenadorControla controla3 = new CoordenadorControla();	
		controla3.inserir(co3);
		
		co3 = controla3.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
		System.out.println(a1.getNome()); // substitua por um método get do seu projeto	
		
		//modificando
		co3.setNome("Maria Souza"); // no seu caso utilize um método set do seu projeto
		controla3.alterar(co3);
				
		//buscar todos
		List<Coordenador> obj3 = controla3.buscarTodos();
        for (Iterator iterator = obj3.iterator(); iterator.hasNext();) {
		Coordenador obj = (Coordenador) iterator.next();
	    System.out.println(obj.getNome());
	    
        }
        
      //excluir ojetos2
      	controla3.excluir(obj3.get(0));
      				
      //excluir por id
      	controla3.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor	
      /////////////////////////////////////////////////////////////////////////////////////////////		        	
       
		// Curso
		CursoControla controla = new CursoControla();	
		controla.inserir(c1);
		

		c1 = controla.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
		System.out.println(c1.getNome()); // substitua por um método get do seu projeto	
		
		//modificando
		co1.setNome("Computação"); // no seu caso utilize um método set do seu projeto
		controla.alterar(c1);
				
		//buscar todos
		List<Curso> objt = controla.buscarTodos();
        for (Iterator iterator = objt.iterator(); iterator.hasNext();) {
		Curso objt1 = (Curso) iterator.next();
	    System.out.println(objt1.getNome());
	    
        }
        
      //excluir objetos1
      	controla.excluir(objt.get(0));
      				
      //excluir por id
      	controla.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor
      	///////////////////////////////////////////////////////////////////////////////////
      	
     // Disciplina 1
     		DisciplinaControla control1 = new DisciplinaControla();	
     		controla.inserir(c1);
     		

     		d1 = control1.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
     		System.out.println(d1.getNome()); // substitua por um método get do seu projeto	
     		
     		//modificando
     		d1.setNome("Algorítmos"); // no seu caso utilize um método set do seu projeto
     		control1.alterar(d1);
     				
     		//buscar todos
     		List<Disciplina> objto= control1.buscarTodos();
             for (Iterator iterator = objto.iterator(); iterator.hasNext();) {
     		Disciplina objto1 = (Disciplina) iterator.next();
     	    System.out.println(objto1.getNome());
     	    
             }
             
           //excluir objetos1
           	control1.excluir(objto.get(0));
           				
           //excluir por id
           	control1.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor
           	
           	///////////////////////////////////////////////////////////////////////////////////////////
           	
            // Disciplina 2
     		DisciplinaControla control2 = new DisciplinaControla();	
     		control2.inserir(d2);
     		

     		d2 = control2.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
     		System.out.println(d2.getNome()); // substitua por um método get do seu projeto	
     		
     		//modificando
     		d1.setNome("Raciocínio Lógico"); // no seu caso utilize um método set do seu projeto
     		control2.alterar(d2);
     				
     		//buscar todos
     		List<Disciplina> objet= control2.buscarTodos();
             for (Iterator iterator = objet.iterator(); iterator.hasNext();) {
     		Disciplina objet1 = (Disciplina) iterator.next();
     	    System.out.println(objet1.getNome());
     	    
             }
             
           //excluir objetos2
           	control2.excluir(objet.get(0));
           				
           //excluir por id
           	control2.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor
           	
         ////////////////////////////////////////////////////////////////////////////////////////
         // Disciplina 3
     		DisciplinaControla control3 = new DisciplinaControla();	
     		control3.inserir(d3);
     		

     		d3 = control3.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
     		System.out.println(d3.getNome()); // substitua por um método get do seu projeto	
     		
     		//modificando
     		d3.setNome("Lógica de Programação"); // no seu caso utilize um método set do seu projeto
     		control2.alterar(d3);
     				
     		//buscar todos
     		List<Disciplina> obje01= control3.buscarTodos();
             for (Iterator iterator = obje01.iterator(); iterator.hasNext();) {
     		Disciplina obje1 = (Disciplina) iterator.next();
     	    System.out.println(obje1.getNome());
     	    
             }
             
           //excluir objetos3
           	control3.excluir(obje01.get(0));
           				
           //excluir por id
           	control3.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor
        //////////////////////////////////////////////////////////////////////////////////////////
           	
         // Disciplina 4
     		DisciplinaControla control4 = new DisciplinaControla();	
     		control4.inserir(d4);
     		

     		d4 = control4.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
     		System.out.println(d4.getNome()); // substitua por um método get do seu projeto	
     		
     		//modificando
     		d4.setNome("Sistemas para Internet"); // no seu caso utilize um método set do seu projeto
     		control4.alterar(d4);
     				
     		//buscar todos
     		List<Disciplina> ob = control4.buscarTodos();
             for (Iterator iterator = ob.iterator(); iterator.hasNext();) {
     		Disciplina ob1 = (Disciplina) iterator.next();
     	    System.out.println(ob1.getNome());
     	    
             }
             
           //excluir objetos4
           	control4.excluir(ob.get(0));
           				
           //excluir por id
           	control4.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor
           	
           	//////////////////////////////////////////////////////////////////////////////////////////
           	
         // Disciplina 5
     		DisciplinaControla control5 = new DisciplinaControla();	
     		control5.inserir(d5);
     		

     		d5 = control5.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
     		System.out.println(d5.getNome()); // substitua por um método get do seu projeto	
     		
     		//modificando
     		d5.setNome("História da Computação"); // no seu caso utilize um método set do seu projeto
     		control5.alterar(d5);
     				
     		//buscar todos
     		List<Disciplina> obt = control5.buscarTodos();
            for (Iterator iterator = obt.iterator(); iterator.hasNext();) {
     		Disciplina obt1 = (Disciplina) iterator.next();
     	    System.out.println(obt1.getNome());
     	    
             }
             
           //excluir objetos5
           	control5.excluir(obt.get(0));
           				
           //excluir por id
           	control5.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor
           	
           	
           	////////////////////////////////////////////////////////////////////////////////////////////////
            // Disciplina 6
     		DisciplinaControla control6 = new DisciplinaControla();	
     		control6.inserir(d6);
     		

     		d6 = control6.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
     		System.out.println(d6.getNome()); // substitua por um método get do seu projeto	
     		
     	      		
      		//modificando
      		d6.setNome("Banco de Dados"); // no seu caso utilize um método set do seu projeto
      		control6.alterar(d6);
      				
      		//buscar todos
      		List<Disciplina> obto = control6.buscarTodos();
             for (Iterator iterator = obto.iterator(); iterator.hasNext();) {
      		Disciplina obto1 = (Disciplina) iterator.next();
      	    System.out.println(obto1.getNome());
      	    
              }
              
            //excluir objetos
            	control6.excluir(obt.get(0));
            				
            //excluir por id
            	control6.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor
            
           	////////////////////////////////////////////////////////////////////////////////////////////
           	
            // Disciplina 7
         	DisciplinaControla control7 = new DisciplinaControla();	
         	control7.inserir(d7);
         		

         	d7 = control7.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
         	System.out.println(d7.getNome()); // substitua por um método get do seu projeto	
         		
         	      		
          		//modificando
       		d7.setNome("Robótica"); // no seu caso utilize um método set do seu projeto
         	control7.alterar(d7);
          				
          		//buscar todos
          	List<Disciplina> obt01 = control7.buscarTodos();
            for (Iterator iterator = obt01.iterator(); iterator.hasNext();) {
          	Disciplina obt2 = (Disciplina) iterator.next();
          	System.out.println(obt2.getNome());
          	    
            }
                  
                //excluir objetos
            control7.excluir(obt01.get(0));
                				
                //excluir por id
            control7.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor

            ////////////////////////////////////////////////////////////////////////////////////////////////////
         // Disciplina 8
         	DisciplinaControla control8 = new DisciplinaControla();	
         	control8.inserir(d8);
         		

         	d8 = control8.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
         	System.out.println(d8.getNome()); // substitua por um método get do seu projeto	
         		
         	      		
          		//modificando
       		d8.setNome("Robótica"); // no seu caso utilize um método set do seu projeto
         	control8.alterar(d8);
          				
          		//buscar todos
          	List<Disciplina> obt02 = control7.buscarTodos();
            for (Iterator iterator = obt02.iterator(); iterator.hasNext();) {
          	Disciplina obt3 = (Disciplina) iterator.next();
          	System.out.println(obt3.getNome());
          	    
            }
                  
                //excluir objetos
            control8.excluir(obt02.get(0));
                				
                //excluir por id
            control8.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor


           	////////////////////////////////////////////////////////////////////////////////////////////////
            //Matricula 1
         	MatriculaControla contro1 = new MatriculaControla();	
         	contro1.inserir(m1);
         		

         	m1 = contro1.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
         	System.out.println(m1.getNome()); // substitua por um método get do seu projeto	
         		
         	      		
            //modificando
       		m1.setNome("Alessandro Belizário"); // no seu caso utilize um método set do seu projeto
         	contro1.alterar(m1);
          				
          	//buscar todos
          	List<Matricula> obt03 = contro1.buscarTodos();
            for (Iterator iterator = obt03.iterator(); iterator.hasNext();) {
          	Matricula obt4 = (Matricula) iterator.next();
          	System.out.println(obt4.getNome());
          	    
            }
                  
                //excluir objetos
            contro1.excluir(obt03.get(0));
                				
                //excluir por id
            contro1.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor
            /////////////////////////////////////////////////////////////////////////////////////
            
          //Matricula 2
         	MatriculaControla contro2 = new MatriculaControla();	
         	contro2.inserir(m2);
         		

         	m2 = contro1.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
         	System.out.println(m2.getNome()); // substitua por um método get do seu projeto	
         		
         	      		
            //modificando
       		m2.setNome("Leonardo Duarte"); // no seu caso utilize um método set do seu projeto
         	contro1.alterar(m2);
          				
          	//buscar todos
          	List<Matricula> obt04 = contro1.buscarTodos();
            for (Iterator iterator = obt04.iterator(); iterator.hasNext();) {
          	Matricula obt5 = (Matricula) iterator.next();
          	System.out.println(obt5.getNome());
          	    
            }
                  
                //excluir objetos
            contro2.excluir(obt04.get(0));
                				
                //excluir por id
            contro2.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor

            //////////////////////////////////////////////////////////////////////////////
            
          //Matricula 3
         	MatriculaControla contro3 = new MatriculaControla();	
         	contro3.inserir(m3);
         		

         	m3 = contro3.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
         	System.out.println(m3.getNome()); // substitua por um método get do seu projeto	
         		
         	      		
            //modificando
       		m3.setNome("Neilson Lima"); // no seu caso utilize um método set do seu projeto
         	contro3.alterar(m3);
          				
          	//buscar todos
          	List<Matricula> obt05 = contro3.buscarTodos();
            for (Iterator iterator = obt05.iterator(); iterator.hasNext();) {
          	Matricula obt6 = (Matricula) iterator.next();
          	System.out.println(obt6.getNome());
          	    
            }
                  
                //excluir objetos
            contro3.excluir(obt05.get(0));
                				
                //excluir por id
            contro3.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor


            ////////////////////////////////////////////////////////////////////////////////////////////////////
            //Professor 1
         	ProfessorControla contro4 = new ProfessorControla();	
         	contro4.inserir(p1);
         		

         	p1 = contro4.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
         	System.out.println(p1.getNome()); // substitua por um método get do seu projeto	
         		
         	      		
            //modificando
       		p1.setNome("Carlos Jorge"); // no seu caso utilize um método set do seu projeto
         	contro4.alterar(p1);
          				
          	//buscar todos
          	List<Professor> obtj4 = contro4.buscarTodos();
            for (Iterator iterator = obtj4.iterator(); iterator.hasNext();) {
          	Professor obt7 = (Professor) iterator.next();
          	System.out.println(obt7.getNome());
          	    
            }
                  
                //excluir objetos
            contro4.excluir(obtj4.get(0));
                				
                //excluir por id
            contro4.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor

            ////////////////////////////////////////////////////////////////////////////////////////////////////
            //Professor 2
         	ProfessorControla contro5 = new ProfessorControla();	
         	contro5.inserir(p2);
         		

         	p2 = contro5.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
         	System.out.println(p2.getNome()); // substitua por um método get do seu projeto	
         		
         	      		
            //modificando
       		p2.setNome("Bruno José"); // no seu caso utilize um método set do seu projeto
         	contro5.alterar(p2);
          				
          	//buscar todos
          	List<Professor> obtj5 = contro5.buscarTodos();
            for (Iterator iterator = obtj5.iterator(); iterator.hasNext();) {
          	Professor obt8 = (Professor) iterator.next();
          	System.out.println(obt8.getNome());
          	    
            }
                  
                //excluir objetos
            contro5.excluir(obtj5.get(0));
                				
                //excluir por id
            contro5.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor

           	
            ////////////////////////////////////////////////////////////////////////////////////////////////////
            //Professor 3
         	ProfessorControla contro6 = new ProfessorControla();	
         	contro6.inserir(p3);
         		

         	p3 = contro6.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
         	System.out.println(p3.getNome()); // substitua por um método get do seu projeto	
         		
         	      		
            //modificando
       		p3.setNome("Helena Santos"); // no seu caso utilize um método set do seu projeto
         	contro6.alterar(p3);
          				
          	//buscar todos
          	List<Professor> obtj6 = contro6.buscarTodos();
            for (Iterator iterator = obtj6.iterator(); iterator.hasNext();) {
          	Professor obt9 = (Professor) iterator.next();
          	System.out.println(obt9.getNome());
          	    
            }
                  
                //excluir objetos
            contro6.excluir(obtj6.get(0));
                				
                //excluir por id
            contro6.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor
	
            ////////////////////////////////////////////////////////////////////////////////////////////////////
            //Professor 4
         	ProfessorControla contro7 = new ProfessorControla();	
         	contro7.inserir(p4);
         		

         	p4 = contro7.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
         	System.out.println(p1.getNome()); // substitua por um método get do seu projeto	
         		
         	      		
            //modificando
       		p4.setNome("Juliana Martins"); // no seu caso utilize um método set do seu projeto
         	contro7.alterar(p4);
          				
          	//buscar todos
          	List<Professor> obtj7 = contro7.buscarTodos();
            for (Iterator iterator = obtj7.iterator(); iterator.hasNext();) {
          	Professor obt10 = (Professor) iterator.next();
          	System.out.println(obt10.getNome());
          	    
            }
                  
                //excluir objetos
            contro7.excluir(obtj7.get(0));
                				
                //excluir por id
            contro7.excluirPorld(3); //o id 3 precisa existir no banco, modifique o valor


	}		
}
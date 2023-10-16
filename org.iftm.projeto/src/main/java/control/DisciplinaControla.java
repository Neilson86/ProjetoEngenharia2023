package control;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Disciplina;

public class DisciplinaControla {
	private EntityManager em;

	public DisciplinaControla() {
		super();

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("secretariaiftm2");
		emf.createEntityManager();
	}
	
	public void inserir(Disciplina obj) {
		try {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
		 
	}
	
	public void alterar(Disciplina obj) {
		try {
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
	}
	
	public void excluir(Disciplina obj) {
		 try {
	            em.getTransaction().begin();
	            em.remove(obj);
	            em.getTransaction().commit();
	         } catch (Exception ex) {
	            ex.printStackTrace();
	            em.getTransaction().rollback();
	         }
	}
	
	
	private Disciplina buscarPorId(Integer id) {
		return em.find(Disciplina.class, id);
	}
	
	public void excluirPorld(Integer id) {
		 try {
			 Disciplina objeto = buscarPorId(id);
	            excluir(objeto);
	         } catch (Exception ex) {
	            ex.printStackTrace();
	         }

	}
	
	
	public List<Disciplina> buscarTodos(){
		String nomeClasse =Disciplina.class.getName();
		return em.createQuery("FROM " + nomeClasse).getResultList();
			

	}

}

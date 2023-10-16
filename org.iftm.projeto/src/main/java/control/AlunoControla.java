package control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.List;
import model.Aluno;
import model.Coordenador;

public class AlunoControla {

	private EntityManager em;

	public AlunoControla() {
		super();

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("secretariaiftm2");
		emf.createEntityManager();
	}
	
	public void inserir(Aluno obj) {
		try {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
		 
	}
	
	public void alterar(coordenador) {
		try {
            em.getTransaction().begin();
            em.merge();
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
	}
	
	public void excluir(Aluno obj) {
		 try {
	            em.getTransaction().begin();
	            em.remove(obj);
	            em.getTransaction().commit();
	         } catch (Exception ex) {
	            ex.printStackTrace();
	            em.getTransaction().rollback();
	         }
	}
	
	
	public Coordenador buscarPorId(Integer id) {
		return em.find(Aluno.class, id);
	}
	
	public void excluirPorld(Integer id) {
		 try {
	            Aluno objeto = buscarPorId(id);
	            excluir(objeto);
	         } catch (Exception ex) {
	            ex.printStackTrace();
	         }

	}
	
	
	public List<Aluno> buscarTodos(){
		String nomeClasse = Aluno.class.getName();
		return em.createQuery("FROM " + nomeClasse).getResultList();
			

	}
}

package first;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Passenger;

public class StudentMain
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("pu");
		EntityManager em =emf.createEntityManager();
		em.getTransaction().begin();
		
		Passenger p1 = new Passenger();
		p1.setPid(10);
		p1.setPname("satyanarayana");
		p1.setPage(23);
		p1.setPmobno("96030957");
		p1.setPfrom("hyd");
		p1.setPto("vizag");
		p1.setPticketid("hai-1234");
		em.persist(p1);
	
		em.getTransaction().commit();
		System.out.println("success");
		
		
	}
	

}

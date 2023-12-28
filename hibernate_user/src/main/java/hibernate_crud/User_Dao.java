package hibernate_crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class User_Dao {
 
	 public static void main(String[] args) {
		 EntityManagerFactory e=Persistence.createEntityManagerFactory("kranthi");
		 
		 EntityManager em=e.createEntityManager();
		 
		 EntityTransaction et=em.getTransaction();
		 User_Dto d1= new User_Dto();
		 d1.setNum(10);
		 d1.setName("kiran");
		 d1.setAge(23);
		 d1.setJob(" dev");
		 et.begin();
		 em.persist(d1);
		 et.commit();
	}
}

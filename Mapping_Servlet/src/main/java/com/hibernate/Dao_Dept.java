package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import jakarta.servlet.http.HttpServletRequest;

public class Dao_Dept {

	public static void deptData(HttpServletRequest rq) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Dto_Dept d = new Dto_Dept();

		d.setDid(Integer.parseInt(rq.getParameter("did")));
		d.setDname(rq.getParameter("dname"));
		d.setLoc(rq.getParameter("loc"));

		et.begin();
		em.persist(d);
		et.commit();

	}

}

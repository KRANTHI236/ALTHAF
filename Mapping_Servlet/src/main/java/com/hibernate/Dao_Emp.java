package com.hibernate;

import javax.persistence.*;

import jakarta.servlet.http.HttpServletRequest;

public class Dao_Emp {

	public static void insertEmpData(HttpServletRequest rq) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Dto_Emp d = new Dto_Emp();
		d.setEid(Integer.parseInt(rq.getParameter("id")));
		d.setEname(rq.getParameter("ename"));
		d.setEmpnum(Long.parseLong(rq.getParameter("empnum")));

	}

}

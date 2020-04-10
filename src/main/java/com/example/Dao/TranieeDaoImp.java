package com.example.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import com.example.entity.Traniee;

@Transactional
@Repository
public class TranieeDaoImp implements TranieeDao {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public String create(Traniee t) {
		// TODO Auto-generated method stub
		em.persist(t);//this object will make a reference in database table
		              //(add the data of traniee in database using the object )
		return "data inserted";
	}

	@Override
	public List<Traniee> reterive() {
		// TODO Auto-generated method stub
		String Qstr="SELECT traniee FROM Traniee traniee";
		TypedQuery<Traniee> query=em.createQuery(Qstr,Traniee.class);
		return query.getResultList();
		
	}

	@Override
	public Traniee findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Traniee.class, id);
	}
	public boolean findID(int id)
	{
		if(em.contains(em.find(Traniee.class, id)))
		{
			return true;
		}
		return false;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
		Traniee t=em.find(Traniee.class, id);//this method will which id to remove
		
		System.out.println(t.getId() +" "+t.getName()+ " "+t.getCity()+" is removed");
		
		em.remove(t);//this is object from the database
		
		
	}

	@Override
	public void update(Traniee t) {
		// TODO Auto-generated method stub
		  Traniee tranieeUpdate= em.find(Traniee.class, t.getId());		
	      tranieeUpdate.setCity(t.getCity());
	      tranieeUpdate.setName(t.getName());
	      
	      System.out.println("update ");
		
	}

	

}

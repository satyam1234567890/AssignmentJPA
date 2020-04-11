package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.TranieeDao;
import com.example.demo.entity.Traniee;

@Service
public class TranieeServiceImp implements TranieeService {
	
	@Autowired
	TranieeDao tdo;

	@Override
	public Traniee findById(int id) {
		// TODO Auto-generated method stub
		return tdo.findById(id);
	}

	@Override
	public Traniee save(Traniee t) {
		Traniee t1=null;
		if(tdo.create(t).equals("data inserted"))
		{
			return t;
		}
		return t1;
		
	}

	@Override
	public List<Traniee> findAll() {
		// TODO Auto-generated method stub
		return tdo.reterive();
	}

	@Override
	public boolean existsById(int id) {
		
		return tdo.findID(id);
	}

	@Override
	public void deleteById(int id) {
		tdo.delete(id);
		
	}

	@Override
	public void updateData(Traniee t) {
		tdo.update(t);
		
	}
	public String data()
	{
		return tdo.data1();
	}
	

}

package com.example.service;



import java.util.List;

import com.example.entity.Traniee;

public interface TranieeService {
	public Traniee findById(int id);
	public Traniee save(Traniee t);
	public List<Traniee> findAll();
	public boolean existsById(int id);
	public void deleteById(int id);
	public void updateData(Traniee t);
}

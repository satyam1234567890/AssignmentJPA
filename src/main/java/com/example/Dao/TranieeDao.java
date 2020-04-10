package com.example.Dao;

import java.util.List;


import com.example.entity.Traniee;

public interface TranieeDao {
	public String create(Traniee t);

	public List<Traniee> reterive();

	public Traniee findById(int id);

	public void delete(int id);

	public void update(Traniee t);
	public boolean findID(int id);
}

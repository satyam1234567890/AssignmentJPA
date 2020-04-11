package com.example.demo.Dao;

import java.util.List;

import com.example.demo.entity.Traniee;

public interface TranieeDao {
	public String create(Traniee t);

	public List<Traniee> reterive();

	public Traniee findById(int id);

	public void delete(int id);

	public void update(Traniee t);
	public boolean findID(int id);
	public String data1();
}

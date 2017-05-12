package ph.com.alliance.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ph.com.alliance.entity.Mytable;

public interface MyTableDao {
	public List<String> getList();
	
	public List<Mytable> getMyTables(EntityManager em);

	public void insert(EntityManager em, Mytable myTable);

	public void update(EntityManager em, Mytable myTable);
	
	public void delete(EntityManager em, int id);
}

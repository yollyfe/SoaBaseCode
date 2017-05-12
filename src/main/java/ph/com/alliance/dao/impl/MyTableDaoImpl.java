package ph.com.alliance.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ph.com.alliance.dao.MyTableDao;
import ph.com.alliance.entity.Mytable;

@Repository("myTableDao")
public class MyTableDaoImpl implements MyTableDao {

	@Override
	public List<String> getList() {
		/*** PERFORM QUERY HERE ***/
		
		//QUERY FINISHED
		
		List<String> myList = null ; // myList = myQuery.getResult();
		
		myList = new ArrayList<String>();
		for(int counter = 0 ; counter < 10 ; counter++) {
			myList.add("THIS IS NEW STRING == " + counter);
		}
		return myList;
	}

	@Override
	public List<Mytable> getMyTables(EntityManager em) {
		List<Mytable> myTableList = null;
		///
		Query myTableQuery = em.createQuery("FROM Mytable");
		//myTableQuery.setParameter("minimumAge", minAge);
		//myTableQuery.setParameter("maximumAge", maxAge);
		myTableList = myTableQuery.getResultList();
		
		return myTableList;
	}

	@Override
	public void insert(EntityManager em, Mytable myTable) {
		em.persist(myTable); // used purely for insertion
	}

	@Override
	public void update(EntityManager em, Mytable myTable) {
		em.merge(myTable); // can be used for insert / update
	}
	
	/*@Override
	public void delete(EntityManager em, Mytable myTable) {
		em.remove(myTable); 
	}*/
	
	@Override
    public void delete(EntityManager em, int id) {
		Mytable table = em.find(Mytable.class, id);
		em.remove(table);
		
		
		
	}
	 /*Mytable myTable = (myTable) sessionFactory.getCurrentSession().load(
			 Mytable.class, id);
        if (null != myTable) {
            this.sessionFactory.getCurrentSession().delete(myTable);
        }
 
    }*/

}

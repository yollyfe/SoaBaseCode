package ph.com.alliance.service.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Service;

import ph.com.alliance.dao.MyTableDao;
import ph.com.alliance.entity.Mytable;
import ph.com.alliance.service.MyFunctionService;

@Service("myFunctionService")
public class MyFunctionServiceImpl implements MyFunctionService {

	@Autowired
	private MyTableDao myTableDao;

	@Autowired
	private JpaTransactionManager transactionManager;

	@Override
	public List<String> getList() {
		return myTableDao.getList();
	}

	@Override
	public List<Mytable> getMyTables() {
		EntityManager em = transactionManager.getEntityManagerFactory()
				.createEntityManager();
		List<Mytable> myTableList = null;
		try {
			myTableList = myTableDao.getMyTables(em, 0, 99);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (em.isOpen())
				em.close();
		}

		return myTableList;
	}

	@Override
	public void insertMyTable(Mytable myTable) {
		EntityManager em = transactionManager.getEntityManagerFactory()
				.createEntityManager();
		try {
			em.getTransaction().begin();
			myTableDao.insert(em, myTable);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
		} finally {
			if (em.isOpen())
				em.close();
		}
	}

	@Override
	public void updateMyTable(Mytable myTable) {
		EntityManager em = transactionManager.getEntityManagerFactory()
				.createEntityManager();
		try {
			em.getTransaction().begin();
			myTableDao.update(em, myTable);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
		} finally {
			if (em.isOpen())
				em.close();
		}
	}
	
	/*@Override
	public void deleteMyTable(Mytable myTable) {
		EntityManager em = transactionManager.getEntityManagerFactory()
				.createEntityManager();
		try {
			em.getTransaction().begin();
			myTableDao.delete(em, myTable);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
		} finally {
			if (em.isOpen())
				em.close();
		}
	}*/
	
	/*@Override
    @Transactional
    public void delete(Integer id) {
		myTableDao.delete(id);
	}*/
	@Override
	public void deleteMyTable(int id) {
		EntityManager em = transactionManager.getEntityManagerFactory()
				.createEntityManager();
		try {
			em.getTransaction().begin();
			myTableDao.delete(em, id);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
		} finally {
			if (em.isOpen())
				em.close();
		}
	}
}

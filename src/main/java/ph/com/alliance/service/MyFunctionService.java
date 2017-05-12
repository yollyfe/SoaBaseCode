package ph.com.alliance.service;

import java.util.List;

import ph.com.alliance.entity.Mytable;

public interface MyFunctionService {
	public List<String> getList();
	
	public List<Mytable> getMyTables();

	public void insertMyTable(Mytable myTable);

	public void updateMyTable(Mytable myTable);
	
	public void deleteMyTable(Mytable myTable);
}

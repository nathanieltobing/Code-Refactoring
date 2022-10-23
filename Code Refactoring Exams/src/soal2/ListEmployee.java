package soal2;


import java.util.Vector;

public class ListEmployee{
	private Vector<Employee> list = new Vector<>();
	int max = 100;

	public Vector<Employee> getEmployeeList(){
		return list;
	}

	public void addEmployee(Employee emp)throws Exception{
		if (list.size() > max){
			throw new Exception("Employee list has exceeded the limit");
		}
		list.add(emp);
	}

	public void viewEmployeeList(){
		for(int i=0;i<list.size();i++){
			System.out.printf("%s - %s\n",list.get(i).getNip(), list.get(i).getNama());
		}
	}
}

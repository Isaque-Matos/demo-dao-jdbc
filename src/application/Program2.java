package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: department findById ===");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);

		
		 System.out.println("=== TEST 2: department insert ==="); Department
		 newDepartment = new Department(5,"D1"); departmentDao.insert(newDepartment);
		 System.out.println("\nInserted! New id = " + newDepartment.getId());
		  
		 System.out.println("=== TEST 3: department delete ===");
		 departmentDao.deleteById(6); System.out.println("ID deleted!");
		  
		 System.out.println("=== TEST 4: department update ==="); dep =
		 departmentDao.findById(5); dep.setName("D2"); departmentDao.update(dep);
		 System.out.println("Update completed");
		  
		 System.out.println("=== TEST 5: department findAll ===");
		 List<Department> list = departmentDao.findAll();
		 for (Department d : list) {
			System.out.println(d);
		}
	}

}

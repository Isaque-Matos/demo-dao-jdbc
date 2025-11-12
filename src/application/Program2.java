package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


public class Program2 {

	public static void main(String[] args) {
	
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);
		
		System.out.println("=== TEST 2: department insert ===");
		Department newDepartment = new Department(5,"D1");
		departmentDao.insert(newDepartment);
		System.out.println("\nInserted! New id = " + newDepartment.getId());
	}

}

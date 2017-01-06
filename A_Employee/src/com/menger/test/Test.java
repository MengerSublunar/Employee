package com.menger.test;

import java.util.List;

import com.menger.dao.EmpDao;
import com.menger.entity.Employee;

public class Test {

	public static void main(String[] args) {
		EmpDao dao = new EmpDao();
		System.out.println(dao.findCount());
		List<Employee> list = dao.findPage(3, 5);
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}

}

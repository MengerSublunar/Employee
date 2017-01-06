package com.menger.service;

import java.util.List;
import com.menger.dao.EmpDao;
import com.menger.entity.Employee;
import com.menger.entity.PageBean;

public class EmpService {

	/**
	 * 一个已经封装好各项属性的PageBean
	 * @param currentPage 当前页
	 * @param pageSize 页面的大小
	 * @return
	 */
	public PageBean queryPage(int currentPage, int pageSize) {
		PageBean pb = new PageBean();
		EmpDao dao = new EmpDao();
		int count = dao.findCount();
		List<Employee> data = dao.findPage(currentPage, pageSize);
		pb.setTotalCount(count);
		pb.setData(data);
		pb.setCurrentPage(currentPage);
		pb.setPageSize(pageSize);
		return pb;
	}

}

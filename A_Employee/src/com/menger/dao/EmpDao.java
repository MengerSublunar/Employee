package com.menger.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.menger.entity.Employee;
import com.menger.utils.jdbcUtils;

/*
 * Dao类，主要用于查询数据库中所有的记录的个数还有指定分页的数据
 */
public class EmpDao {

	QueryRunner runner = new QueryRunner(jdbcUtils.getDataSource());

	/**
	 * 查询所有的记录数
	 */

	public int findCount() {
		try {
			int count = runner.query("select count(*) from employee",
					new ScalarHandler<Long>()).intValue();
			return count;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * 查询某一页的数据
	 * 
	 * @param currentPage
	 *            当页是第几页
	 * @param pageSize
	 *            页面的大小
	 */

	public List<Employee> findPage(int currentPage, int pageSize) {
		int begin = (currentPage - 1) * pageSize;
		try {
			return runner.query("select * from employee limit ?,?",
					new BeanListHandler<Employee>(Employee.class), begin,
					pageSize);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}

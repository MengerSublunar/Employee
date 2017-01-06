package com.menger.utils;

import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/*
 * 工具类，用于获取一个数据源对象
 */
public class jdbcUtils {

	private static ComboPooledDataSource ds = new ComboPooledDataSource();

	public static DataSource getDataSource() {
		return ds;
	}

}

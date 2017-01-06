package com.menger.entity;

import java.util.List;

/*
 * 页面内容实体类
 */
public class PageBean {

	private int firstPage; // 首页
	private int previousPage; // 上一页
	private int nextPage; // 下一页
	private int lastPage; // 末页
	private int currentPage; // 当前页
	private int pageSize; // 页面大小
	private List<Employee> data; // 当前页的数据
	private int totalCount; // 共有多少条

	public PageBean() {
		super();
	}

	public PageBean(int firstPage, int previousPage, int nextPage,
			int lastPage, int currentPage, int pageSize, List<Employee> data,
			int totalCount) {
		super();
		this.firstPage = firstPage;
		this.previousPage = previousPage;
		this.nextPage = nextPage;
		this.lastPage = lastPage;
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.data = data;
		this.totalCount = totalCount;
	}

	public int getFirstPage() {
		return 1;
	}

	public int getPreviousPage() {
		if (getCurrentPage() > 1) {
			return getCurrentPage() - 1;
		} else {
			return 1;
		}
	}

	public int getNextPage() {
		if (getCurrentPage() < getLastPage()) {
			return getCurrentPage() + 1;
		} else {
			return getLastPage();
		}
	}

	public int getLastPage() {
		if (getTotalCount() % getPageSize() == 0) {
			return getTotalCount() / getPageSize();
		} else {
			return getTotalCount() / getPageSize() + 1;
		}
	}

	public void setFirstPage(int firstPage) {
		this.firstPage = firstPage;
	}

	public void setPreviousPage(int previousPage) {
		this.previousPage = previousPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<Employee> getData() {
		return data;
	}

	public void setData(List<Employee> data) {
		this.data = data;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

}

package com.menger.entity;

/*
 * 员工实体类
 */
public class Employee {

	private int id;
	private String name; // 姓名
	private String gender; // 性别
	private int age; // 年龄
	private String title; // 职位
	private String phone; // 电话
	private String email; // 邮箱

	public Employee() {
		super();
	}

	public Employee(int id, String name, String gender, int age, String title,
			String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.title = title;
		this.phone = phone;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender
				+ ", age=" + age + ", title=" + title + ", phone=" + phone
				+ ", email=" + email + "]";
	}

}

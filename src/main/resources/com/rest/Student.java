package com.rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Date 2019/3/8
 * @author himi
 *
 */
@XmlRootElement
public class Student {
	private int id;
	private String name;
	private String sex;
	private int age;
	

	public Student(int id,String name,String sex,int age) {
		this.id = id;
		this.age = age;
		this.sex = sex;
		this.name = name;
	}
	@XmlElement
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}



	@XmlElement
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}



	@XmlElement
	public String getSex() {
		return sex;
	}




	public void setSex(String sex) {
		this.sex = sex;
	}



	@XmlElement
	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	/*public static class Builder{
	
		private int id;
		private String name;
		private String sex;
		private int age;
		
		public Builder id(int id) {
			this.id=id;
			return this;
		}
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		public Builder sex(String sex) {
			this.sex = sex;
			return this;
		}
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		
		//...
		
		public Student build() {
			Student stu = new Student();
			stu.setId(id);
			stu.setName(name);
			stu.setSex(sex);
			stu.setAge(age);
			
			return stu;
		}
		
		public static Builder newBuilder() {
			return new Builder();
		}
		
	}*/

}

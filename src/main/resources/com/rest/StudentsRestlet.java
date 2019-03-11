package com.rest;
import java.util.Arrays;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;

//import com.rest.Student.Builder;


@Path("/v1/student")
public class StudentsRestlet {
	
	Student stu1 = new Student(1,"zhangsan","man",23);
	Student stu2 = new Student(2,"lisa","women",21);
	@GET
	@Produces(value= {"application/json"})
	public List<Student> students(){
		
		return Arrays.asList(
				stu1,stu2
				//Student.Builder.newBuilder().id(1).name("zhangsan").sex("man").age(23).build(),
				//Student.Builder.newBuilder().id(2).name("lisi").sex("women").age(21).build()
				
				);
	
	}
	
	@GET
	@Path("{id}")
	@Produces(value= {"application/json"})
	public Student filterById(@NotNull @PathParam("id") int id) {
		switch(id) {
		case 1:
			return stu1;
			//Student.Builder.newBuilder().id(1).name("zhangsan").sex("man").age(23).build();
		case 2:
			return stu2;
			//Student.Builder.newBuilder().id(2).name("lisi").sex("women").age(21).build();
		default:
			throw new WebApplicationException("Stack not found, id: " + id, 404);
		}
	}
	
	

}







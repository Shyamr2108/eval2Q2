package com.masai.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = {"com.masai.app"})
@PropertySource("app.properties")
public class AppConfig {
	
	@Bean(name = {"personService"})
	public PersonService getPersonService() {
		PersonService personService=new PersonService();
		personService.setTheMap(getMap());
		personService.setTheList(getList());
		return personService;
	}
	
	@Bean
	public Map<Person,Gym> getMap(){
		Map<Person,Gym> map=new HashMap<Person,Gym>();

		Person per2=new Person(10,"Shyam","Shyam@gmail.com",46,"99999999");
		Person per3=new Person(20,"Shreya","Shreya@gmail.com",45,"8888888");
		map.put(getPerson(), getGym());
		map.put(per2,getGym());
		map.put(per3,getGym());
		return map;
	}
	
	@Bean
	public List<Person> getList(){
		List<Person> persons=new ArrayList<Person>();
		Person per2=new Person(10,"Shyam","Shyam@gmail.com",46,"99999999");
		Person per3=new Person(20,"Shreya","Shreya@gmail.com",45,"88888888");
		Person per4=new Person(30,"Rohan","Rohan@gmail.com",44,"77777777777");
		Person per5=new Person(50,"Rahul","rahul",43,"8375444974");
		persons.add(getPerson());
		persons.add(per2);
		persons.add(per3);
		persons.add(per4);
		persons.add(per5);
		return persons;
	}
	
	//@Scope("prototype")
	@Bean
	public Person getPerson() {
		return new Person(1,"sankalp","sankalp@gmail.com",41,"0000000");
	}
	
	@Bean
	public Gym getGym() {
		return new Gym(100,"gold",1000);
	}

}

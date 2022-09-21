package com.example.demo.PaseengerEntity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PassengerApplication {
	
	 ArrayList<Passenger> list=new ArrayList<Passenger>();
	 public PassengerApplication() {
	       list.add(new Passenger(101,"abhi",23,"male"));
	       list.add(new Passenger(102,"sai",22,"male"));
	       list.add(new Passenger(103,"vinaya",21,"female"));
	       list.add(new Passenger(104,"vishal",24,"male"));
	       list.add(new Passenger(105,"vikky",25,"male"));
	       list.add(new Passenger(106,"kishore",26,"male"));
	       list.add(new Passenger(107,"akhila",27,"female"));
	       list.add(new Passenger(108,"ajay",28,"male"));
	       list.add(new Passenger(109,"jay",29,"male"));
	       list.add(new Passenger(110,"vijay",23,"male"));
	       
	       for(Passenger s:list)
	    	   System.out.println(s.toString());       
	 }
	 
	 @RequestMapping("/")
	 public String welcome() {
		 return "Passenger Community";
	 }
	 @RequestMapping("/all")
	 public List<Passenger> getPassenger(){
		 return list;
	 }
 }
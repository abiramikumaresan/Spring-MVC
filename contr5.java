package com.i18n.firstdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class contr5 {
   
	List<student> l1=new ArrayList<student>(Arrays.asList(new student("Abi",21,01,"i18n"),(new student("Balu",25,02,"i18n"))));
	@Autowired
	abiservice as;
	
	@RequestMapping("/hello")
	public  List<student> display()
	{
		return l1;
	}
	public List<student> getdata()
	   {   

		 return as.getservice();	 
	  }
	
	@RequestMapping(method=RequestMethod.PUT,value="/data/{nam}")
	
	public void update(@PathVariable String nam,@RequestBody student s1)
	{
		as.updatamystudent(nam, s1);
	}
	}

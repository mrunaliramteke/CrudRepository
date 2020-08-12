package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Employee;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@GetMapping("/getEmployee")
	public String getEmployee() {
		return "Hello Employee";
	}

	@GetMapping("/getAllEmployee")
	public List<String> getAllEmployee(){
		List<String> list = new ArrayList<>();
		list.add("Darshit");
		list.add("Ayush");
		list.add("Ritesh");
		return list;
	}
	
	/*IND -> MH ->PUNE, NAGPUR, MUMBAI
	IND -> GJ ->RAJKOT, BARODA, AHEMDABAD	
	IND -> RJ ->JAIPUR	IND -> DELHI ->NULL	*/
	
	@GetMapping("/getIndCities")	
	public Map<String, HashMap<String, List<String>>> getCities() {
  List<String> mhcity = new ArrayList<String>();
  mhcity.add("Pune");
  mhcity.add("Mumbai");
  mhcity.add("Nagpur");  
  List<String> gjcity = new ArrayList<String>();
  gjcity.add("Rajkot");
  gjcity.add("Baroda");
  gjcity.add("Ahmedabad");  
  List<String> rjcity = new ArrayList<String>();
  rjcity.add("Ajmer");
  rjcity.add("Jaipur");  
  List<String> delhicity = new ArrayList<String>();
  delhicity.add(null);
  HashMap<String, List<String>> indstate = new HashMap<>();
  indstate.put("MH", mhcity);
  indstate.put("GJ", gjcity);
  indstate.put("RJ", rjcity);
  indstate.put("DEL", delhicity);
  Map<String, HashMap<String, List<String>>> Country1 = new java.util.HashMap<String, HashMap<String,List<String>>>();
   Country1.put("IND", indstate);
return Country1;

}
	
	@GetMapping("/getEmp")
    public List<Employee>  getEmp() {
		Employee employee = new Employee(1, "Mrunali", "Nagpur", "1234565432");
		Employee employee2 = new Employee(2, "Yash", "Pune", "1234565432");
		Employee employee3 = new Employee(3, "Aditya", "Hydrabad", "1234565432");
		Employee employee4 = new Employee(4, "Ayush", "Bhutan", "1234565432");
		List<Employee> list = new ArrayList<Employee>();
		list.add(employee);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);

		return list;
    }

}
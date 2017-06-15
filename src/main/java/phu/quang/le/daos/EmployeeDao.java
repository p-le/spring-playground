package phu.quang.le.daos;

import java.util.List;

import phu.quang.le.models.Employee;

public interface EmployeeDao {
	 
  Employee findById(int id);

  void saveEmployee(Employee employee);
   
  void deleteEmployeeBySsn(String ssn);
   
  List<Employee> findAllEmployees();

  Employee findEmployeeBySsn(String ssn);

}
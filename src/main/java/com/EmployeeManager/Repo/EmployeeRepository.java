package com.EmployeeManager.Repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeManager.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Employee getByName(String name);

    Employee findByName(String name);
}
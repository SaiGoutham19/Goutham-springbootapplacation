package com.gouthaminfotech.employee_info.repository;

import com.gouthaminfotech.employee_info.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employeerepository extends JpaRepository<Employee, Integer> {
}

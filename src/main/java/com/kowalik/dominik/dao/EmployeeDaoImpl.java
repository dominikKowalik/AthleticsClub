package com.kowalik.dominik.dao;

import com.kowalik.dominik.model.Employee;
import org.springframework.stereotype.Repository;

/**
 * Created by dominik on 2016-12-26.
 */

@Repository("employeeDaoImpl")
public class EmployeeDaoImpl implements DaoInterface<Employee> {
    @Override
    public String getClassName() {
        return Employee.class.getName();
    }
}

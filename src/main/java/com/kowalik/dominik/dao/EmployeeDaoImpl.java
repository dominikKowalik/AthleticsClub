package com.kowalik.dominik.dao;

import com.kowalik.dominik.model.Employee;

/**
 * Created by dominik on 2016-12-26.
 */
public class EmployeeDaoImpl implements DaoInterface<Employee> {
    @Override
    public String getClassName() {
        return Employee.class.getName();
    }
}

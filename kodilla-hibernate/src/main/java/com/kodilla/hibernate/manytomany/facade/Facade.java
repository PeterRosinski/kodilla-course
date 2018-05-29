package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    CompanyDao companyDao;

    public List<Employee> retrieveEmployeesWithGivenPartOfLastName(String partOfLastname) {
        return employeeDao.retrieveEmployeesWithGivenPartOfLastName('%' + partOfLastname + '%');
    }

    public List<Company> retrieveCompaniesWithPartOfName(String partOfName) {
        return companyDao.retrieveCompaniesWithPartOfName('%' + partOfName + '%');
    }

}

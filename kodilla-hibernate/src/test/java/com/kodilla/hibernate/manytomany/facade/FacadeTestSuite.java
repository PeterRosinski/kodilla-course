package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    CompanyDao companyDao;

    @Autowired
    Facade facade;

    private Employee johnSmith;
    private Employee stephanieClarckson;
    private Employee lindaKovalsky;
    private Company softwareMachine;
    private Company dataMaesters;
    private Company greyMatter;

    private int softwareMachineId;
    private int dataMaestersId;
    private int greyMatterId;

    private void prepareDataToTest() {
        johnSmith = new Employee("John", "Smith");
        stephanieClarckson = new Employee("Stephanie", "Clarckson");
        lindaKovalsky = new Employee("Linda", "Kovalsky");

        softwareMachine = new Company("Software Machine");
        dataMaesters = new Company("Data Maesters");
        greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);
    }

    private void saveDataInDatabase() {
        companyDao.save(softwareMachine);
        softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        greyMatterId = greyMatter.getId();
    }

    private void cleanUpDatabase() {
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testQueryRetrievingCompaniesWithPartOfName() {
        //Given
        prepareDataToTest();
        saveDataInDatabase();

        //When
        List<Company> resultList = facade.retrieveCompaniesWithPartOfName("ma");

        //Then
        Assert.assertEquals(3, resultList.size());

        //CleanUp
        cleanUpDatabase();
    }

    @Test
    public void testQueryRetrievingEmployeesWithPartOfLastname() {
        //Given
        prepareDataToTest();
        saveDataInDatabase();

        //When
        List<Employee> resultList = facade.retrieveEmployeesWithGivenPartOfLastName("larck");

        //Then
        Assert.assertEquals(1, resultList.size());

        //CleanUp
        cleanUpDatabase();
    }

}
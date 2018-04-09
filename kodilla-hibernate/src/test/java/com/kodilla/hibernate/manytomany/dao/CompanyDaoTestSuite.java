package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    CompanyDao companyDao;

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
    public void testSaveManyToMany(){
        //Given
        prepareDataToTest();

        //When
        saveDataInDatabase();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        cleanUpDatabase();
    }

    @Test
    public void testQueryRetrievingEmployeesWithSpecificLastName(){
        //Given
        prepareDataToTest();
        saveDataInDatabase();

        //When
        List<Employee> resultList = employeeDao.retrieveEmployeesWithSpecificLastName("Smith");

        //Then
        Assert.assertEquals(1, resultList.size());

        //CleanUp
        cleanUpDatabase();
    }

    @Test
    public void testQueryRetrievingCompaniesWithNamesStartingWith() {
        //Given
        prepareDataToTest();
        saveDataInDatabase();

        //When
        List<Company> resultList = companyDao.retrieveCompaniesWithNamesStartingWith("sof");

        //Then
        Assert.assertEquals(1, resultList.size());

        //CleanUp
        cleanUpDatabase();
    }
}

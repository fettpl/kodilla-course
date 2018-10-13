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

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    SearchFacade searchFacade;

    @Test
    public void testEmployeeFacade() {
        // Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        // When
        List<String> findByName = searchFacade.employeeFindByName("Steph");

        // Then
        Assert.assertEquals(1, findByName.size());

        // CleanUp
        try {
            employeeDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testCompanyFacade() {
        // Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        Company dataMatter = new Company("Data Matter");

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);
        companyDao.save(dataMatter);

        // When
        List<String> findByPrefix = searchFacade.companyFindByNamePart("Data");

        // Then
        Assert.assertEquals(2, findByPrefix.size());

        // CleanUp
        try {
            companyDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }
}

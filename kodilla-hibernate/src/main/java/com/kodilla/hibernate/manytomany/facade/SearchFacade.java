package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchFacade {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    public List<String> employeeFindByName(String arg) {
        return employeeDao.retrieveEmployeeByAnyName(arg).stream()
                .map(e -> e.getLastname())
                .collect(Collectors.toList());
    }

    public List<String> companyFindByNamePart(String arg) {
        return companyDao.retrieveCompanyByAnyName(arg).stream()
                .map(c -> c.getName())
                .collect(Collectors.toList());
    }
}

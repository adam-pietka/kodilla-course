package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

@Transactional
@SpringBootTest
public class FinderFacadeTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private FinderFacade finderFacade;

    @Test
    void testFinByName(){

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);
        companyDao.findAll();

        FinderFacade finderFacade = new FinderFacade(companyDao);
        finderFacade.findByName("COMPANY_NAME" , "ae");
    }
}

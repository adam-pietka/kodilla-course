package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.springframework.stereotype.Service;

@Service
public class FinderFacade {

    private final CompanyDao companyDao;


    public FinderFacade(CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    public void findByName(String field, String compName){
        compName = "%" + compName + "%";
        companyDao.retrieveCompanyByFragmentName(field, compName );

    }
}
package maven.companymanagement.serviceimple.countryserviceimple;

import java.util.List;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Country;
import maven.companymanagement.service.countryservice.FetchCountryService;

public class FetchCountryServiceImple implements FetchCountryService {

    @Override
    public List<Country> getCountryList() {
        EntityManager em = DbConnection.dbCon().createEntityManager();

        List<Country> countryList =em.createQuery("from Country", Country.class).getResultList();

        return countryList;
    }
}
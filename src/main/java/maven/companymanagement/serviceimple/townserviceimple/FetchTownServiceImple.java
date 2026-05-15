package maven.companymanagement.serviceimple.townserviceimple;

import java.util.List;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Town;
import maven.companymanagement.service.townservice.FetchTownService;

public class FetchTownServiceImple implements FetchTownService {

    @Override
    public List<Town> getTownList() {

        EntityManager em =DbConnection.dbCon().createEntityManager();

        List<Town> townList = em.createQuery("from Town", Town.class).getResultList();

        return townList;
    }
}
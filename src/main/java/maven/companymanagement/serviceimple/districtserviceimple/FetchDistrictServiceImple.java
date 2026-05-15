package maven.companymanagement.serviceimple.districtserviceimple;

import java.util.List;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.District;
import maven.companymanagement.service.districtservice.FetchDistrictService;

public class FetchDistrictServiceImple implements FetchDistrictService {

    @Override
    public List<District> getDistrictList() {

        EntityManager em =DbConnection.dbCon().createEntityManager();
        List<District> districtList = em.createQuery("from District", District.class).getResultList();       
        return districtList;
    }
}
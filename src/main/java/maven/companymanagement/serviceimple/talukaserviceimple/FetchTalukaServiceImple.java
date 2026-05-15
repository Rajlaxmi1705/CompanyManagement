
package maven.companymanagement.serviceimple.talukaserviceimple;

import java.util.List;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Taluka;
import maven.companymanagement.service.talukaservice.FetchTalukaService;

public class FetchTalukaServiceImple implements FetchTalukaService {

    @Override
    public List<Taluka> getTalukaList() {
        EntityManager em = DbConnection.dbCon().createEntityManager();
        List<Taluka> talukaList = em.createQuery("from Taluka", Taluka.class).getResultList();

        return talukaList;
    }
}
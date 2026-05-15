package maven.companymanagement.serviceimple.deptserviceimple;

import java.util.List;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Dept;
import maven.companymanagement.service.deptservice.FetchDeptService;

public class FetchDeptServiceImple implements FetchDeptService {

    @Override
    public List<Dept> getDeptList() {

        EntityManager em = DbConnection.dbCon().createEntityManager();
        List<Dept> deptList =em.createQuery("from Dept", Dept.class).getResultList();
        return deptList;
    }
}
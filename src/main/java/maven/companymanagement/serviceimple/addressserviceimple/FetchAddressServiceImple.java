package maven.companymanagement.serviceimple.addressserviceimple;

import java.util.List;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Address;
import maven.companymanagement.service.addressservice.FetchAddressService;

public class FetchAddressServiceImple implements FetchAddressService {

    @Override
    public List<Address> getAddressList() {

        EntityManager em =DbConnection.dbCon().createEntityManager();
        List<Address> addressList = em.createQuery("from Address", Address.class) .getResultList();

        return addressList;
    }
}
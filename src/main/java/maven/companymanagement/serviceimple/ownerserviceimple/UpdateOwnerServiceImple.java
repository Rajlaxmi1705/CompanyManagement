package maven.companymanagement.serviceimple.ownerserviceimple;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Address;
import maven.companymanagement.entity.Owner;
import maven.companymanagement.service.ownerservice.UpdateOwnerService;
import maven.companymanagement.serviceimple.addressserviceimple.FetchAddressServiceImple;

public class UpdateOwnerServiceImple implements UpdateOwnerService {

    @Override
    public void updateOwner() {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Owner Id");
        int id = s1.nextInt();

        EntityManager em = DbConnection.dbCon().createEntityManager();
        Owner o1 = em.find(Owner.class, id);
            System.out.println("Enter New Owner Name");
            o1.setName(s1.next());
            
            FetchAddressServiceImple fa = new FetchAddressServiceImple();
            List<Address> addressList = fa.getAddressList();
            System.out.println(addressList);
            System.out.println("Select Address Index");
            int aIndex = s1.nextInt();
            o1.setAddress(addressList.get(aIndex));
            em.getTransaction().begin();
            em.merge(o1);
            em.getTransaction().commit();

            System.out.println("Owner Updated");
  
    }
}
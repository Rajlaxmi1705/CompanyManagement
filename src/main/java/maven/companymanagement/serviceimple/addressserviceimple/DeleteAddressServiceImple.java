package maven.companymanagement.serviceimple.addressserviceimple;

import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Address;
import maven.companymanagement.service.addressservice.DeleteAddressService;

public class DeleteAddressServiceImple implements DeleteAddressService {

    @Override
    public void deleteAddress() {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Address Id");
        int id = s1.nextInt();

        EntityManager em =DbConnection.dbCon() .createEntityManager();
        Address a1 = em.find(Address.class, id);
        em.getTransaction().begin();
            em.remove(a1);
            em.getTransaction().commit();
            System.out.println("Address Deleted");

    }
}
package maven.companymanagement.serviceimple.managerserviceimple;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import maven.companymanagement.dbconnection.DbConnection;
import maven.companymanagement.entity.Address;
import maven.companymanagement.entity.Dept;
import maven.companymanagement.entity.Manager;
import maven.companymanagement.service.managerservice.UpdateManagerService;
import maven.companymanagement.serviceimple.addressserviceimple.FetchAddressServiceImple;
import maven.companymanagement.serviceimple.deptserviceimple.FetchDeptServiceImple;

public class UpdateManagerServiceImple implements UpdateManagerService {

    @Override
    public void updateManager() {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Manager Id");
        int id = s1.nextInt();

        EntityManager em = DbConnection.dbCon().createEntityManager();

        Manager m1 = em.find(Manager.class, id);

            System.out.println("Enter New Manager Name");
            m1.setName(s1.next());

            FetchAddressServiceImple fa = new FetchAddressServiceImple();
            List<Address> addressList = fa.getAddressList();

            System.out.println(addressList);
            System.out.println("Select Address Index");
            int aIndex = s1.nextInt();

            FetchDeptServiceImple fd = new FetchDeptServiceImple();
            List<Dept> deptList = fd.getDeptList();

            m1.setAddress(addressList.get(aIndex));
            m1.setDepts(deptList);

            em.getTransaction().begin();
            em.merge(m1);
            em.getTransaction().commit();
            System.out.println("Manager Updated");
      
    }
}
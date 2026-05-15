package maven.companymanagement.dbconnection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbConnection {
	

	    public static EntityManagerFactory dbCon() {

	      EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql");
	      return emf;
	    }
}

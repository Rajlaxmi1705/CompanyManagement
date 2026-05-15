package maven.companymanagement.service.managerservice;

import java.util.List;

import maven.companymanagement.entity.Manager;

public interface FetchManagerService {

    List<Manager> getManagerList();
}
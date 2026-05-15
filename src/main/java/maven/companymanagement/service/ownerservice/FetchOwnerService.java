package maven.companymanagement.service.ownerservice;

import java.util.List;

import maven.companymanagement.entity.Owner;

public interface FetchOwnerService {

    List<Owner> getOwnerList();
}
package maven.companymanagement.service.addressservice;

import java.util.List;

import maven.companymanagement.entity.Address;

public interface FetchAddressService {

    List<Address> getAddressList();
}
package com.bookingwizard.api.repositories;

import com.bookingwizard.api.models.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "companies", path = "companies")
public interface CompanyRepository extends CrudRepository<Company, Long> {

}

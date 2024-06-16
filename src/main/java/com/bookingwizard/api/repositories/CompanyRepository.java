package com.bookingwizard.api.repositories;

import com.bookingwizard.api.models.Company;
import org.springframework.data.repository.ListCrudRepository;

public interface CompanyRepository extends ListCrudRepository<Company, Long> {

}

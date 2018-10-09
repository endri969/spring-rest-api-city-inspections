package com.endri.city.cityinspection.repository;

import com.endri.city.cityinspection.model.Company;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyRepository extends MongoRepository<Company, String> {

}

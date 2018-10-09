package com.endri.city.cityinspection.controller;

import com.endri.city.cityinspection.model.Address;
import com.endri.city.cityinspection.model.Company;
import com.endri.city.cityinspection.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CompanyController {

    @Autowired
    CompanyRepository companyRepository;

    @GetMapping(value = "/companies",params = {"size"})
    public Page<Company> getAllCompanies(@RequestParam(value = "size",required = false,defaultValue = "100") Integer size){
        if(size==0)
            size=100;
        Pageable pageable = new PageRequest(0,size, Sort.Direction.DESC,"date");
        return companyRepository.findAll(pageable);
    }

    @GetMapping(value = "/companies")
    public Page<Company> getAllCompanies(){
        Pageable pageable = new PageRequest(0,100, Sort.Direction.DESC,"date");
        return companyRepository.findAll(pageable);
    }

    @GetMapping("/companies/{id}")
    public Company getCompanyById(@PathVariable String id){
        Optional<Company> companyOptional = companyRepository.findById(id);
        if(!companyOptional.isPresent())
            throw new RuntimeException();
        return companyOptional.get();
    }

    @GetMapping("/companies/{id}/address")
    public Address getAddressById(@PathVariable String id){
        Optional<Company> companyOptional = companyRepository.findById(id);
        if(!companyOptional.isPresent())
            throw new RuntimeException();
        return companyOptional.get().getAddress();
    }

    @PostMapping("/companies")
    public Company insertCompany(@Valid @RequestBody Company company){
        Company savedCompany = companyRepository.save(company);
        return savedCompany;
    }

    @DeleteMapping("/companies/{id}")
    public void deleteCompany(@PathVariable String id){
        companyRepository.deleteById(id);
    }

}

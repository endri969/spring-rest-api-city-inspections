package com.endri.city.cityinspection.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document(collection = "city_inspections")
@JsonIgnoreProperties(allowGetters = true)
public class Company {

    @Id
    private String id;

    @JsonProperty(value = "company_id")
    private String companyId;
    @JsonProperty(value = "certificate_number")
    private Integer certificateNumber;
    @JsonProperty(value = "business_name")
    private String businessName;
    private Date date;
    private String result;
    private String sector;

    private Address address;

    public Company() {
    }


    public Company(String id, Integer certificateNumber, String businessName, Date date, String result, String sector, Address address) {
        this.companyId = id;
        this.certificateNumber = certificateNumber;
        this.businessName = businessName;
        this.date = date;
        this.result = result;
        this.sector = sector;
        this.address = address;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public Integer getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(Integer certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId='" + companyId + '\'' +
                ", certificateNumber=" + certificateNumber +
                ", businessName='" + businessName + '\'' +
                ", date=" + date +
                ", result='" + result + '\'' +
                ", sector='" + sector + '\'' +
                ", address=" + address +
                '}';
    }
}

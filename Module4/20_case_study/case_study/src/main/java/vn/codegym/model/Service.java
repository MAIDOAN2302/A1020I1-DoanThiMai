package vn.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Set;

@Entity
public class Service {

    @Id
    @Pattern(regexp = "^DV-[0-9]{4}$", message = "Phải nhập đúng định dạng DV-XXXX")
    private  String id;

    @NotBlank(message = "Không được để trống")
    private String name;

    @Min(value = 15, message = "Diện tích tối thiểu 15m2")
    private int area;

    @Min(value = 10, message = "Giá tối thiểu là 10$")
    private double cost;

    @Min(value = 1, message = "Tối thiểu là 1 khách hàng")
    private int maxPeople;

    @ManyToOne
    private RentType rentType;

    @ManyToOne
    private ServiceType serviceType;


    private String standardRoom;

    @NotNull(message = "Không được để trống")
    private Double poolArea;

    @NotNull(message = "Không được để trống")
    private Integer numberOfFloors;

    private String descriptionOtherConvenience;

    @OneToMany(mappedBy = "service")
    private Set<Contract> contracts;

    public Service() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }
}

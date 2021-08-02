package vn.codegym.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull(message = "Không được để trống")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate startDay;

    @NotNull(message = "Không được để trống")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate endDay;

    private double deposit;

    private double totalMoney;

    @ManyToOne
    @NotNull(message = "Chưa chọn nhân viên làm hợp đồng")
    private Employee employee;

    @ManyToOne
    @NotNull(message = "Chưa chọn khách hàng")
    private Customer customer;

    @ManyToOne
    @NotNull(message = "Chưa chọn gói dịch vụ")
    private Service service;

    @OneToMany( mappedBy = "contract",cascade = CascadeType.ALL)
    private Set<ContractDetail> contractDetails;

    public Contract() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public LocalDate getEndDay() {
        return endDay;
    }

    public void setEndDay(LocalDate endDay) {
        this.endDay = endDay;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Set<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(Set<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }
}

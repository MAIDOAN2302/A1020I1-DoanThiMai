package customers.repository;

import customers.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    private static List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer(0,"Nguyen Van A","Anv@gmail,com","Ha Noi"));
        customerList.add(new Customer(1,"Nguyen Van B","Bnv@gmail,com","Da Nang"));
        customerList.add(new Customer(2,"Nguyen Van C","Cnv@gmail,com","Quang Nam"));
        customerList.add(new Customer(3,"Nguyen Van D","Dnv@gmail,com","Hue"));
    }
    @Override
    public List<Customer> findAll() {
        return customerList;
    }

    @Override
    public Customer findById(int id) {
        return customerList.get(id);
    }
}

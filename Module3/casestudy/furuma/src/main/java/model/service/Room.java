package model.service;

public class Room extends SerVices{
    private String freeServices;

    public Room() {
    }

    public Room(int serviceId, String serviceName, double serviceArea, double serviceCost, int serviceMaxPeople,
                String rentTypeId, String freeServices) {
        super(serviceId, serviceName, serviceArea, serviceCost, serviceMaxPeople, rentTypeId);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public String ShowInfo() {
        return super.ShowInfo() + "\n Free Service: " + getFreeServices();
    }
}

package furama.models;

public class Room extends Services{
    String freeServices;

    public Room(String id,
                String servicesName,
                double useArea,
                double rentalCost,
                int amountOfPeopleMax,
                String rentalStyle,
                String freeServices)
    {
        super(id, servicesName, useArea, rentalCost, amountOfPeopleMax, rentalStyle);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public String showInformation() {
        return this.toString()
                + "freeServices='" + freeServices + '\'' ;

    }

    public String getInforRoom() {
        return
                super.getInfor() + "," + freeServices;
    }
}

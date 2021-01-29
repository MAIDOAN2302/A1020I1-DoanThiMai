package models;

class House extends Services{
    String standerRoom;
    String otherServices;
    int numberFloor;

    public House(String id,
                 String servicesName,
                 double useArea,
                 double rentalCost,
                 int amountOfPeopleMax,
                 String rentalStyle,
                 String standerRoom,
                 String otherServices,
                 int numberFloor)
    {
        super(id, servicesName, useArea, rentalCost, amountOfPeopleMax, rentalStyle);
        this.standerRoom = standerRoom;
        this.otherServices = otherServices;
        this.numberFloor = numberFloor;
    }

    public String getStanderRoom() {
        return standerRoom;
    }

    public void setStanderRoom(String standerRoom) {
        this.standerRoom = standerRoom;
    }

    public String getOtherServices() {
        return otherServices;
    }

    public void setOtherServices(String otherServices) {
        this.otherServices = otherServices;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String showInformation() {
        return this.toString();
    }

    @Override
    public String toString() {
        return
                super.toString()
                +"House{" +
                "standerRoom='" + standerRoom + '\'' +
                ", otherServices='" + otherServices + '\'' +
                ", numberFloor=" + numberFloor +
                '}';
    }
}
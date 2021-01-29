package models;

public  class Villa extends Services {
    String standerRoom;
    double poorArea;
    int numberFloor;
    String otherServices;

    public Villa(String id,
                 String servicesName,
                 double useArea,
                 double rentCost,
                 int amountOfPeopleMax,
                 String rentStyle,
                 String standerRoom,
                 double poorArea,
                 int numberFloor,
                 String otherServices)
    {
        super(id, servicesName, useArea, rentCost, amountOfPeopleMax, rentStyle);
        this.standerRoom = standerRoom;
        this.poorArea = poorArea;
        this.numberFloor = numberFloor;
        this.otherServices = otherServices;
    }

    public String getStanderRoom() {
        return standerRoom;
    }

    public void setStanderRoom(String standerRoom) {
        this.standerRoom = standerRoom;
    }

    public double getPoorArea() {
        return poorArea;
    }

    public void setPoorArea(double poorArea) {
        this.poorArea = poorArea;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    public String getOtherServices() {
        return otherServices;
    }

    public void setOtherServices(String otherServices) {
        this.otherServices = otherServices;
    }

    @Override
    public String showInformation() {
        return this.toString();
    }

    @Override
    public String toString() {
        return
                super.toString()
                +"Villa{" +
                "standerRoom='" + standerRoom + '\'' +
                ", poorArea=" + poorArea +
                ", numberFloor=" + numberFloor +
                ", otherServices='" + otherServices + '\'' +
                '}';
    }
}

package models;

 abstract class Services {
    String id;
    String servicesName;
    double useArea;
    double rentCost;
    int amountOfPeopleMax;
    String rentStyle;

    public abstract String showInformation();

     @Override
     public String toString() {
         return "{" +
                 "id='" + id + '\'' +
                 ", servicesName='" + servicesName + '\'' +
                 ", useArea=" + useArea +
                 ", rentCost=" + rentCost +
                 ", amountOfPeopleMax=" + amountOfPeopleMax +
                 ", rentStyle='" + rentStyle + '\'' +
                 '}';
     }

     public Services(String id,
                     String servicesName,
                     double useArea,
                     double rentalCost,
                     int amountOfPeopleMax,
                     String rentalStyle) {
         this.id = id;
         this.servicesName = servicesName;
         this.useArea = useArea;
         this.rentCost = rentalCost;
         this.amountOfPeopleMax = amountOfPeopleMax;
         this.rentStyle = rentalStyle;
     }

     public String getId() {
         return id;
     }

     public void setId(String id) {
         this.id = id;
     }

     public String getServicesName() {
         return servicesName;
     }

     public void setServicesName(String servicesName) {
         this.servicesName = servicesName;
     }

     public double getUseArea() {
         return useArea;
     }

     public void setUseArea(double useArea) {
         this.useArea = useArea;
     }

     public double getRentCost() {
         return rentCost;
     }

     public void setRentCost(double rentalCost) {
         this.rentCost = rentalCost;
     }

     public int getAmountOfPeopleMax() {
         return amountOfPeopleMax;
     }

     public void setAmountOfPeopleMax(int amountOfPeopleMax) {
         this.amountOfPeopleMax = amountOfPeopleMax;
     }

     public String getRentStyle() {
         return rentStyle;
     }

     public void setRentStyle(String rentalStyle) {
         this.rentStyle = rentalStyle;
     }
 }



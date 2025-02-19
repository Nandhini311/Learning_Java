public class CarCustomer {
    private String name;
    private String customerID;
    private Car rentalCar;

    public CarCustomer(String name, String customerID) {
        this.name = name;
        this.customerID = customerID;
    }

    public void rentCar(Car car) {
        this.rentalCar = car;
        System.out.println(name + " has rented a car: \n" + rentalCar.showDetails());
    }

    public void showDetails() {
        if (rentalCar != null) {
            System.out.println("Customer name: " + name + "Car details: " + rentalCar.showDetails());
        } else {
            System.out.println("No car rented yet");
        }
    }


}




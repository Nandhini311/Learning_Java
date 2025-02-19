public class CarMain {
    public static void main(String[] args) {
        CarEngine engine = new CarEngine("150", "Petrol");
        Car car = new Car("Toyota", engine, "Camry", 50.0);
        CarCustomer customer = new CarCustomer("Nandhini", "11804841");

        CarRentalCompany rentalCar = new CarRentalCompany (car);
        //now need to assign this car to the customer.
        customer.showDetails();
        rentalCar.assignCarToCustomer(customer);
        customer.showDetails();
    }
}

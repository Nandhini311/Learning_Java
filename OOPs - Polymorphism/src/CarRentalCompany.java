public class CarRentalCompany {
    private Car availableCar;
    private  String name;

    public CarRentalCompany (Car availableCar){
        this.availableCar = availableCar;
    }

    public void assignCarToCustomer(CarCustomer customer) {
        customer.rentCar(availableCar);
    }
}





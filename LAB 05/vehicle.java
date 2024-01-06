class vehicle {
    public int no_of_seats;
    public int no_of_wheels;

    public vehicle(int no_of_seats, int no_of_wheels) {
        this.no_of_seats = no_of_seats;
        this.no_of_wheels = no_of_wheels;
    }

    public String getDescription() {
        return "This vehicle has " + no_of_seats + " seats and " + no_of_wheels + " wheels.";
    }
}

class Car {
    public int no_of_seats;
    public final int no_of_wheels = 4;

    public Car(int no_of_seats) {
        this.no_of_seats = no_of_seats;
    }

    public String getDescription() {
        return "Car: " + "Number of seats: " + no_of_seats + ", Number of wheels: " + no_of_wheels;
    }
}

class Motorcycle {
    public int no_of_seats;
    public final int no_of_wheels = 2;

    public Motorcycle(int no_of_seats) {
        this.no_of_seats = no_of_seats;
    }

    public String getDescription() {
        return "Motorcycle: " + "Number of seats: " + no_of_seats + ", Number of wheels: " + no_of_wheels;
    }
}

public class vehicle {
    public static void main(String[] args) {
        Car car = new Car(4);
        Motorcycle motorcycle = new Motorcycle(2);

        System.out.println(car.getDescription());
        System.out.println(motorcycle.getDescription());
    }
}
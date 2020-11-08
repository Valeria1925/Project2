import com.company.animals.Animal;

public class Aviary {
    Animal[] seats;
    int occypiedSeats;
    int maxSeats;

    public Aviary(int maxSeatsFrom) {
        maxSeats = maxSeatsFrom;
        seats = new Animal[maxSeatsFrom];
        occypiedSeats = 0;
    }

    void addAnimal(Animal animal) {
        if (occypiedSeats < maxSeats) {
            seats[occypiedSeats] = animal;
            occypiedSeats = occypiedSeats + 1;
            System.out.println("Animal added");
        } else {
            System.out.println("All seats occupied");
        }
    }

    void calculateAnimals() {
        System.out.println("animals: " + occypiedSeats);
    }

    void checkHealth() {
        for (int i=0; i < occypiedSeats; i++) {
            seats[i].checkHealth();
        }
    }
}


import com.company.animals.Horse;
import com.company.animals.Lion;
import com.company.animals.Pantera;
import com.company.animals.Cow;
import foods.Herb;
import foods.Meat;

public class Main {

    public static void main(String[] args) {

        Lion lion = new Lion();
        lion.eat(new Herb());
        lion.eat(new Meat());

        Aviary aviary1 = new Aviary(3);
        aviary1.addAnimal(new Lion());
        aviary1.addAnimal(new Pantera());
        aviary1.addAnimal(new Lion());
        aviary1.addAnimal(new Lion());
        aviary1.calculateAnimals();
        aviary1.checkHealth();

        Aviary aviary2 = new Aviary(5);
        aviary2.addAnimal(new Horse());
        aviary2.addAnimal(new Cow());
        aviary2.addAnimal(new Horse());
        aviary2.addAnimal(new Cow());
        aviary2.addAnimal(new Horse());
        aviary2.addAnimal(new Cow());
        aviary1.calculateAnimals();
        aviary1.checkHealth();
    }
}

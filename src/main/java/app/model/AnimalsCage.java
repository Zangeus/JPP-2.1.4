package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    @Autowired
    @Qualifier("dog")
    private Animal animal;
    @Autowired
    private Timer_new timer;

    public void whatAnimalSay() {
        System.out.println("Say: ");
        System.out.println(animal.toString());
        System.out.println("At: ");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Timer_new getTimer() {
        return timer;
    }

    public void setTimer(Timer_new timer) {
        this.timer = timer;
    }
}

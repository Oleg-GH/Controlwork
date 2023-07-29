package kennel.model.implement;

import kennel.model.AbstractPackAnimal;
import kennel.model.AnimalGenius;

import java.time.LocalDate;

public class Donkey extends AbstractPackAnimal {
    public Donkey(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalGenius(AnimalGenius.DONKEY);
    }
}

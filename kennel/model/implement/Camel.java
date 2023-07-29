package kennel.model.implement;

import kennel.model.AbstractPackAnimal;
import kennel.model.AnimalGenius;

import java.time.LocalDate;

public class Camel extends AbstractPackAnimal {
    public Camel(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalGenius(AnimalGenius.CAMEL);
    }
}

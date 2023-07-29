package kennel.model.implement;

import kennel.model.AbstractPet;
import kennel.model.AnimalGenius;

import java.time.LocalDate;

public class Hamster extends AbstractPet {
    public Hamster(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalGenius(AnimalGenius.HAMSTER);
    }
}

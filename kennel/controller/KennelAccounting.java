package kennel.controller;

import kennel.model.AbstractAnimal;
import kennel.model.AnimalGenius;
import kennel.model.implement.*;
import kennel.storage.Storage;

import java.time.LocalDate;
import java.util.List;

/**
 * Отвечает за взаимодействие View и Model
 */
public class KennelAccounting {

    private Storage dbKennel;

    public KennelAccounting(Storage dbKennel) {
        this.dbKennel = dbKennel;
    }

    public List<AbstractAnimal> getAnimals() {
        return dbKennel.getAllAnimals();
    }

    public boolean createAnimal(String name, LocalDate birthDay, AnimalGenius animalGenius) {
        AbstractAnimal animal;
        switch (animalGenius) {
            case CAT: 
                animal = new Cat(name, birthDay);
                break;
            case DOG: 
                animal = new Dog(name, birthDay);
                break;
            case HAMSTER: 
                animal = new Hamster(name, birthDay);
                break;
            case HORSE: 
                animal = new Horse(name, birthDay);
                break;
            case CAMEL: 
                animal = new Camel(name, birthDay);
                break;
            case DONKEY: 
                animal = new Donkey(name, birthDay);
                break;
            default:
                return false; // если тип животного не определен возвращаем false    
        }

        return dbKennel.addAnimal(animal);
    }

    public int removeAnimal(AbstractAnimal animal) {
        if (animal == null) return -1;
        return  dbKennel.removeAnimal(animal);
    }
}

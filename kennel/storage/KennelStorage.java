package kennel.storage;

import kennel.model.AbstractAnimal;
import kennel.model.AbstractPackAnimal;
import kennel.model.AbstractPet;
import kennel.model.implement.*;
import kennel.model.Skill;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Реализация интерфейса Storage
 * Хранилище реализовано на HashMap
 */
public class KennelStorage implements Storage{
    Map<Integer, AbstractAnimal> dbAnimals = new HashMap<>();

    public KennelStorage() {
        init();
    }

    private void init(){
        AbstractPet cat = new Cat("Мурка", LocalDate.of(2022, 7, 12));
        int per = cat.getAge();
        cat.learnSkill(new Skill("Поймай мышку"));
        dbAnimals.put(cat.getId(), cat);

        AbstractPet cat2 = new Cat("Мурзик", LocalDate.of(2022, 12, 8));
        int per2 = cat2.getAge();
        cat.learnSkill(new Skill("Поймай бабочку"));
        dbAnimals.put(cat2.getId(), cat2);

        AbstractPet dog = new Dog("Полкан", LocalDate.of(2022, 2, 15));
        dog.learnSkill(new Skill("Принести тапки"));
        dog.learnSkill(new Skill("Поклон!"));
        dbAnimals.put(dog.getId(), dog);

        AbstractPet hamster = new Hamster("Обжора", LocalDate.of(2023, 3, 4));
        hamster.learnSkill(new Skill("Бежать в колесе"));
        dbAnimals.put(hamster.getId(), hamster);

        AbstractPackAnimal horse = new Horse("Резвый", LocalDate.of(2021, 11, 20));
        horse.setLoadCapacity(300);
        horse.learnSkill(new Skill("Галоп!"));
        dbAnimals.put(horse.getId(), horse);

        AbstractPackAnimal horse2 = new Horse("Стрела", LocalDate.of(2022, 4, 15));
        horse2.setLoadCapacity(400);
        horse2.learnSkill(new Skill("Галоп!"));
        horse2.learnSkill(new Skill("Поклон!"));
        dbAnimals.put(horse2.getId(), horse2);

        AbstractPackAnimal donkey = new Donkey("Тупица", LocalDate.of(2022, 11, 8));
        donkey.setLoadCapacity(500);
        donkey.learnSkill(new Skill("Поклон!"));
        dbAnimals.put(donkey.getId(), donkey);

        AbstractPackAnimal camel = new Camel("Сахара", LocalDate.of(2021, 7, 24));
        camel.setLoadCapacity(1000);
        camel.learnSkill(new Skill("КЭШ!"));
        dbAnimals.put(camel.getId(), camel);
    }

    @Override
    public List<AbstractAnimal> getAllAnimals() {
        List<AbstractAnimal> result = new ArrayList<>();
        for (AbstractAnimal animal: dbAnimals.values()) {
            result.add(animal);
        }
        return result;
    }

    @Override
    public AbstractAnimal getAnimalById(int animalId) {
        return dbAnimals.getOrDefault(animalId, null);
    }

    @Override
    public boolean addAnimal(AbstractAnimal animal) {
        if (dbAnimals.containsKey(animal.getId())) {return false;}
        dbAnimals.put(animal.getId(), animal);
        return true;
    }

    @Override
    public int removeAnimal(AbstractAnimal animal) {
        if (!dbAnimals.containsKey(animal.getId())) {
            return -1;
        }
        AbstractAnimal removed = dbAnimals.remove(animal.getId());
        return removed.getId();
    }
}

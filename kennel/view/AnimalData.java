package kennel.view;

import java.time.LocalDate;

import kennel.model.AnimalGenius;

public class AnimalData {
    private String name;
    private LocalDate birthDate;
    private AnimalGenius animalGenius;

    public AnimalData(String name, LocalDate birthDate, AnimalGenius animalGenius) {
        this.name = name;
        this.birthDate = birthDate;
        this.animalGenius = animalGenius;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public AnimalGenius getAnimalGenius() {
        return animalGenius;
    }

    @Override
    public String toString() {
        return "AnimalData{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", animalGenius=" + animalGenius +
                '}';
    }
}

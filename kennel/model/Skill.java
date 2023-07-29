package kennel.model;

import java.util.Objects;

// /**
//  * Команда, выполняемая животным
//  * @param name команда
//  * @param description описание команды
//  */

public class Skill {
    private final String name;
    private final String description;

    public Skill(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Skill(String name) {
        this(name, null);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill skill = (Skill) o;
        return Objects.equals(name, skill.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}


// public record Skill(String name, String description) {
//     public Skill(String name) {
//         this(name, null);
//     }

//     @Override
//     public boolean equals(Object o) {
//         if (this == o) return true;
//         if (o == null || getClass() != o.getClass()) return false;
//         Skill skill = (Skill) o;
//         return name.equals(skill.name);
//     }

//     @Override
//     public int hashCode() {
//         return Objects.hash(name);
//     }

//     @Override
//     public String toString() {
//         return name;
//     }
// }

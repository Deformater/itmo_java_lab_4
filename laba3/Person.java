package laba3;

import java.util.ArrayList;
import java.util.List;

enum Skills {
    TRUMPET(1),
    COOKING(2),
    WRITING(3),
    READING(4);

    int level;

    Skills(int level){
        this.level = level;
    }
    @Override
    public String toString() {
        return "Skill{" + level + "}";
    }
}

abstract class Person {
    private String name;
    private List<Skills> skills = new ArrayList<>();

    /**
     * @param name
     * @param skills
     */
    public Person(String name, List<Skills> skills) {
        this.name = name;
        this.addSkills(skills);
    }

    /**
     * @return list of skills
     */
    public List<Skills> getSkills() {
        return skills;
    }

    /**
     * @param skills list of skills
     */
    public void setSkills(List<Skills> skills) {
        this.skills = (ArrayList<Skills>) skills;
    }

    /**
     * @param skillss add skills
     */
    public void addSkills(List<Skills> skills) {
        this.skills.addAll(skills);
    }

    /**
     * @return name of person
     */
    public String getName() {
        return name;
    }

    public String getEmail() {
        return String.format("%s@email.ru", getName());
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    abstract public String toString();

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person other = (Person) obj;
            return this.skills.equals(other.skills) && this.name.equals(other.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}

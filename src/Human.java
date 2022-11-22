public class Human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    Human(String name, String town, String jobTitle, int yearOfBirth) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return String.format("Привет! Меня зовут %s. Я из города %s. Я родился(-ась) в %d году. Я работаю на должности %s. Будем знакомы!", name, town, yearOfBirth, jobTitle);
    }
}

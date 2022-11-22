public class Human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    Human(String name, String town, String jobTitle, int yearOfBirth) {
        if ("".equals(name) || name == null) {
            this.name = "Информация не указана";
        }else {
            this.name = name;
        }
        if ("".equals(town) || town == null) {
            this.town = "Информация не указана";
        }else {
            this.town = town;
        }
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        }else{
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if ("".equals(jobTitle) || jobTitle == null) {
            this.jobTitle = "Информация не указана";
        }else {
            this.jobTitle = jobTitle;
        }
    }

    @Override
    public String toString() {
        return String.format("Привет! Меня зовут %s. Я из города %s. Я родился(-ась) в %d году. Я работаю на должности %s. Будем знакомы!", name, town, yearOfBirth, jobTitle);
    }
}

public class Human {
    String name;
    int yearOfBirth;
    String town;
    String jobTitle;

    Human(String name, int yearOfBirth, String  town, String jobTitle){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        this.jobTitle = jobTitle;
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности "+ jobTitle +". Будем знакомы!");
    }

}

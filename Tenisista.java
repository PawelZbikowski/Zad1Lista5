package Zad1Lista5;

public class Tenisista implements Comparable<Tenisista>{

    private int position;
    private String nationality;
    private String name;
    private String surname;
    private int age;
    private int points;
    private int tournPlayed;

    public int getPosition() {
        return position;
    }

    public String getNationality() {
        return nationality;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getPoints() {
        return points;
    }

    public int getTournPlayed() {
        return tournPlayed;
    }

    public Tenisista(int position, String nationality, String name, String surname, int age, int points, int tournPlayed) {
        this.position = position;
        this.nationality = nationality;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.points = points;
        this.tournPlayed = tournPlayed;
    }

    @Override
    public String toString() {
        return "PLAYER {" +
                "position = " + position +
                ", nationality = '" + nationality + '\'' +
                ", name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", age = " + age +
                ", points = " + points +
                ", tournPlayed = " + tournPlayed +
                '}';
    }


    @Override
    public int compareTo(Tenisista o) {
        return Double.compare(age, o.age);
    }
}

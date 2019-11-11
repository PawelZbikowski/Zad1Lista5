package Zad1Lista5;

        import java.util.Comparator;

public class PlayerSurnameComparator implements Comparator<Tenisista> {
    @Override
    public int compare(Tenisista o1, Tenisista o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}

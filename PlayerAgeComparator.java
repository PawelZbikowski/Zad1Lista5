package Zad1Lista5;

import java.util.Comparator;

public class PlayerAgeComparator implements Comparator<Tenisista> {

    @Override
    public int compare(Tenisista o1, Tenisista o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }
}

package Zad1Lista5;

import java.util.Comparator;

public class PlayerFirstNameComparator implements Comparator<Tenisista> {
    @Override
    public int compare(Tenisista o1, Tenisista o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

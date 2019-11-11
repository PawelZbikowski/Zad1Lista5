package Zad1Lista5;

import java.util.Comparator;

public class PlayerPointsComparator implements Comparator<Tenisista> {
    @Override
    public int compare(Tenisista o1, Tenisista o2) {
        return Integer.compare(o2.getPoints(), o1.getPoints());
    }
}

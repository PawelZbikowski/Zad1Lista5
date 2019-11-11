package Zad1Lista5;

import java.util.Comparator;

public class PlayerTournamentsPlayedComparator implements Comparator<Tenisista> {
    @Override
    public int compare(Tenisista o1, Tenisista o2) {
        return Double.compare(o1.getTournPlayed(), o2.getTournPlayed());
    }
}

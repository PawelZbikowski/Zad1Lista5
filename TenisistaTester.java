package Zad1Lista5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class TenisistaTester {


    public static void main(String[] args) {
        //Wczytanie pliku ATP.txt do listy tablicowej tennisPlayers
        File file = new File("G:\\ZPOLAb6.1\\ATP.txt");
        String s = "";
        ArrayList<String> tennisPlayers = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file)); //potencjalnie niebezpieczna instrukcja -
            // np. ktos wyciagnie pendrive z plikiem tekstowym i juz nie bedzie do niego dostepu
            System.out.println("Plik ok");

// Podczas gdy plik tekstowy jest czymś zapisany (!= null) tekst s jest dzielony na kolumny Stringowe,
// a następnie dodaje wyrażenia do listy tablicowej tennisPlayers
            while ((s = bufferedReader.readLine()) != null) {
                String[] playersList = s.split("\t", 6);
                String[] nameAndSurname = playersList[2].split(" ",2);
                tennisPlayers.add(playersList[0]);
                tennisPlayers.add(playersList[1]);
                tennisPlayers.add(nameAndSurname[0]);
                tennisPlayers.add(nameAndSurname[1]);
                tennisPlayers.add(playersList[3]);
                tennisPlayers.add(playersList[4]);
                tennisPlayers.add(playersList[5]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        ArrayList<Tenisista> players = new ArrayList<>();
        for (int i = 0; i < tennisPlayers.size(); i+= 7) {
            Tenisista tenisista = new Tenisista(Integer.parseInt(tennisPlayers.get(i)), tennisPlayers.get(i+1),
                    tennisPlayers.get(i+2), tennisPlayers.get(i+3), Integer.parseInt(tennisPlayers.get(i+4)),
                    Integer.parseInt(tennisPlayers.get(i+5)), Integer.parseInt(tennisPlayers.get(i+6)));

            players.add(tenisista);

        }

        System.out.println(players);
        System.out.println();
        Collections.sort(players, new PlayerAgeComparator());
        System.out.println("Tablica posortowana rosnąco po wieku zawodników: " + players);
        System.out.println();
        Collections.sort(players, new PlayerNationalityComparator());
        System.out.println("Tablica posortowana alfabetycznie po narodowości zawodników: " + players);
        System.out.println();
        Collections.sort(players, new PlayerFirstNameComparator());
        System.out.println("Tablica posortowana alfabetycznie po imionach zawodników: " + players);
        System.out.println();
        Collections.sort(players, new PlayerPointsComparator());
        System.out.println("Tablica posortowana malejąco po punktach zawodników: " + players);
        System.out.println();
        Collections.sort(players, new PlayerSurnameComparator());
        System.out.println("Tablica posortowana alfabetycznie po nazwiskach zawodników: " + players);
        System.out.println();
        Collections.sort(players, new PlayerPositionComparator());
        System.out.println("Tablica posortowana rosnąco po pozycjach zawodników: " + players);
        System.out.println();
        Collections.sort(players, new PlayerTournamentsPlayedComparator());
        System.out.println("Tablica posortowana rosnąco po rozegranych turniejach: " + players);

    }
}

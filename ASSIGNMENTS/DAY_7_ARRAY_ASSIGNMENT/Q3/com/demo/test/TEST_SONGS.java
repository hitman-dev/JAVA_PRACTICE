package DAY_7_ARRAY_ASSIGNMENT.Q3.com.demo.test;

import DAY_7_ARRAY_ASSIGNMENT.Q3.com.demo.bean.SONGS;

import java.util.ArrayList;
import java.util.Scanner;

public class TEST_SONGS {
    static ArrayList<SONGS> songList = new ArrayList<>(10);

    public static void addSong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter song details here:\n");

        System.out.print("Enter lyrics: ");
        String lyrics = sc.nextLine();
        System.out.print("Enter Singer Name: ");
        String singerName = sc.nextLine();
        songList.add(new SONGS(lyrics, singerName));
    }

    public static void displayAllSongs() {
        System.out.println("All songs details is displayed below:");
        for (SONGS i : songList) {
            System.out.print(i + "\n");
        }
    }

    public static void displayBySinger(String singer) {
        for (SONGS song : songList) {
            if (song.getSingerName().equals(singer)) {
                System.out.println(song);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Add a song\n2. Display all songs\n3. Display songs by Singer name\n4. Exit\n");
        System.out.print("Enter a choice: ");
        int choice = sc.nextInt();
        do {
            switch (choice) {
                case 1:
                    addSong();
                    break;
                case 2:
                    displayAllSongs();
                    break;
                case 3:
                    System.out.print("Enter a singer name: ");
                    sc.nextLine();
                    String singer = sc.nextLine();
                    displayBySinger(singer);
                    break;
            }
            System.out.print("Enter a choice: ");
            choice = sc.nextInt();
        } while (choice != 4);
    }
}

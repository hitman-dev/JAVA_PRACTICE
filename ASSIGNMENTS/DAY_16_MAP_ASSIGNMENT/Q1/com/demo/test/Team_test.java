package DAY_16_MAP_ASSIGNMENT.Q1.com.demo.test;

import DAY_16_MAP_ASSIGNMENT.Q1.com.demo.bean.Team;
import DAY_16_MAP_ASSIGNMENT.Q1.com.demo.service.TeamService;
import DAY_16_MAP_ASSIGNMENT.Q1.com.demo.service.TeamServiceImpl;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class Team_test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        TeamService ts = new TeamServiceImpl();
        ts.dataset();
        int choice;
        do {
            System.out.print("""
                    
                    
                    
                    |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
                    |::::::::::::::::::::::::::::::::MAIN MENU::::::::::::::::::::::::::::::::|
                    |  1. Add new Team                                                        |
                    |  2. Delete a team                                                       |
                    |  3. Delete a player from team(accept player id to delete)               |
                    |  4. Display all batsman                                                 |
                    |  5. Display all player with a speciality(accept speciality from user)   |
                    |  6. Add a new player in a team                                          |
                    |  7. Modify coach of a team                                              |
                    |  8. Display all                                                         |
                    |  9. Exit                                                                |
                    |:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::|
                    |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
                    Enter a choice:\s""");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ts.addNewTeam();
                    break;
                case 2:
                    System.out.print("Enter team id to delete: ");
                    int teamId = sc.nextInt();
                    boolean status = ts.delet_Team(teamId);
                    if (status) {
                        System.out.println("Team deleted Successfully!");
                    } else {
                        System.out.println("Team not found!");
                    }
                    break;
                case 3:
                    System.out.print("Enter Team id: ");
                    teamId = sc.nextInt();
                    System.out.print("Enter player id to delete: ");
                    int playerId = sc.nextInt();
                    boolean pStatus = ts.delet_Player(teamId, playerId);
                    if (pStatus) {
                        System.out.println("Player deleted Successfully!");
                    } else {
                        System.out.println("Not found!");
                    }
                    break;
                case 4:
                    List<Team.Player> playerList = ts.displayPlayersWithSpeciality("batsman");
                    if (playerList.size() != 0) {
                        playerList.forEach(System.out::println);
                    } else {
                        System.out.println("No batsman found!!");
                    }
                    break;
                case 5:
                    sc.nextLine();
                    System.out.print("Enter Player speciality: ");
                    String playerSpeciality = sc.nextLine();
                    playerList = ts.displayPlayersWithSpeciality(playerSpeciality);
                    if (playerList.size() != 0) {
                        playerList.forEach(System.out::println);
                    } else {
                        System.out.println("No player found with this speciality");
                    }
                    break;
                case 6:
                    System.out.print("Enter team id: ");
                    teamId = sc.nextInt();
                    System.out.print("Player id: ");
                    playerId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Player name: ");
                    String playerName = sc.nextLine();
                    System.out.print("Player Speciality: ");
                    playerSpeciality = sc.nextLine();
                    ts.addNewPlayerInTeam(teamId, playerId, playerName, playerSpeciality);
                    break;
                case 7:
                    System.out.print("Enter team id: ");
                    teamId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter coach name: ");
                    String coachName = sc.nextLine();
                    boolean modified =  ts.modiefyCoach(teamId,coachName);
                    if(modified){
                        System.out.println("Coach name modified");
                    }else {
                        System.out.println("Team not found");
                    }
                    break;
                case 8:
                    ts.displayAll();
                    break;
                case 9:
                    System.out.println("Thank you for visiting");
                    return;
                default:
                    System.out.println("Wrong choice!!");
            }
        } while (true);
    }

}

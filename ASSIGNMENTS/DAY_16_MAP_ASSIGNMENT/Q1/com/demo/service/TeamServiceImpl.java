package DAY_16_MAP_ASSIGNMENT.Q1.com.demo.service;


import DAY_16_MAP_ASSIGNMENT.Q1.com.demo.bean.Team;
import java.util.*;

import static java.util.stream.Collectors.toList;


public class TeamServiceImpl implements TeamService{
    TreeMap<Integer, Team> teamTreeMap = new TreeMap<>();
    static Scanner sc = new Scanner(System.in);

    @Override
    public void dataset() {
        Team.Player[] players1 = {new Team.Player(1, "Dhoni", "batsman"),
                new Team.Player(2, "Virat", "batsman"),
                new Team.Player(3, "Rohit", "bowler")};
        Team.Player[] players2 = {new Team.Player(4, "Shane", "batsman"),
                new Team.Player(5, "Chris", "all rounder"),
                new Team.Player(6, "Malinga", "bowler")};
        teamTreeMap.put(1, new Team(1, "India", "Hitesh", new ArrayList<>(Arrays.asList(players1))));
        teamTreeMap.put(2, new Team(2, "West Indies", "Michel", new ArrayList<>(Arrays.asList(players2))));


    }

    @Override
    public void addNewTeam() {
        List<Team.Player> playerList = new ArrayList<>();
        System.out.print("Enter team id: ");
        int teamId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter team name: ");
        String teamName = sc.nextLine();
        System.out.print("Coach name: ");
        String coachName = sc.nextLine();
        System.out.println("Adding players.");
        String choice;
        do {
            playerList.add(addPlayer());
            System.out.print("Add another player in the team-(y/n): ");
            choice = sc.nextLine();
        } while (choice.equals("y"));
        teamTreeMap.put(teamId, new Team(teamId, teamName, coachName, playerList));
        System.out.println("Team Added Successfully!");

    }

    public Team.Player addPlayer() {
        System.out.print("Player id: ");
        int playerId = sc.nextInt();
        sc.nextLine();
        System.out.print("Player name: ");
        String playerName = sc.nextLine();
        System.out.print("Player Speciality: ");
        String playerSpeciality = sc.nextLine();
        return new Team.Player(playerId, playerName, playerSpeciality);
    }

    @Override
    public boolean delet_Team(int teamId) {
        Team team = teamTreeMap.get(teamId);
        if (team != null) {
            System.out.println(team);
            teamTreeMap.remove(teamId);
            return true;
        }
        return false;
    }

    @Override
    public boolean delet_Player(int teamId, int playerId) {
        Team team = teamTreeMap.get(teamId);
        if (team != null) {
            return team.getPlayerList().removeIf(player -> player.getPlayerId() == playerId);
        }
        return false;
    }

    @Override
    public void displayAll() {
        teamTreeMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }


    @Override
    public List<Team.Player> displayPlayersWithSpeciality(String playerSpeciality) {
        List<Team.Player> plist = new ArrayList<>();
        teamTreeMap.forEach((k, v) -> {
            List<Team.Player> playerList = v.getPlayerList()
                    .stream()
                    .filter(player -> player.getPlayerSpeciality().equalsIgnoreCase(playerSpeciality))
                    .collect(toList());
            plist.addAll(playerList);
        });
        return plist;
    }

    @Override
    public void addNewPlayerInTeam(int teamId, int playerId, String playerName, String playerSpeciality) {
        Team team = teamTreeMap.get(teamId);
        if (team != null) {
            Team.Player newPlayer = new Team.Player(playerId, playerName, playerSpeciality);
            Team.Player playerExist = teamTreeMap.get(teamId).getPlayerList().stream()
                    .filter(player -> player.getPlayerId() == newPlayer.getPlayerId())
                    .findFirst().orElse(null);
            if (playerExist != null) {
                System.out.print("Player already Exists, do you want to overwrite (y/n): ");
                String choice = sc.nextLine();
                if (choice.equals("y")) {
                    teamTreeMap.get(teamId).getPlayerList()
                            .stream()
                            .filter(player -> player.getPlayerId() == newPlayer.getPlayerId())
                            .forEach(player -> {
                                player.setPlayerId(newPlayer.getPlayerId());
                                player.setPlayerName(newPlayer.getPlayerName());
                                player.setPlayerSpeciality(newPlayer.getPlayerSpeciality());
                            });
                    System.out.println("Player modified");
                } else {
                    System.out.println("No changes made!!");
                }
            } else {
                teamTreeMap.get(teamId).getPlayerList().add(newPlayer);
                System.out.println("New Player added Successfully");
            }
        } else {
            System.out.println("Team not found!!");
        }

    }

    @Override
    public boolean modiefyCoach(int teamId, String coachName) {
        Team team = teamTreeMap.get(teamId);
        if (team != null) {
            teamTreeMap.get(teamId).setCoachName(coachName);
            return true;
        }
        return false;
    }
}

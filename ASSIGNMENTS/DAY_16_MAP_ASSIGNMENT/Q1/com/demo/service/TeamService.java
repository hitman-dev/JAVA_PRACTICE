package DAY_16_MAP_ASSIGNMENT.Q1.com.demo.service;

import DAY_16_MAP_ASSIGNMENT.Q1.com.demo.bean.Team;

import java.util.List;

public interface TeamService {
    void addNewTeam();
    boolean delet_Team(int teamId);
    boolean delet_Player(int teamId,int playerId);
    void displayAll();
    void dataset();
    List<Team.Player> displayPlayersWithSpeciality(String playerSpeciality);
    void addNewPlayerInTeam(int teamId, int playerId, String playerName, String playerSpeciality);
    boolean modiefyCoach(int teamId, String coachName);
}

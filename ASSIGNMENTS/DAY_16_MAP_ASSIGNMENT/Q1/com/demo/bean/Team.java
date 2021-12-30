package DAY_16_MAP_ASSIGNMENT.Q1.com.demo.bean;

import java.util.List;

public class Team {
    private int teamId;
    private String teamName;
    private String coachName;
    private List<Player> playerList;

    public Team(int teamId,String teamName, String coachName, List<Player> playerList) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.coachName = coachName;
        this.playerList = playerList;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId= " + teamId +
                ", teamName= " + teamName +
                ", coachName= " + coachName +
                ", playerList= " + playerList +
                '}';
    }

    public static class Player {
        protected int playerId;
        protected String playerName;
        protected String playerSpeciality;

        public Player(int playerId, String playerName, String playerSpeciality) {
            this.playerId = playerId;
            this.playerName = playerName;
            this.playerSpeciality = playerSpeciality;
        }

        @Override
        public String toString() {
            return "Player{" +
                    "playerId= " + playerId +
                    ", playerName= " + playerName +
                    ", playerSpeciality= " + playerSpeciality +
                    '}';
        }

        public int getPlayerId() {
            return playerId;
        }

        public void setPlayerId(int playerId) {
            this.playerId = playerId;
        }

        public String getPlayerName() {
            return playerName;
        }

        public void setPlayerName(String playerName) {
            this.playerName = playerName;
        }

        public String getPlayerSpeciality() {
            return playerSpeciality;
        }

        public void setPlayerSpeciality(String playerSpeciality) {
            this.playerSpeciality = playerSpeciality;
        }
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

}

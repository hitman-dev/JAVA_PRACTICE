package DAY_7_ARRAY_ASSIGNMENT.Q3.com.demo.bean;

public class SONGS {
    private int songId;
    private String lyrics;
    private String singerName;

    static int counter;

    static {
        counter = 0;
    }

    public SONGS(String lyrics, String singerName) {
        counter++;
        this.songId = counter;
        this.lyrics = lyrics;
        this.singerName = singerName;
    }

    @Override
    public String toString() {
        return "songId=" + songId + ", lyrics='" + lyrics + '\'' + ", singerName='" + singerName + '\'';
    }

    public String getSingerName() {
        return singerName;
    }
}

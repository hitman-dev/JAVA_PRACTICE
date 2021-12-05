package DAY_16.COMPOSITION_RELATION_DEMO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestTeam {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Player> plst=new ArrayList<>();
		for(int i=0;i<3;i++) {
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter name");
			String nm=sc.next();
			System.out.println("enetr speciality");
			String s=sc.next();
			plst.add(new Player(id,nm,s));
		}
		System.out.println("enetr team id");
		int tid=sc.nextInt();
		System.out.println("enetr team name");
		String tname=sc.next();
		Team ob=new Team(tid,tname,plst);
		System.out.println(ob);
		
		List<Player> plst1=ob.getPlist();

	}

}

package javaPricticeTCAII;

public class Interface {

	public static void main(String[] args) {
		BallSport bs = new BallSport("Football", "Net,Ball", "Pitch",2,11,90);
		BallSport bs1 = new BallSport("Rugby", "Goal,Ball", "Pitch",2,15,90);

		
		MotorSport ms = new MotorSport("Formula1","Car","Track", 11, 2,70);
		MotorSport ms1 = new MotorSport("Moto GP","Motorcycle","Track", 13, 3,80);
		
		RacketSport rs = new RacketSport("Tennis", "Racket", "Court", 40);
		RacketSport rs1 = new RacketSport("Badminton", "Racket", "Court", 30);
		
		Golf g = new Golf("Golf", "Golf Clubs", "Courses");
		
		Sport[] s= new Sport[7];
		s[0]=bs;
		s[1]=bs1;
		s[2]=ms;
		s[3]=ms1;
		s[4]=rs;
		s[5]=rs1;
		s[6]=g;
		
		
		for (Sport see:s) {
			System.out.println("Name of the sport is: "+see.getName());
			System.out.println("Equipment used in a sports are: "+ see.getEquipment());
			System.out.println("Location for the game: "+see.getLocation());
		
			if(see instanceof TeamSport ) {
				TeamSport t = (TeamSport)see;
				System.out.println(t.getNumberOfTeams());
				System.out.println(t.getPlayersPerTeam());
			}
			if(see instanceof BallSport){
				BallSport b=(BallSport)see;
				System.out.println(b.getTimeLimit());
			}
			if (see instanceof MotorSport) {
				MotorSport m=(MotorSport)see;
				System.out.println(m.getNumberOfLpas());
			}
			if(see instanceof RacketSport) {
				RacketSport r = (RacketSport)see;
				System.out.println(r.getScoreLimit());
			}
			 
			System.out.println("___________________________________________________________________");
		}
		
		
		
	}

}

interface Sport{
	public String getEquipment();
	public String getName();
	public String getLocation();
}


interface TeamSport{
	public int getNumberOfTeams();
	public int getPlayersPerTeam();
}


class BallSport implements Sport, TeamSport{
	protected String objectName;
	protected String equipment;
	protected String location;
	protected int number_of_teams;
	protected int players_per_team;
	protected int time_limit;
	
	
	public BallSport(String objectName, String equipment, String location, int number_of_teams, int players_per_team, int time_limit) {
		this.objectName=objectName;
		this.equipment=equipment;
		this.location=location;
		this.number_of_teams=number_of_teams;
		this.players_per_team=players_per_team;
		this.time_limit=time_limit;
	}
	
	public String getEquipment() {
		return equipment;
	}
	public String getName() {
		return objectName;
	}
	public String getLocation() {
		return location;
	}
	public int getNumberOfTeams() {
		return number_of_teams;
	}
	public int getPlayersPerTeam() {
		return players_per_team;
	}
	public int getTimeLimit() {
		return time_limit;
	}
	
	
}

class MotorSport implements Sport,TeamSport{
	protected String objectName;
	protected String equipment;
	protected String location;
	protected int number_of_teams;
	protected int players_per_team;
	protected int laps;
	
	public MotorSport(String objectName, String equipment, String location, int number_of_teams, int players_per_team, int laps) {
		this.objectName=objectName;
		this.equipment=equipment;
		this.location=location;
		this.number_of_teams=number_of_teams;
		this.players_per_team=players_per_team;
		this.laps=laps;
	}
	public String getEquipment() {
		return equipment;
	}
	public String getName() {
		return objectName;
	}
	public String getLocation() {
		return location;
	}
	public int getNumberOfTeams() {
		return number_of_teams;
	}
	public int getPlayersPerTeam() {
		return players_per_team;
	}
	public int getNumberOfLpas() {
		return laps;
	}
	
	
}

class RacketSport implements Sport{
	protected String objectName;
	protected String equipment;
	protected String location;
	protected int score_limit;
	
	public RacketSport(String objectName,String equipment, String location, int score_limit) {
		this.objectName=objectName;
		this.equipment=equipment;
		this.location=location;
		this.score_limit=score_limit;
	}
	
	public String getEquipment() {
		return equipment;
	}
	public String getName() {
		return objectName;
	}
	public String getLocation() {
		return location;
	}
	public int getScoreLimit() {
		return score_limit;
	}
	
}

class Golf implements Sport{
	protected String objectName;
	protected String equipment;
	protected String location;
	public Golf(String objectName,String equipment, String location) {
		this.objectName=objectName;
		this.equipment=equipment;
		this.location=location;
	}
	public String getEquipment() {
		return equipment;
	}
	public String getName() {
		return objectName;
	}
	public String getLocation() {
		return location;
	}
}

package term1;


public class InterTest {

	public static void main(String[] args) {
		BallSport a=new BallSport("FootBall","Net,Ball","Pitch", 2, 11, 90);
		BallSport a1=new BallSport("Rugby","Goal,Ball","Pitch", 2, 15, 90);
		
		MotorSport b=new MotorSport("Formula1","Car","Track", 11, 2, 70);
		MotorSport b1=new MotorSport("Moto Gp","MotorCycle","Track", 13, 3, 80);
		
		
		RacketSport c= new RacketSport("Tennis","Racket","Court",40);
		RacketSport c1= new RacketSport("Badminton","Racket","Court",30);
		
		Golf d=new Golf("Golf","Golf Clubs","Course");
		
		  Sport[] aray = new Sport[7];// array of interface Sport as It has been implemented by every class
		  aray[0]=a;
		  aray[1]=a1;
		  aray[2]=b;
		  aray[3]=b1;
		  aray[4]=c;
		  aray[5]=c1;
		  aray[6]=d;
		  
		  
		  for(Sport tee:aray) {
			  System.out.println("Sports Name: "+ tee.getName());
			  System.out.println("Equipment: "+ tee.getEquipment());
			  System.out.println("Location for the Game: "+ tee.getLocation());
			  
			  
			  if(tee instanceof TeamSport) {
				 TeamSport ts=(TeamSport)tee;//typecasting assigning  the ts variable to hold a reference to the tee object as a TeamSport object.
				 System.out.println("Number Of Teams: "+ts.getNumberOfTeam());//method of TeamSports
				 System.out.println("Players per Team: "+ts.getPlayersPerTeam());//method of TeamSports
			  }
			  
			  if(tee instanceof BallSport) {
				  BallSport bs=(BallSport)tee;
				  System.out.println("Time: "+ bs.getTimeLimit()+" :Minutes");//method of BallSport
			  }
			  if(tee instanceof MotorSport) {
				  MotorSport bs=(MotorSport)tee;
				  System.out.println("No.Of Laps : "+ bs.getNumberOfLaps());//method of MotorSport
			  }
			  
			  if(tee instanceof RacketSport) {
				  RacketSport bs=(RacketSport)tee;
				  System.out.println("No.Of Laps : "+ bs.getScoreLimit());//method of RacketSport
			  }
			  
			  System.out.println("____________________________________________");
		  }
	}

}

//interface Sport
interface Sport{
	public String getEquipment();//abstract method getEquipmet
	public String getName();//abstract method getname
	public String getLocation();//abstract method get locatiion
	
	
}

//interface TeamSport
interface TeamSport{
	public int getNumberOfTeam();//abstract method getNumberOfteam
	public int getPlayersPerTeam();//abstract method getPlayerPerTeam
}


//class ball which implements Sport and TeamSport
 class BallSport implements Sport,TeamSport{
	String objectName;
	String equipment;
	String location;
	int number_of_teams;
	int players_per_team;
	int time_limit;
	
	
//	creating constructor of the class 
	public BallSport(String objectName, String equipment,String location, int number_of_teams, int players_per_team,int time_limit) {
		this.objectName=objectName;
		this.equipment=equipment;
		this.location=location;
		this.number_of_teams=number_of_teams;
		this.players_per_team=players_per_team;
		this.time_limit=time_limit;
	}
	
	
	
//	implementing every methods of implemented interfaces
	
	
	public int getNumberOfTeam() {
		
		return number_of_teams;
	}


	public int getPlayersPerTeam() {
		
		return players_per_team;
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
	
//	method of BallSport class
	
	 int getTimeLimit() {
		return time_limit;
		 
	 }
	
}
 
 
 
 
 
 
 class MotorSport implements Sport,TeamSport{
	 
		String objectName;
		String equipment;
		String location;
		int	number_of_teams;
		int players_per_team;
		int laps;
		
		
		
		public MotorSport(String objectName, String equipment,String location, int number_of_teams, int players_per_team,int laps) {
			this.objectName=objectName;
			this.equipment=equipment;
			this.location=location;
			this.number_of_teams=number_of_teams;
			this.players_per_team=players_per_team;
			this.laps=laps;
		}
		
		public int getNumberOfTeam() {
			
			return number_of_teams;
		}


		public int getPlayersPerTeam() {
			
			return players_per_team;
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
		int getNumberOfLaps() {
			return laps;
			 
		 }
	 
 }
 
 
 
 
 
 

 class RacketSport implements Sport{
	 	String objectName;
		String equipment;
		String location;
		int score_Limit;
		
		
		public RacketSport(String objectName, String equipment,String location,int score_Limit) {
			this.objectName=objectName;
			this.equipment=equipment;
			this.location=location;
			this.score_Limit=score_Limit;
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
	 
	int getScoreLimit() {
		return score_Limit;
		
	}
 }
 
 
 
 
 
 
 class Golf implements Sport{
	 	String objectName;
		String equipment;
		String location;
		
		
		public Golf(String objectName, String equipment,String location) {
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
 
 
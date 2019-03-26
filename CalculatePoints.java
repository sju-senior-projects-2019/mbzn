package calculatePoints;

import java.util.Scanner;

public class CalculatePoints {
	
	private static double RBPoints(){
		Scanner scan = new Scanner(System.in);
	       System.out.println("Please enter Running Back stats below:");
	       System.out.println("Rushing yards stats: ");
	       double rushingYard = scan.nextDouble() * 0.2;
	       System.out.println("Rushing Touchdowns stats: ");
	       double rushingTouchDowns = scan.nextDouble() * 6;
	       System.out.println("Receptions: ");
	       double receptions = scan.nextDouble() * 1;
	       System.out.println("Receiving yards stats: ");
	       double recevingYard = scan.nextDouble() * 0.15;
	       System.out.println("Receiving Touchdowns stats: ");
	       double recevingTouchDowns = scan.nextDouble() * 6;
	       System.out.println("Fumbles stats: ");
	       double fumbles = scan.nextDouble() * -2;

	       double totalPoints = rushingYard + rushingTouchDowns + receptions + recevingYard + recevingTouchDowns + fumbles;
	       System.out.println("Players total points is " + totalPoints);
	       scan.close();
		
	       return totalPoints;
		
	}
	
	
	
	private static double WRPoints(){
		
		Scanner scan = new Scanner(System.in);
	       System.out.println("Please enter Wide Receiver stats below:");
	       System.out.println("Receptions: ");
	       double receptions = scan.nextDouble() * 1;
	       System.out.println("Receiving yards stats: ");
	       double recevingYard = scan.nextDouble() * 0.15;
	       System.out.println("Receiving Touchdowns stats: ");
	       double recevingTouchDowns = scan.nextDouble() * 6;
	       System.out.println("Rushing yards stats: ");
	       double rushingYard = scan.nextDouble() * 0.2;
	       System.out.println("Rushing Touchdowns stats: ");
	       double rushingTouchDowns = scan.nextDouble() * 6;
	       System.out.println("Fumbles stats: ");
	       double fumbles = scan.nextDouble() * -2;

	       double totalPoints = rushingYard + rushingTouchDowns + receptions + recevingYard + recevingTouchDowns + fumbles;
	       System.out.println("Players total points is " + totalPoints);
	       scan.close();
		
	       return totalPoints;
		
		
	}
	
	private static double QBPoints(){
		
		Scanner scan = new Scanner(System.in);
	       System.out.println("Please enter Quarterback stats below:");
	       System.out.println("Passing Yards: ");
	       double passingYards = scan.nextDouble() * 0.05;
	       System.out.println("Passing Touchdowns: ");
	       double passingTouchdowns = scan.nextDouble() * 6;
	       System.out.println("Rushing yards stats: ");
	       double rushingYard = scan.nextDouble() * 0.2;
	       System.out.println("Rushing Touchdowns stats: ");
	       double rushingTouchDowns = scan.nextDouble() * 6;
	       System.out.println("Fumbles stats: ");
	       double fumbles = scan.nextDouble() * -2;
	       System.out.println("Interception stats: ");
	       double interceptions = scan.nextDouble() * -2;

	       double totalPoints = rushingYard + rushingTouchDowns + passingYards + passingTouchdowns + fumbles + interceptions;
	       System.out.println("Players total points is " + totalPoints);
	       scan.close();
		
	       return totalPoints;
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
	       System.out.println("Please enter players position #: ");
	       System.out.println("QB-1, WR-2, or RB-3");
	        int position = scan.nextInt();
	        if( position == 1){
	        	QBPoints();
	        }else{ 
	        	if(position == 2){
	        		WRPoints();
	        	}else{
	        		if(position ==3){
	        			RBPoints();
	        		}
	        	}
	        }
	}

}

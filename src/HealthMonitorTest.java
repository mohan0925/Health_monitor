

import java.util.Scanner;

/**
 * 
 * This HealthMonitor Test class gets the value within the specific range of each health parameters in this class.
 * Also,in this monitor it checked the condition of the parameters.
 * 
 * If reading goes beyond the 
 * range the alarm is set to ON. 
 * 
 * otherwise,if the reading is within the 
 * range the alarm is set to OFF. 
 *
 */
public class HealthMonitorTest {

	/**
	 * Initialises main method of the Health Monitor Test class
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		/**
		 * Make an Object of an HealthMonitor Class.
		 * 
		 * Initialise the Object of the Constructor. 
		 */
		HealthMonitor hm = new HealthMonitor();
		
		/**
		 *  This below statements get the input from user and stores in to parameters(Heart beat,Temperature,Blood Pressure).
		 *  
		 */
		System.out.println("-- This is a Health Monitor Application --");
		System.out.println("\nEnter your Heart Beat Rate:");
		int heartbeat = sc.nextInt(); 
		hm.setheartbeatnumber(heartbeat);
		
		System.out.println("Enter your Body Temprature:");
		double temprature = sc.nextInt();
		hm.settempraturenumber(temprature);
		
		System.out.println("Enter your Blood Pressure Rate:");
		int bloodpressure =  sc.nextInt();
		hm.setbloodpressurenumber(bloodpressure);
		
		// Print Summary of HEALTH MONITOR APPLICATION
		/**
		 *  This below statements give all information of the Health Monitor Application.
		 *  
		 */
		System.out.println("\nWelcome to the Health Monitor Application");
		System.out.println("-------------------------------------------------");
		System.out.println("Your HeartBeat Should be Between 60 - 100");
		System.out.println("Your Body Temprature Should be Between 36 Celcius - 37.2 Celcius");
		System.out.println("Your BloodPressure Should be Between 90 - 140");
		System.out.println("-------------------------------------------------");
		
		/**
		 *  This below statements get the current value from the what value user entered.
		 */
		System.out.println("Your HeartBeat rate is: " + hm.getheartbeatnumber());
		System.out.println("Your Body temprature is: " + hm.getempraturenumber());
		System.out.println("Your BloodPressure is: " + hm.getbloodpressurenumber());

		System.out.println("-------------------------------------------------");
		System.out.println("\nThis is the Report of your Health Monitor Record");
		
		
		/**
		 *  This below statements checks the condition if heart-beat is okay than IF part will be execute and message will printed.
		 *    
		 *  This statement checks the condition -- if Heart-beat is OK than -- Your Heart-Beat is normal -- Alarm is OFF -- statement will print.  
		 *  This statement checks the condition -- if Heart-beat is NOT OK than -- Your Heart-Beat is not normal -- Alarm is ON -- statement will print. 
		 *  
		 */
		if(hm.heartbeatOK()) {
			System.out.println("\nYour Heartbeat is normal");
			System.out.println("Alarm is OFF");
		}
		else
		{
			System.out.println("Your Heartbeat is not normal");
			System.out.println("Alarm is ON");
		}
		
		/**
		 *  This below statements checks the condition if Temperature is okay than IF part will be execute and message will printed.
		 *    
		 *  This statement checks the condition -- if Temperature is OK than -- Your Body Temperature is normal -- Alarm is OFF -- statement will print.  
		 *  This statement checks the condition -- if Temperature is NOT OK than -- Your Body Temperature is not normal -- Alarm is ON -- statement will print.
		 *   
		 */
		if (hm.tempratureOK()) {
			System.out.println("\nYour Body Temperature is normal");
			System.out.println("Alarm is OFF");
		}
		else 
		{
			System.out.println("\nYour Body Temperature is not normal");
			System.out.println("Alarm is ON");
		}
		
		/**
		 *  This below statements checks the condition if blood-pressure is okay than IF part will be execute and message will printed.
		 *    
		 *  This statement checks the condition -- if blood-pressure is OK than -- Your blood-pressure is normal -- Alarm is OFF -- statement will print.  
		 *  This statement checks the condition -- if blood-pressure is NOT OK than -- Your blood-pressure is not normal -- Alarm is ON -- statement will print. 
		 * 
		 */
		if(hm.bloodpressureOK()) {
			System.out.println("\nYour BloodPressure is normal");
			System.out.println("Alarm is OFF");
		}
		else 
		{
			System.out.println("\nYour BloodPressure is not normal");
			System.out.println("Alarm is ON");
		}

	}

}

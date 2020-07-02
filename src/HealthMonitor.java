

/**
 * - This Health monitor is used for a variety of purposes like: 
 * 
 * --- measure heart beat, 
 * --- measure temperature,
 * --- measure blood pressure. 
 * 
 * - This monitor has a minimum and maximum rate for each parameters(Heartbeat, Temprature, Bloodpressure). 
 * - If the reading goes out of the range then an alarm is set to ON.
 * - If the reading is within range then an alarm is set to OFF.
 * - This Application takes user input and gives output as per the reading range. 
 * 
 */

public class HealthMonitor {
	
	//Fields
	/**
	 * Initialises constant minimum and maximum field.
	 */
	private final int    min_HB = 60, max_HB = 100;
	private final double min_temp = 36, max_temp = 37.2;
	private final int    min_BP = 90 , max_BP = 140;
	
	/**
	 * Initialises health monitor parameters.
	 */
	private int     heartbeat;
	private double  temprature;
	private int     bloodpressure;
	
	//Constructor
	/**
	 ** Default constructor, initialises set all parameters values at zero.
	 */
	public HealthMonitor() {
		heartbeat =   0;
		temprature =  0;
		bloodpressure = 0;
	}
	
	/**
	 * initialises a newly created heart beat, temperature and blood pressure object with a custom value.
	 * 
	 * @param heartbeat -- set the initial value of heart beat.
	 * @param temprature -- set the initial value of temperature.
	 * @param bloodpressure -- set the initial value of blood pressure.
	 */
	public HealthMonitor(int heartbeat, double temprature, int bloodpressure) {
		this.heartbeat = heartbeat;
		this.temprature = temprature;
		this.bloodpressure = bloodpressure;
	}
	
	//Methods
	// Set and Get Heart beat Rate
	/**
	 * This set method sets the heart beat value into heart beat parameter. 
	 * The input value will be taken form the user.
	 * 
	 * @param heartbeat rate integer value at which the heart-beat rate should be set
	 */
	public void setheartbeatnumber(int heartbeat) {
		this.heartbeat = heartbeat;
	}
	
	
	/**
	 * This get method returns the current heart beat rate of user.
	 * 
	 * @return the current heart beat rate of user.
	 */
	public int getheartbeatnumber() {
		return heartbeat;
	}
	
	
	// Set and get the Temperature
	/**
	 * This set method sets the temperature value into temperature parameter.
	 * The input value will be taken form the user.
	 * 
	 * @param temprature range double value at which the temperature rate should be set.
	 */
	public void settempraturenumber(double temprature) {
		this.temprature = temprature;
	}
	
	/**
	 * This get method returns the current temperature rate of user.
	 * 
	 * @return the current temperature rate of user.
	 */
	public double getempraturenumber() {
		return temprature;
	}
	
	
	// Set and get Blood Pressure
	/**
	 * This set method sets the Blood Pressure value into Blood Pressure parameter.
	 * The input value will be taken form the user.
	 * 
	 * @param bloodpressure blood-pressure rate integer value at which the blood-pressure rate should be set
	 */
	public void setbloodpressurenumber(int bloodpressure) {
		this.bloodpressure = bloodpressure;
	}
	
	/**
	 * This get method returns the current Blood Pressure rate of user.
	 * 
	 * @return the current blood pressure rate of user.
	 */
	public int getbloodpressurenumber() {
		 return bloodpressure;
	}
	
	
	
	// Check the Health Monitors Parameters
	
	/**
	 * This Boolean methods checks the user's heart beat is OK or not.
	 * 
	 * if heart beat rate is less than minimum rate of heart beat this function returns false value.
	 * if heart beat rate is greater than maximum rate of heart beat this function returns false value again.
	 * 
	 * if heart beat rate is within the minimum rate of heart beat this function returns true value.
	 * if heart beat rate is within the maximum rate of heart beat this function returns true value again.
	 * 
	 * @return false when heart beat rate is less than minimum range of the heart beat.
	 * @return true  when heart beat rate is within the minimum and maximum range of the heart beat.
	 * 
	 */
	public boolean heartbeatOK()
	{
		
		if(heartbeat < min_HB || heartbeat > max_HB)
		{
			
			return false;
		}
		else
		{
	
			return true;
		}
	}
	
	
	/**
	 * This Boolean methods checks the user's body temperature is OK or not.
	 * 
	 * if temperature range is less than minimum range of temperature this function returns false value.
	 * if temperature range is greater than maximum range of temperature this function returns false value again.
	 * 
	 * if temperature range is within the minimum range of temperature this function returns true value.
	 * if temperature range is within the maximum range of temperature this function returns true value again.
	 * 
	 * @return false when temperature range is less than minimum range of the temperature.
	 * @return true  when temperature range is within the minimum and maximum range of the temperature.
	 * 
	 */
	public boolean tempratureOK()
	{
	
		if(temprature < min_temp || temprature > max_temp)
		{
			
			return false;
		}
		else
		{
			
			return true;
		}
	}
	
	/**
	 * This Boolean methods checks the user's body's blood pressure is OK or not.
	 * 
	 * if blood pressure rate is less than minimum rate of blood pressure this function returns false value.
	 * if blood pressure rate is greater than maximum rate of blood pressure this function returns false value again.
	 * 
	 * if blood pressure rate is within the minimum rate of blood pressure this function returns true value.
	 * if blood pressure rate is within the maximum rate of blood pressure this function returns true value again.
	 * 
	 * @return false when blood pressure rate is less than minimum rate of the blood pressure.
	 * @return true  when blood pressure rate is within the minimum and maximum rate of the blood pressure.
	 */
	public boolean bloodpressureOK()
	{
		if(bloodpressure < min_BP || bloodpressure > max_BP)
		{
			
			return false;
		}
		else
		{
			
			return true;
		}
	}
	
	
	/**
	 * Returns a textual representation of the min_HB, max_HB, min_temp, max_temp, min_BP, max_BP, heart beat, temperature and blood pressure. 
	 * 
	 * @return a textual representation of the min_HB, max_HB, min_temp, max_temp, min_BP, max_BP, heart beat, temperature and blood pressure.
	 */
	@Override
	public String toString() {
		return "HealthMonitor:[min_HB=" + min_HB + ", max_HB=" + max_HB + ", min_temp= " + min_temp + ", max_temp= " + max_temp + ", min_BP= " + min_BP + 
				", max_BP= " + max_BP + ", heartbeat= " + heartbeat + ",temprature= " + temprature +", bloodpressure =" + bloodpressure +"]";
	}
}

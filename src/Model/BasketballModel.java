package Model;

import interesante.BasketballController;

public class BasketballModel
{

	private String name;
	private int timeMinutes;
	private double attemptPercentage;
	private int attemptAmount;
	private boolean practice;


	{
		yourPractice = new BasketballController();
	}
	
	public void InteresanteRunner(String name)
	{
		this.name = "basketball practice";
	}

	public String getName()
	{
		return name;
	}

	public double getAttemptPercentage()
	{
		return attemptPercentage;
	}

	public int getAttemptAmount()
	{
		return attemptAmount;
	}
	
	public int getTimeMinutes()
	{
	return timeMinutes;
	}
	
	public boolean getPractice()
	{
	return practice;
	}
		//------------------------------------setters------------------------------
		
		
		public void setname( String name)
		{
			this.name = name;
		}
	
	
	
	
	
	
	
	
	
	
	}

package Model;

import interesante.BasketballController;

public class BasketballModel
{
	private BasketballController yourPractice;
	private String name;
	private int timeMinutes;
	private double attemptPercentage;
	private int attemptAmount;
	private boolean practice;
	private int attemptsMade;

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
	
	public int getAttemptsMade()
	{
		return attemptsMade;
	}
		//------------------------------------setters------------------------------
		
		
		public void setname( String name)
		{
			this.name = name;
		}
		public void setAttemptPercentage(double attemptPercentage)
		{
			this.attemptPercentage = attemptPercentage;
		}
		public void setAttemptAmount(int attemptAmount)
		{
			this.attemptAmount = attemptAmount;
		}
		public void setTimeMinutes(int timeMinutes)
		{
			this.timeMinutes = timeMinutes;
		}
		public void setPractice(boolean practice)
		{
			this.practice = practice;
		}
		public void setAttemptsMade(int attemtsMade)
		{
			this.attemptsMade = attemptsMade;
		}
	
	
	
	}

package interesante;

//imports
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Model.BasketballModel;

public class BasketballController
{

	public void start()
	{
		loopy();
	}

	public BasketballController()

	{

	}

	private void lotsOfRun()
	{
		
		ArrayList<BasketballModel> myPractice = new ArrayList<BasketballModel>();
		
		BasketballModel samplePractice = new BasketballModel();
		BasketballModel otherPractice = new BasketballModel();
		
		myPractice.add(samplePractice);
		myPractice.add(samplePractice);
		myPractice.add(otherPractice);
		}
		private void loopy()
		{
		
		BasketballModel myPractice = new BasketballModel();
		boolean isfinished = false;
		int someCount = 0;

//		//while (!isfinished)
//		{
//			JOptionPane.showMessageDialog(null, "annoy everyone");
//		}

		someCount++;
		someCount += 1;

		if (someCount > 10)
		{
			isfinished = true;
		}

		String responsePercentage = JOptionPane.showInputDialog(null, "what percentage of the shots have you made out of all the shots you've taken");
		while (!validDouble(responsePercentage))
		{
			responsePercentage = JOptionPane.showInputDialog(null, "what percentage did you make ");
		}
		myPractice.setAttemptPercentage(Double.parseDouble(responsePercentage));
		

		String responseAmount = JOptionPane.showInputDialog(null, "How many shots have you taken");
		while (!validDouble(responseAmount))
		{
			responseAmount = JOptionPane.showInputDialog(null, "how many shots have you taken ");
		}
		myPractice.setAttemptAmount(Integer.parseInt(responseAmount));
		
		
		String responseMade = JOptionPane.showInputDialog(null, "how many shot have you made");
		while (!validDouble(responseAmount))
		{
			responseMade = JOptionPane.showInputDialog(null, "how many shots have you made ");
		}
		myPractice.setAttemptsMade(Integer.parseInt(responseAmount));
	
	
	}

	public boolean validDouble(String mightbeDouble)
	{
		boolean isValid = false;

		try
		{

			Double.parseDouble(mightbeDouble);
			isValid = true;
		}
		catch (

		NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "type in a decimal aka a number");
		}

		return isValid;

	}
}

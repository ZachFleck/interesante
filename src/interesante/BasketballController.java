package interesante;
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

	private void loopy()
	{

		boolean isfinished = false;
		int someCount = 0;
		
		while (!isfinished)
		{
			JOptionPane.showMessageDialog(null, "annoy everyone");
		}
			
		someCount++;
someCount += 1;

	
	if (someCount > 10)
	{
		isfinished = true;
	}
	
	String response = JOptionPane.showInputDialog(null,"how many shots have been made");
	while(!validDouble(response))
	{
	JOptionPane.showMessageDialog(null, "got the right answer ");
	}
	response = JOptionPane.showInputDialog(null, "Got to do the right answer");
	}
	.setShotsMade(Double.parsDouble(response));
	
	
		}
}

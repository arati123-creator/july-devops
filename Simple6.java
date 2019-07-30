//Convert a given number of pounds to kilograms1.
//Create a variable to store the 100 pounds
//2.Calculate the number of Kilograms for the number 100 pounds and store in a variable.
//3.Print out the result


public class Simple6 {

	public static void main(String[] args)
	{
	
		double pounds = 100;
		double kg = pounds / 2.20462262;
		
		String text = "Pounds(%s) => KG(%.2f)";
		System.out.println(String.format(
				text, 
				pounds, kg));
	}
}

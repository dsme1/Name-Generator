package nameGenerator;

import java.util.Random;
import java.util.Arrays;

public class generatorFunctions {

	private static Random rand = new Random();
	
	public static String russian()
	{

		String russianName = "";
		String ruFirst = "";
		String ruPat = "";
		String ruLast = "";
		
		//russian name generation
		ruFirst = namesArray.russianFirstName[rand.nextInt(namesArray.russianFirstName.length)] + " ";
		ruLast = namesArray.russianLastName[rand.nextInt(namesArray.russianLastName.length)] + " ";
		ruPat = namesArray.russianPatName[rand.nextInt(namesArray.russianPatName.length)];
		
		russianName = ruFirst + ruLast + ruPat;
		
		return russianName;
		
	}
	
	public static String dutch()
	{
		
		String dutchName = "";
		String[] nlFirstArray = {};
		String nlLast = "";
		
		//random number for loop
		//int nameNo = (int) (Math.random() * (4 - 1) + 1);
		int nameNo = 1;
		//loop that picks between 2 and 4 names from array
		//for (int i = nameNo; i <= 3; i++) 
		//{
		//	nlFirst = nlFirst + namesArray.dutchFirstName[rand.nextInt(namesArray.dutchFirstName.length)] + " ";
		//};
		
		for (int i = nameNo; i <= 3; i++) 
		{
			String [] nlFirstTwee = Arrays.stream(namesArray.dutchFirstName).distinct().toArray(String[]::new);
			
			nlFirstArray = nlFirstTwee;
			
		};
		
		String nlFirstString = String.join(" ", nlFirstArray);
		
		dutchName = nlFirstString;
		
		return dutchName;
	}
	
	public static void main(String[] args) {
	
		String russianName = russian();
		String dutchName = dutch();
		
		System.out.println(russianName);
		System.out.println(dutchName);
		
		
		
	}
	
}

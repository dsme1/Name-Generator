package nameGenerator;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class generatorFunctions {

	private static Random rand = new Random();
	
	//private static Function
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
		List<String> names = new ArrayList<String>();
		String[] namesLeft = {};
		
		for (int i = 0; i < rand.nextInt(3) + 1; i++) {
			namesLeft = Arrays.stream(namesArray.dutchFirstName).filter(s -> {
				return !names.contains(s);
			}).toArray(String[]::new);
			
			String name = namesLeft[rand.nextInt(namesLeft.length)];
			names.add(name);
			dutchName += name + " ";
		}
		
		dutchName += namesArray.dutchLastName[rand.nextInt(namesArray.dutchLastName.length)];
		return dutchName;
	}
	
	public static void main(String[] args) {
	
		String russianName = russian();
		String dutchName = dutch();
		
		System.out.println(russianName);
		System.out.println(dutchName);
		
		
		
	}
	
}
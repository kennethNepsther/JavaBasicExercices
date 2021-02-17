package calculateAge;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculate {

	public static void main(String[] args) {
		
	
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(1989, 5, 13);
		int years =Period.between(birthDate, today).getYears();
		//System.out.println(birthDate);
		//System.out.println(today);
		System.out.println(years);

	}

}

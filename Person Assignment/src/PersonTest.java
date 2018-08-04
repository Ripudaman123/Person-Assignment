import java.time.Period;

//To test the person class
public class PersonTest {

	public static void main(String[] args) {

		Person person1 = new Person("Ram", 05, 06, 1990);
		Person person2 = new Person("Shyam", 02, 03, 1987);

		Period period2;
		period2 = Person.Age(person1);

		System.out.println(person1 + "     \n Age: " + period2.getYears() + " Years " + period2.getMonths() + " Months "
				+ period2.getDays() + " Days ");
		
		Period period3;
		period3 = Person.Age(person2);
		
		System.out.println(person2 + "     \n Age: " + period3.getYears() + " Years " + period3.getMonths() + " Months "
				+ period3.getDays() + " Days ");
		
		Period period;
		period = Person.olderOne(person1, person2);
		System.out.printf("Difference is %d years , %d months and %d days old", period.getYears(), period.getMonths(),
				period.getDays());
	}

}

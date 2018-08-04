import java.time.LocalDate;
import java.time.Period;
//To calculate age of a person and also find the elder of two persons
public class Person {

	private String name;
	private LocalDate dob;

	public Person(String n, int d, int m, int y) {
		name = n;
		dob = LocalDate.of(y, m, d);

	}

	public static Period Age(Person p) {
		LocalDate now = LocalDate.now();
		Period age = Period.between(p.dob, now);

		return age;
	}

	public Person display() {
		Person person = new Person(name, dob.getDayOfMonth(), dob.getMonthValue(), dob.getYear());

		return person;
	}

	public static Period olderOne(Person p1, Person p2) {
		Period diff;
		if (p1.dob.isAfter(p2.dob)) {
			diff = Period.between(p2.dob, p1.dob);
			return diff;
		} else {
			diff = Period.between(p1.dob, p2.dob);
			return diff;
		}
	}

	@Override
	public String toString() {
		return "Person Details " + "\nName=" + name + "\nDob=" + dob;
	}

}

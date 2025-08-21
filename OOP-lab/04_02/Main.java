import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;


class Person {
    int id;
    String name;
    String gender;
    LocalDate dateOfBirth;

    public Person(int id, String name, String gender, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public int calculateAge() {
        return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
    }

    public void displayPersonDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Gender: " + gender + ", Date of Birth: " + dateOfBirth);
    }
}

class Voter extends Person {
    public Voter(int id, String name, String gender, LocalDate dateOfBirth) {
        super(id, name, gender, dateOfBirth);
    }
}

class InvalidVoterException extends Exception {
    public InvalidVoterException(String message) {
        super(message);
    }
}


public class Main {
    public static Voter registerVoter(Person person) throws InvalidVoterException {
        if (person.calculateAge() < 18) {
            throw new InvalidVoterException("Person " + person.name + " is under 18 and cannot register as a voter.");
        }
        return new Voter(person.id, person.name, person.gender, person.dateOfBirth);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons (n): ");
        int n = scanner.nextInt();
        scanner.nextLine();  

        Person[] persons = new Person[n];
        Voter[] voters = new Voter[n]; 
        Person[] invalidVoters = new Person[n]; 

        int voterCount = 0;
        int invalidVoterCount = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Gender: ");
            String gender = scanner.nextLine();

            System.out.print("Date of Birth (YYYY-MM-DD): ");
            LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());
            persons[i] = new Person(id, name, gender, dateOfBirth);

            try {
                voters[voterCount] = registerVoter(persons[i]);
                voterCount++;
            } catch (InvalidVoterException e) {
                System.out.println(e.getMessage());
                invalidVoters[invalidVoterCount] = persons[i];
                invalidVoterCount++;
            }
        }

        System.out.println("\nList of registered voters:");
        for (int i = 0; i < voterCount; i++) {
            voters[i].displayPersonDetails();
        }
        System.out.println("\nList of invalid voters:");
        for (int i = 0; i < invalidVoterCount; i++) {
            invalidVoters[i].displayPersonDetails();
        }
        scanner.close();
    }
}

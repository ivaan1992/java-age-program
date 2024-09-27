import java.time.LocalDate;
import java.util.Scanner;


public class AgeProgram {
    public static void main(String[] args) {
	// El usuario ingresa su nombre
		Scanner UserInfo = new Scanner(System.in);
		System.out.print("Tu nombre es: ");
		String Name = UserInfo.nextLine();
		
	// El usuario ingresa su año de nacimiento
		System.out.print("Tu año de nacimiento es: ");
		int YearOfBirth = UserInfo.nextInt();
		UserInfo.close();

		int age = getAge(YearOfBirth);


		System.out.println("Hola " + Name + "\nTu edad es: " + age + " años");

		if (age < 18) {
            System.out.println("Eres menor de edad.");
        } else if (age >= 18 && age < 65) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Perteneces a la tercera edad.");
        }

		
	}
	
	static int getAge(int YearOfBirth) {
		int currentYear = LocalDate.now().getYear();
		return currentYear - YearOfBirth;
	}
}

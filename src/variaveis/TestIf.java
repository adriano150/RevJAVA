package variaveis;

public class TestIf {

	public static void main(String[] args) {
		
		// Variável auxiliar
		boolean isAlien = true;
		
		if(isAlien == false){
			System.out.println("It is not an alien!");
			System.out.println("And i am scared of aliens");
		}
		
		int topScore = 80;
		if(topScore < 100) {
			System.out.println("You got the high score!");
		}
		
		int secondTopScore = 81;
		if(topScore > secondTopScore && topScore < 100) {
			System.out.println("Greater than second top score and less than 100");
		}
		
		int ageOfClient = 20;
		String ageText = ageOfClient >= 20 ? "Over Eighteen" : "Still a kid";
		System.out.println("Our client is " + ageText);
		
		if(ageOfClient >= 20) {
			System.out.println("Over Eighteen");
		}else {
			System.out.println("Still a kid");
		}
	}

}

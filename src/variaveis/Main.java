package variaveis;

public class Main {
	String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void checkNumber(int number) {
		if (number == 0) {
			setNumber("\nZero");
		} else if (number > 0) {
			setNumber("\nPositivo");
		} else {
			setNumber("\nNegativo");
		}
	}

	public String toString() {
		return "O número é: " + getNumber();
	}
}

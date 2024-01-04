
public class Calculator {
	private int num1;
	private int num2;
	private int result;
	
	public void add() {
		result = num1 + num2;
	}
	public void multiply() {
		result = num1 * num2;
	}
	public int showResult() {
		return result;
	}
	public void setValue(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
}

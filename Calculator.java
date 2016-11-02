
/** класс реализует калькулятор
*/

public class Calculator{
	/** результат вычисления
	*/

	private double result; // результат
	private double first;  // первое значение
	private double second; //второе значение
	private String operation;
boolean c=true;
	private boolean save=false;		//true сохранить результат, false не сохранять 

	/** Операции */
	public double calc(){

	switch (operation){
	case "+":
		result= first+second;
		break;
	case "-":
		result= first-second;
		break;
	case "*":
		result= first*second;
		break;
	case "/":
	/**Проверка на 0 */

	if(second==0){
		System.out.println("Nizya na nuul");
		System.out.println("Enter second argyment");
		break;
		}
		else{ 
			result= first/second;
			break;
			}
		
	default:
		result = 0; // В случае если неверный символ операции, метод вернет '0'
		break;



	} return result;
	}
	public double getFirst() {
		return first;
	}

	public void setFirst(double first) {
		this.first = first;
	}

	public double getSecond() {
		return second;
	}

	public void setSecond(double second) {
		this.second = second;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public boolean isSave() {
		return save;
	}

	public void setSave(boolean state) {
		this.save = state;
	}
}

	
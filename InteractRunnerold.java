
import java.unit.scanner;
/**
Класс для запуска калькулятораю Поддерживает ввод пользователя
*/
public class InteractRunnerold{
	public static void main(String[]arg){
		Scanner reader=new Scanner(System.in);
		try{
			Calculatorold calc=new Calculatorold();
			String exit="no";
			While(!exit.equals("yes")){
				System.out.println("Enter first arg: ");
				String first=reader.next();
				System.out.println("Enter second arg: ");
				String second=reader.next();
								calc.add(Integer.valuOf(first),Integer.valueOf(second));
				System.out.println("Result: " +calc.getResult());
				calc.cleanResult();
				System.out.println("Exit: yes/no ");
				exit=reader.next();
		
			}
		} finally{
			reader.Close();
		}
	}	
}
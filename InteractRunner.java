
import java.util.Scanner;
/**
Класс для запуска калькулятораю Поддерживает ввод пользователя
Есть возможность повторного использования результата вычислений
*/
public class InteractRunner{
	public static void main(String[]arg){
		
		try(Scanner reader = new Scanner(System.in);) {
			Calculator calc = new Calculator();
			            String exit = "no";
            		            int first;
			            int second;
				    String save = "clear";

			/**
			Пока не будет указан выход продолжаем
			*/

			while (!exit.equals("yes")) {
			
			if(save.equals("save")){
				first=(int)calc.getResult();
			}else {
				System.out.println("Enter first arg: ");
				first=reader.nextInt();
			}

/**
System.out.println("Enter first arg: ");
String first=reader.next();
*/
				System.out.println("Enter second arg: ");
				second = reader.nextInt();
				System.out.println("Enter operation (+ | - | * | /) ");
				String operation=reader.next();

	switch (operation){
		case "+" : calc.add(first,second);
				System.out.println("Result: " +calc.getResult());
		break;

		case "-" : calc.minus(first,second);
				System.out.println("Result: " +calc.getResult());
		break;

		case "*" : calc.mult(firnst,second);
				System.out.println("Result: " +calc.getResult());
		break;
	
			
		case "/":
			if (second!=0){
			calc.divid(first,second);
				System.out.println("Result: " +calc.getResult());

		 	} else {
			System.out.println("Division... Second is 0. you can't divide");}
			break;

                        
}

						

		System.out.println();
				System.out.println("Exit: yes/no ");
				exit=reader.next();
		
		/**
		Возможность сохранить результат вычисления для повторного использования
		*/		
			if(exit.equals("no")){
			System.out.println("Save result arg ? (save | clear)");
			save=reader.next();
			if(save.equals("clear")) {
				calc.cleanResult();
			}else if(save.equals("save")){
				System.out.println("First arg: " + calc.getResult());
			}
		}
		}
}
}
}

		

	
	

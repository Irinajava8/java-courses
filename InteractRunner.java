
import java.util.Scanner;
/**
Класс для запуска калькулятораю Поддерживает ввод пользователя
Есть возможность повторного использования результата вычислений
*/
public class InteractRunner{
	public static void main(String[]args){
	Scanner reader = new Scanner(System.in);	
	Calculator calcul= new Calculator();

		/**
		Пока не будет указан выход продолжаем
		*/

	while (true) 
	start: {
		/**Если результат не сохранен*/
		if(!calcul.isSave()){
		try{
		System.out.println("Enter first arg: ");
		calcul.setFirst(Double.parseDouble(reader.next())); // Перевод string в double
		
		System.out.println("Enter operation (+ | - | * | /) ");
		calcul.setOperation(reader.next());
		} catch(Exception e){
		System.out.println("Type numbers");
		break start;
		}
		}
	try{
		System.out.println("Enter second arg: ");
		calcul.setSecond(Double.parseDouble(reader.next())); // Перевод string в double
		}catch(Exception e){
		System.out.println("Type numbers");
		break start; // Выход из цикла
		}
		System.out.println("Result: " +calcul.calc());
		System.out.println("Type 'y' if you want to exit or any symbols " );
		
		if(reader.next().equals("y")){ //Нажали y и выход
		System.out.println("Exit! ");
		break;
		}
	else{
		System.out.println("Enter 'y' if you don't want to save result or enter any symbol use next ");
		if(!reader.next().equals("y")){ // Если не y , то сохранить результат
		calcul.setSave(true);
		calcul.setFirst(calcul.getResult());
		}
		}

}
}
}


import java.util.Scanner;
/**
����� ��� ������� ������������� ������������ ���� ������������
���� ����������� ���������� ������������� ���������� ����������
*/
public class InteractRunner{
	public static void main(String[]args){
	Scanner reader = new Scanner(System.in);	
	Calculator calcul= new Calculator();

		/**
		���� �� ����� ������ ����� ����������
		*/

	while (true) 
	start: {
		/**���� ��������� �� ��������*/
		if(!calcul.isSave()){
		try{
		System.out.println("Enter first arg: ");
		calcul.setFirst(Double.parseDouble(reader.next())); // ������� string � double
		
		System.out.println("Enter operation (+ | - | * | /) ");
		calcul.setOperation(reader.next());
		} catch(Exception e){
		System.out.println("Type numbers");
		break start;
		}
		}
	try{
		System.out.println("Enter second arg: ");
		calcul.setSecond(Double.parseDouble(reader.next())); // ������� string � double
		}catch(Exception e){
		System.out.println("Type numbers");
		break start; // ����� �� �����
		}
		System.out.println("Result: " +calcul.calc());
		System.out.println("Type 'y' if you want to exit or any symbols " );
		
		if(reader.next().equals("y")){ //������ y � �����
		System.out.println("Exit! ");
		break;
		}
	else{
		System.out.println("Enter 'y' if you don't want to save result or enter any symbol use next ");
		if(!reader.next().equals("y")){ // ���� �� y , �� ��������� ���������
		calcul.setSave(true);
		calcul.setFirst(calcul.getResult());
		}
		}

}
}
}

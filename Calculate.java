public class Calculate{
	public static void main(String[] args){
		System.out.println("Calculate...");
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		int summ = first+second;
		System.out.println("Sum  "+summ);
		int min= first-second;
		System.out.println("Minus " + min);
		
		System.out.println("Multiplaction  " + (first*second));
		double involut=Math.pow(first,second);
		System.out.println("Involution  " + involut);
			if (second!=0){
				int divis=first/second;
				System.out.println("Division  "+divis);
				} else{
					System.out.println("Division... Second is 0. you can't divide");}

	}
}
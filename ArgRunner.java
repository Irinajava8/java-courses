/**
 * Класс реализует запуск калькулятора с передачей 3 аргументов (число, символ операции, число)
 */
public class ArgRunner {

    public static void main(String[] arg) {
        System.out.println("Calculate...");

        if (arg.length == 3) {
            Calculator calc = new Calculator();
            int first = Integer.valueOf(arg[0]);
            int second = Integer.valueOf(arg[2]);
            String operat = arg[1];
            switch (operat){
                case "+": calc.sum(first,second);
                    break;
                case "-": calc.subtr(first,second);
                    break;
                case "*": calc.mult(first,second);
                    break;
                case "/":
                    try {
                        calc.div(first,second);
                    } catch (Exception e){
                        System.out.println("My friend, you have some problem... " +e.getMessage());
                    }
                    break;
                default: System.out.println("Operation wrong!");
            }

            System.out.println("Result : " + calc.getResult());
        } else {
            System.out.println("Enter 3 paramenters with space");
        }
    }
}
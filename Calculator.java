
/** класс реализует калькулятор
*/

public class Calculator{
	/** результат вычисления
	*/

	private double result;
	/**
		Суммируем аргументы
		@param params аргументы суммирования
	*/
	
	public void add(int...params){
		for(Integer param:params){
			this.result+=param;
			}
		}


	/**
		Умножаем аргументы
		@param params аргументы суммирования
		multiply
	*/
	
		public void mult(int...params){
		for(Integer param:params){
			this.result*=param;
			}
		}
	


	/**
		Делим аргументы
		@param params аргументы суммирования
		divide
	*/
	
		public void divid(int...params){
		for(Integer param:params){
			this.result/=param;
			}
		}
	
	/**
		Вычитаем аргументы
		@param params аргументы суммирования
		sub
	*/
	
		public void minus(int...params){
		for(Integer param:params){
			this.result-=param;
			}
		}

	/**
	Получить результат
	@result результат вычисления
	*/
	public double getResult() {
        return this.result;
    	}
	/**
	Очистить результат вычисления
	*/
	public void cleanResult(){
		this.result=0;	
	}
}
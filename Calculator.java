
/** ����� ��������� �����������
*/

public class Calculator{
	/** ��������� ����������
	*/

	private double result;
	/**
		��������� ���������
		@param params ��������� ������������
	*/
	
	public void add(int...params){
		for(Integer param:params){
			this.result+=param;
			}
		}


	/**
		�������� ���������
		@param params ��������� ������������
		multiply
	*/
	
		public void mult(int...params){
		for(Integer param:params){
			this.result*=param;
			}
		}
	


	/**
		����� ���������
		@param params ��������� ������������
		divide
	*/
	
		public void divid(int...params){
		for(Integer param:params){
			this.result/=param;
			}
		}
	
	/**
		�������� ���������
		@param params ��������� ������������
		sub
	*/
	
		public void minus(int...params){
		for(Integer param:params){
			this.result-=param;
			}
		}

	/**
	�������� ���������
	@result ��������� ����������
	*/
	public double getResult() {
        return this.result;
    	}
	/**
	�������� ��������� ����������
	*/
	public void cleanResult(){
		this.result=0;	
	}
}
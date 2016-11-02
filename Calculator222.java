/* 
	
*/
public class Calculator222 {
/*
	
*/
private float result;

/*
	Noiie?oai a?aoiaiou
	@param params A?aoiaiou noiie?iaaiey
*/	
public void add(float ... params){
	float a[] = new float[2];
	for(Float param: params){
		for(int i = 0; i<params.length; i++){
		a[i] = params[i];
		}
		this.result = a[0] + a[1];
	}
}

public void minus(float ... params){
	float a[] = new float[2];
	for(Float param: params){
		for(int i = 0; i<params.length; i++){
		a[i] = params[i];
		}
		this.result = a[0] - a[1];
	}
}

public void mult(float ... params){
	float a[] = new float[2];
	for(Float param: params){
		for(int i = 0; i<params.length; i++){
		a[i] = params[i];
		}
		this.result = a[0] * a[1];
	}
}	
public void div(float ... params){
	float a[] = new float[2];
	for(Float param: params){
		for(int i = 0; i<params.length; i++){
		a[i] = params[i];
		}
		this.result = a[0] / a[1];
	}	
}

public void grade(float ... params){
	float a[] = new float[2];
	for(Float param: params){
		for(int i = 0; i<params.length; i++){
		a[i] = params[i];
		}
		this.result = (float)Math.pow(a[0], a[1]);
	}	
}
/*
	Iieo?eou ?acoeuoao.
	@return ?acoeuoao au?eneaiey.
*/
public float getResult(){
	return this.result;
}
/*
	I?enoeou ?acoeuoao au?eneaiey
*/
public void cleanResult(){
	this.result = 0;
	}
}
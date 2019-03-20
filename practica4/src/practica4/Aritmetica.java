package practica4;

public class Aritmetica {
	
	private float num1;
	private float num2;
	
	public Aritmetica(float n1, float n2){
		num1=n1;
		num2=n2;
	}
	
	public float suma(){
		return num1 +num2;
	
	}
	
	public float resta(){
		return num1- num2;
	
	}
	
	public float multiplicacion(){
		return num1*num2;
	}
	
	public float division(){
		return num1/num2;
	}

}

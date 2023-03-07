package claseinteger1;

public class ClaseInteger1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creacion de un objeto integer usando el segundo constructor
		Integer num1=new Integer("125"); 
		
		//Creacion de un objeto Integer usando el primer constructor 
		Integer num2=new Integer(20); 
		
		//Obtencion del entero que amacena cada objeto Integer, si no se hace, las lineas siguientes causan error al compilar. 
		
		int n1= num1.intValue(); 
		int n2= num2.intValue(); 
		
		System.out.println("Segunda tarea: ");
		
		System.out.println("Suma de " + n1+ " y " +n2+ " vale " + (n1+n2));
		if(n1+n2>130) {
			n1++;
		}else
			n1--; 
		System.out.println(n1);
		
		
	}

}

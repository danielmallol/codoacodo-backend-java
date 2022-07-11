package codo.a.cod0;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in); 
		String msg = "nada";
		
		while(true) {
		
		System.out.println("ingrese nota: ");
		int nota=teclado.nextInt();
		
		switch(nota){
			case 1:
				msg="Tas en el horno, tas"; break;
			case 6: 
				msg="Zafaste, ñato"; break;
			case 10: 
				msg="Groso !!!"; break;
			default: 
				msg="Seguí participando !"; break;
		}
		System.out.println(msg + "\n");
		}
	}

}

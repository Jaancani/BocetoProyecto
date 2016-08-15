import java.util.Scanner;

public class Boceto{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);


		//Menu Inicio
		System.out.println("\t ---MENU---");
		System.out.println("1.Regitrarte \n2.Iniciar Sesion \n3.Salir");
		System.out.print("Ingrese una Opcion: ");
		int menu =  lea.nextInt();

		if (menu==1 || menu==2){

			if(menu==1){
				System.out.print("Ingrese Nombre de Usuario:");
				String us1 = lea.next();
				System.out.print("Ingrese Contraseña: ");
				String co1= lea.next(); 	

			}
			else if (menu==2){
				System.out.print("Ingrese Nombre de Usuario:");
				
				System.out.print("Ingrese Contraseña: ");




			}
		}
		
	}
}
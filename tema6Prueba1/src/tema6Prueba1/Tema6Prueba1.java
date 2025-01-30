//Alejandro Pavón Martínez

package tema6Prueba1;
import java.util.Scanner;
import java.util.Random;
public class Tema6Prueba1 {

	static void imprimirAlumno(Alumno[] arr, int posicion) {
		
		for (Alumno alu:arr) {
		System.out.println("El alumno "+alu.getNombre()+" tiene de nota un "+alu.getNotaFinal()+" sobre 10");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		Random r=new Random();
		Alumno[] daw = new Alumno [10];
		int aprobado=0;
		int i=0;
		
		for (i=0;i<daw.length;i++) {
			
			System.out.print("Introduce el nombre del alumno: ");
			String nombre=teclado.next();
			int nota=r.nextInt(0, 10);
			daw[i]= new Alumno(nombre, nota);
			System.out.println();
		}
		
		imprimirAlumno(daw, i);
		
		for (Alumno alu:daw) {
			if (alu.getNotaFinal()>=5) {
				aprobado++;
			}
		}
		System.out.println("Hay "+aprobado+" alumnos aprobados");
	}

}

class Alumno{
	String nombre;
	int notaFinal;
	
	Alumno(String nombre, int notaFinal) {
		this.nombre = nombre;
		this.notaFinal = notaFinal;
	}

	String getNombre() {
		return nombre;
	}

	int getNotaFinal() {
		return notaFinal;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}
		
}

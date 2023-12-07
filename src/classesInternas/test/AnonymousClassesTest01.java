package classesInternas.test;

class Animal{
	public void walk() {
		System.out.println("Animal walking");
	}
}

public class AnonymousClassesTest01 {

	public static void main(String[] args) {
		// classes que vao existir por um determinado periodo de tempo no codigo e nao podem ser usadas em nenhum outro lugar
		Animal animal = new Animal() { // craicao de subclasse anonima que so vai ser usada nessa referencia
			@Override
			public void walk() {
				System.out.println("Walking in the shadows");
			}
		};
		animal.walk();
	}

}

package classesInternas.test;

public class OuterClassesTest03 {
	private String name = "Alex";
	// classes estaticas aninhadas
	static class Nested{ // nao acessa atributos nao estaticos da classe outer
		void print() {
			System.out.println(new OuterClassesTest03().name); //para acessar um atributo nao estatico
		}
	}
	
	public static void main(String[] args) {
		Nested nested = new Nested();
		nested.print();
	}

}

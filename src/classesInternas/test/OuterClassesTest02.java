package classesInternas.test;

public class OuterClassesTest02 {

	private String name = "Eren";
	
	void print(String param) { // pode ser usado na classe local, mas tambem é final
		String lastName = "Yeager"; // pode ser  utilizado dentro da classe local. Nao pode ser alterado pois é uma variavel final.
		
		class LocalClass { // classe local, fica dentro de um metodo ou bloco de instrucao. modificadores de acesso: final ou abst
			public void printLocal() {
				System.out.println(param);
				System.out.println(name + " " + lastName);
			}
		}
		new LocalClass().printLocal(); // quando o metodo termina perdisse acesso a classe, é preciso inicializa-la diretamente no metodo
	}
	
	public static void main(String[] args) {
		OuterClassesTest02 outer = new OuterClassesTest02();
		outer.print("blablabla");
	}

}

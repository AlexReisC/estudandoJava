package classesInternas.test;

public class OuterClassesTest01 {
	private String name = "Monkey D. Luffy";
	
	class Inner{ // pode declara atributos, tem acesso a atributos e metodos da classe externa
		public void printOuterClassAtribuite() {
			System.out.println(name);
			System.out.println(this);
			System.out.println(OuterClassesTest01.this);
		}
	}
	
	public static void main(String[] args) {
		// para criar um objeto da classe interna é preciso ter um objeto da classe externa
		OuterClassesTest01 outerClass = new OuterClassesTest01();
		Inner inner = outerClass.new Inner(); // criacao do objeto da classe Inner
		Inner inner2 = new OuterClassesTest01().new Inner(); // outra forma
		inner.printOuterClassAtribuite();
		inner2.printOuterClassAtribuite();

	}

}

package exemplos;

public class Programa_Veiculo {

	public static void main(String[] args) {

		Carro c1 = new Carro("Focus", "Ford", 2020, 45000.00, 170);
		System.out.println("Modelo: " + c1.getModelo());
		Carro c2 = new Carro("Golf", "Volks", 2020, 15000.00, 120);
		Carro c3 = new Carro("Fusca", "Volks", 1980, 35000.00, 190);

		Moto m1 = new Moto("CG-150", "Honda", 2022, 8000.00, 300);
		Moto m2 = new Moto("Ninja-1000", "Kawasaki", 2011, 10000.00, 1000);
		Moto m3 = new Moto("Harley", "Harleeey", 1995, 50000.00, 1200);

		Carro[] listaCarros = {c1, c2, c3};
		Moto[] listaMotos = {m1, m2, m3};

		System.out.println();

		System.out.println("Valor antes da depreciação: " + c1.getValor());
		c1.calcularDepreciacao();
		System.out.println("Valor depois da depreciação: " + c1.getValor());
		System.out.println("\n------------------------------------");
		System.out.println("Valor antes da depreciação: " + m1.getValor());
		m1.calcularDepreciacao();
		System.out.println("Valor depois da depreciação: " + m1.getValor());
	    
		/*1- Calcular o valor total dos carros.
		
		double valorTotalCarros = calcularValorTotalCarros(listaCarros);
		System.out.println("O valor total dos carros é de: " + valorTotalCarros);
		
		//2- Informar o modelo do carro com maior potencia.
		identificarCarroMaiorPotencia(listaCarros);
		
		//3- Informar o valor total das motos.
		double valorTotalMotos = calcularValorTotalMotos(listaMotos);
		System.out.println("O valor total das motos é de: " + valorTotalMotos);
		
		//4- Informar o modelo e o fabricante da moto mais antiga.
		identificarMotoMaisAntiga(listaMotos);
		
		//5- Contabilizar o valor de todos os veiculos.
		System.out.println("O valor total de todos os veículos é: " + (valorTotalCarros + valorTotalMotos));
	
	
	}// 1
	private static double calcularValorTotalCarros(Carro[] listaCarros) {
		double acumulador = 0;
		for(int i = 0; i < listaCarros.length; i++) {
			acumulador += listaCarros[i].getValor();
		}
		return acumulador;
	}
	//2
	private static void identificarCarroMaiorPotencia (Carro[] listaCarros) {
		Carro carro = listaCarros[0];
		for(int i = 0; i < listaCarros.length; i++) {
			if(listaCarros[i].getPotenciaHP() > carro.getPotenciaHP()) {
				carro = listaCarros[i];
			}
		}
		System.out.println("O carro com a maior potencia é o: " + carro);
	}
	//3
	private static double calcularValorTotalMotos(Moto[] listaMotos) {
		double acumulador = 0;
		for(int i = 0; i < listaMotos.length; i++) {
			acumulador += listaMotos[i].getValor();
		}
		return acumulador;
	}
	//4
	private static void identificarMotoMaisAntiga (Moto[] listaMotos) {
		Moto moto = listaMotos[0];
		for(int i = 0; i < listaMotos.length; i++) {
			if(listaMotos[i].getAno() > moto.getAno()) {
				moto = listaMotos[i];
			}
		}
		System.out.println("A moto mais antiga é a moto: " + moto);
	}*/
	}
}

import java.time.LocalDate;
import java.util.Scanner;

public class Relatorio {
	
	public static void main(String[] args) {
	
	String nome;
	int anoNasc,ano,genero,idadeResultado,loop=0;
	float altura,peso,imc,pesoIdealM,pesoIdealF;
	LocalDate anoAtual = LocalDate.now();
	Scanner teclado = new Scanner(System.in);
	ano=anoAtual.getYear();
	System.out.println("Digite o nome do seu paciente:");
	nome=teclado.nextLine();
	while (loop<1) {
		System.out.println("Escolha o gênero do seu paciente");
		System.out.println("========================");
		System.out.println("1 - Masculino");
		System.out.println("2 - Feminino");
		System.out.println("========================");
		System.out.println("Digite o número da opção:");
		genero=teclado.nextInt();
		switch(genero) {
		case 1:
			genero=1;
			loop++;
			break;
		case 2:
			genero=2;
			loop++;
			break;
		default:
			System.out.println("Opção inválida...");
			loop=0;
			break;
		}
		System.out.println("Em que ano seu paciente nasceu?");
		anoNasc=teclado.nextInt();
		System.out.println("Digite a altura do seu paciente:");
		altura=teclado.nextFloat();
		System.out.println("Digite o peso do seu paciente:");
		peso=teclado.nextFloat();
		imc=peso/(altura*altura);
		idadeResultado=ano-anoNasc;
		pesoIdealM=72.7f*altura-58;
		pesoIdealF=62.1f*altura-44.7f;
		System.out.println("\nNome do paciente: "+nome);
		if (genero<=1) {
			System.out.println("Gênero: Masculino");
		}else
			System.out.println("Gênero: Feminino");
		System.out.println("Ano de nascimento: "+anoNasc);
		System.out.println("Idade: "+idadeResultado);
		System.out.println("Altura: "+altura+"m");
		System.out.println("Peso: "+peso+"kg");
		if (imc<17) {
			System.out.println("IMC: "+imc+" - Muito abaixo do peso");
		}else if (imc<=18.49) {
			System.out.println("IMC: "+imc+" - Abaixo do peso");
		}else if (imc<=24.99) {
			System.out.println("IMC: "+imc+" - Peso normal");
		}else if (imc<=29.99) {
			System.out.println("IMC: "+imc+" - Acima do peso");
		}else if (imc<=34.99) {
			System.out.println("IMC: "+imc+" - Obesidade I");
		}else if (imc<=39.99) {
			System.out.println("IMC: "+imc+" - Obesidade II (severa)");
		}else 
			System.out.println("IMC: "+imc+" - Obesidade III (mórbida)");
		if (genero<=1) {
			System.out.println("Peso ideal: "+pesoIdealM);
		}else
			System.out.println("Peso ideal: "+pesoIdealF);
	}
	}
}
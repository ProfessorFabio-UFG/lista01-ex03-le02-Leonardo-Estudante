package models;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CadastroMorador {
	Scanner sc = new Scanner(System.in);
	List<Morador> moradorList = new ArrayList<>();

	public void cadastro() {
		while (true) {
			System.out.println("Digite o nome do Morador: ");
			String nome = sc.nextLine();

			System.out.println("Digite o cpf do Morador: ");
			String cpf = sc.nextLine();

			System.out.println("Digite o celular do Morador: ");
			String celular = sc.nextLine();

			System.out.println("Digite a data de nascimento do Morador: ");
			String data = sc.nextLine();

			System.out.println("Digite o sexo do Morador: ");
			String sexo = sc.nextLine();

			System.out.println("Digite o bloco do Morador: ");
			int bloco = sc.nextInt();

			System.out.println("Digite o apartamento do Morador: ");
			int apt = sc.nextInt();
			sc.nextLine();

			Morador morador = new Morador(nome, cpf, celular, data, sexo, bloco, apt);
			moradorList.add(morador);

			System.out.println("Deseja continuar o cadastro? (S/N): ");
			String confirm = sc.nextLine();
			if (confirm.equalsIgnoreCase("N")) {
				break;
			}
		}
		sc.close();
	}
	
	public void exibirMoradores() {
		for(Morador m: moradorList) {
			if(m != null) {
				System.out.println(m);
			}
		}
	}

}

package models;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CadastroMorador {
	private List<Morador> moradorList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void cadastro() {
		while (true) {
			System.out.println("Digite o nome do Morador: ");
			String nome = sc.nextLine();

			System.out.println("Digite o CPF do Morador: ");
			String cpf = sc.nextLine();

			System.out.println("Digite o celular do Morador: ");
			String celular = sc.nextLine();

			System.out.println("Digite a data de nascimento do Morador (dd/mm/aaaa): ");
			String data = sc.nextLine();

			System.out.println("Digite o sexo do Morador: ");
			String sexo = sc.nextLine();

			System.out.println("Digite o bloco do Morador: ");
			int bloco = Integer.parseInt(sc.nextLine());

			System.out.println("Digite o apartamento do Morador: ");
			int apt = Integer.parseInt(sc.nextLine());

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
		if (moradorList.isEmpty()) {
			System.out.println("Nenhum morador cadastrado.");
		} else {
			System.out.println("\n--- Lista de Moradores Cadastrados ---");
			for (Morador m : moradorList) {
				System.out.println(m);
			}
		}
	}
}

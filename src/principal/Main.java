package principal;

import models.CadastroMorador;

public class Main {
	public static void main(String[] args) {
		CadastroMorador c = new CadastroMorador();

		c.cadastro();
		c.exibirMoradores();
	}
}

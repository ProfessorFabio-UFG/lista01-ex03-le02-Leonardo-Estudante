package models;

public class Morador {
	private String nome;
	private String cpf;
	private String celular;
	private String dataNascimento;
	private String sexo;
	private int bloco;
	private int apartamento;
	private static int codigoSequencial;
	private int codigo;
	
	public Morador(String nome, String cpf, String celular, String dataNascimento, String sexo, int bloco,int apartamento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.celular = celular;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.bloco = bloco;
		this.apartamento = apartamento;
		this.codigo = ++codigoSequencial;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getBloco() {
		return bloco;
	}

	public void setBloco(int bloco) {
		this.bloco = bloco;
	}

	public int getApartamento() {
		return apartamento;
	}

	public void setApartamento(int apartamento) {
		this.apartamento = apartamento;
	}

	@Override
	public String toString() {
		return "Moradores [nome=" + nome + ", cpf=" + cpf + ", celular=" + celular + ", dataNascimento="
				+ dataNascimento + ", sexo=" + sexo + ", bloco=" + bloco + ", apartamento=" + apartamento + ", codigoSequencial=" + codigo;
	}
	
}


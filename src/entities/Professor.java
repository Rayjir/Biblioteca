package entities;

public class Professor {
	private int matricula;
	private String nome;
	private String endereco;
	private String setor;
	private String data;

	void cadastroProfessor() {
		//<matrícula>;<nome>;<endereço>;<data-ingresso>;<setor>
		System.out.println();
	}
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return matricula + "," + nome + "," + endereco + "," + setor + "," + data;
	}

}

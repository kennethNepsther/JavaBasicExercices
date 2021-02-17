package it.nepsther.modelo;

public class Aluno {

	private long codigo;
	private String nome;
	

	public Aluno(long codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		
	}

	public Aluno(long codigo) {
		this.codigo= codigo;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
//==========com ou sem=====================
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codigo ^ (codigo >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}



}

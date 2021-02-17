package it.nepsther;

import java.util.HashSet;
import java.util.Set;

import it.nepsther.modelo.Aluno;

public class Teste {

	public static void main(String[] args) {
		Set<Aluno> alunos = recuperarAlunos();

		Aluno pesquisa = new Aluno(2L);
		
		boolean alunoExiste = alunos.contains(pesquisa);
		System.out.println("existe este aluno?: "+alunoExiste);

	}

	public static Set<Aluno> recuperarAlunos() {

		Aluno landinho = new Aluno(1L, "Lando Luzolo"); 
		Aluno estelvio = new Aluno(2L, "Estelvio Luzolo"); 
		Aluno junior = new Aluno(3L, "Junior Luzolo"); 

		Set<Aluno> alunos = new HashSet<Aluno>();
		alunos.add(landinho);
		alunos.add(estelvio);
		alunos.add(junior);
		return alunos;

	}
}

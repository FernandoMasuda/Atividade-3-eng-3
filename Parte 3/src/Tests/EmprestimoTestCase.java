package Tests.maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;
import java.text.ParseException;
import java.util.Date;

import org.junit.jupiter.api.Test;

class EmprestimoTestCase {

	@Test
	void test1() throws ParseException {
		int[] codigos= {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		String aluno = "2";
		int num = 4;
		for(int i=0;i<num;i++)
		{
			codigos[i]=i;
		}
		 
		Controle c = new Controle();
		assertEquals(true, c.emprestar(aluno, codigos, num));
	}
	
	@Test
	void test2() throws ParseException {
		int[] codigos= {2,4,2,4};
		String aluno = "2";
		int num = 4;
		 
		Controle c = new Controle();
		assertEquals(true, c.emprestar(aluno, codigos, num));
	}
	
	@Test
	void test3() throws ParseException {
		int[] codigos= {2,4,2,4};
		String aluno = "4";
		int num = 4;
		 
		Controle c = new Controle();
		assertEquals(false, c.emprestar(aluno, codigos, num));
	}
	
	@Test
	void test4() throws ParseException {
		int[] codigos= {2,4,2,4};
		String aluno = "";
		int num = 4;
		 
		Controle c = new Controle();
		assertEquals(false, c.emprestar(aluno, codigos, num));
	}
	
	@Test
	void test5() throws ParseException {
		int[] codigos= {3};
		String aluno = "2";
		int num = 1;
		 
		Controle c = new Controle();
		assertEquals(false, c.emprestar(aluno, codigos, num));
	}

	@Test
	void outrasFuncoes() throws ParseException {
		Date data = new Date();
		Emprestimo e = new Emprestimo();
		
		e.setDataEmprestimo(data);
		e.getDataEmprestimo();
		
		Livro l1 = new Livro(1);
		Livro l2 = new Livro(2);
		Item i1 = new Item(l1);
		
		i1.setDataDevolucao(data);
		i1.getDataDevolucao();
		i1.setLivro(l2);
		i1.getLivro();
		
		l2.titulo.setPrazo(3);
		
		Aluno a = new Aluno("12");
		a.getNome();
		a.setNome(null);
	}
}

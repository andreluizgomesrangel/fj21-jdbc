package br.com.caelum.jdbc.teste;
import java.util.*;
import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Marcos Gabriel");
		contato.setEmail("andreluiz.grs@gmail.com");
		contato.setEndereco("R. Colibri 28");
		contato.setDataNascimento(Calendar.getInstance());
		 
		// grave nessa conexão!!!
		ContatoDao dao = new ContatoDao();
		 
		// método elegante
		//dao.adiciona(contato);
		//dao.busca();
		 
		List<Contato> contatos = dao.getLista();
		/*for (Contato contato1 : contatos) {
			 contato1.mostrar();
			}*/
		
		
		Contato c = contatos.get( contatos.size()-1 );
		//c.setEmail("newemail.com");
		//c.setEndereco("street");
		//c.setNome("new name");
		//dao.altera(c);
		//dao.adiciona(c);
		dao.remove(c);
		
		
		
		
	}
	
}

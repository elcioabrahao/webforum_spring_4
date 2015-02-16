package br.com.qpainformatica.webforum;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
public class RegisterController {
	
	private final AtomicLong counter = new AtomicLong();
	
	
	@RequestMapping("/Registrar")
	public ModelAndView registraUsuario(@RequestParam(value="name", defaultValue="World") String nome){

		String resposta = "falhou";
		Connection conn = DatabaseConnection.getConnection();
		
		if(nome !=null){
			
			Cliente cliente = new Cliente();
			cliente.setNome(nome);
			ClienteDao cd = new ClienteDao();
			try {
				cd.create(conn, cliente);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			resposta = ""+cliente.getId();
			
			
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ModelAndView("resultado", "message", resposta);
	}

}

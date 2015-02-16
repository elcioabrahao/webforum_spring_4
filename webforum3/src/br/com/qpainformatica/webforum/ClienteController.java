package br.com.qpainformatica.webforum;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

@RestController
public class ClienteController {
	
private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/GetClientes")
	public ModelAndView retornaClientes(@RequestParam(value="id", defaultValue="falhou") String id){
		
		String resposta = "falhou";
		Connection conn = DatabaseConnection.getConnection();
		List<Cliente> lista;
		
		if(id !=null){
			
			Gson gson = new Gson();
			ClienteDao cd = new ClienteDao();
			try {
				resposta=gson.toJson(cd.loadAllFromId(conn, id));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(Exception e){
				e.printStackTrace();
			}

			
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

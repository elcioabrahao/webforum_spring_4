package br.com.qpainformatica.webforum;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

@RestController
public class PostarController {
	
	private final AtomicLong counter = new AtomicLong();
	
@RequestMapping("/Postar")
public ModelAndView postarMensagem(@RequestParam(value="m", defaultValue="World") String men){
	
	String resposta = "falhou";
	
	Gson gson = new Gson();
	Connection conn = DatabaseConnection.getConnection();
	
	if(men != null){
		Mensagem mensagem = gson.fromJson(men, Mensagem.class);
		MensagemDao md = new MensagemDao();
		try {
			md.create(conn, mensagem);
			resposta = "ok";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resposta = "falhou";
		}
		
		
	}
	
	
	return new ModelAndView("resultado", "message", resposta);
}

}

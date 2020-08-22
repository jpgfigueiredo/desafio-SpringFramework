package br.com.itau.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.model.Lancamento;
import br.com.itau.service.LancamentoService;

@RestController
@RequestMapping("lancamentos")
public class LancamentosResource {
	
	@Autowired
	private LancamentoService lancamentoService;
	
	
	@GetMapping
	public List<Lancamento> listar(){		
		return lancamentoService.buscar();
	}

}

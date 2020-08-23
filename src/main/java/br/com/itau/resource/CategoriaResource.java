package br.com.itau.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.model.Categoria;
import br.com.itau.service.CategoriaService;

@RestController
@RequestMapping("categorias")
public class CategoriaResource {

	@Autowired	
	private CategoriaService categoriaService;
	
	@GetMapping
	public List<Categoria> listar(){		
		return categoriaService.buscarCategoria();
	}
	
/*	@GetMapping("/{id}")
	public Lancamento buscarPeloId(@PathVariable Integer id) {
		 return lancamentoService.buscarId(id);
	}
	
	@GetMapping("/categoria/{codigo}")
	public List<Lancamento> buscarLancamentoPorCategoria(@PathVariable Integer codigo) {
		 return lancamentoService.buscarLancamentoByCategoria(codigo);
	}
	*/
}

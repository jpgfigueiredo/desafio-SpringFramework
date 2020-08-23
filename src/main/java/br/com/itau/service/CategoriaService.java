package br.com.itau.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.itau.model.Categoria;

@Service
public class CategoriaService {

	private static String URL = "https://desafio-it-server.herokuapp.com/categorias";
	
	//Listar todas categorias
	public List<Categoria> buscarCategoria() {
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<List<Categoria>> response = restTemplate.exchange(URL, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Categoria>>() {
				});
		List<Categoria> categorias = response.getBody();

		return categorias;
	}	
	
	//Listar categoria por Id
	public Categoria buscarId(Integer id) {
		RestTemplate restTemplate = new RestTemplate();

		Categoria categoria = restTemplate.getForObject(URL + "/" + id, Categoria.class);

		return categoria;
	}


}

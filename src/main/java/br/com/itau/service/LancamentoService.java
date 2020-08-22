package br.com.itau.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.itau.model.Lancamento;

@Service
public class LancamentoService {

	private final static String URL = "https://desafio-it-server.herokuapp.com/lancamentos";
	
	public List<Lancamento> buscar(){
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<List<Lancamento>> rateResponse =
		        restTemplate.exchange(URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<Lancamento>>() {});
		List<Lancamento> lancamentos = rateResponse.getBody();		
		   		
		//Retorna um lançamento ordenado do mês atual
		return lancamentos.stream().sorted( (lanc1, lanc2) ->  lanc2.getMesLancamento().compareTo(lanc1.getMesLancamento())).collect(Collectors.toList());
	}
	
	public Lancamento buscarId(Integer id){
		RestTemplate restTemplate = new RestTemplate();
		
		Lancamento lancamento = restTemplate.getForObject(URL + "/" + id, Lancamento.class);

		return lancamento;
	}
}
package cidaderesource.controllers;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import cidaderesource.model.beans.Cidade;
import cidaderesource.model.repository.CidadeRepository;

@RestController
@RequestMapping ("/cidades")
public class CidadeResource {
	
	@Autowired
	private CidadeRepository cidadeRep;
	
	@GetMapping ("/lista")
	public List<Cidade> verCidade (){
		return cidadeRep.findAll();
	}
	
	@PostMapping ("/salvar")

	public ResponseEntity<Cidade> salvar (@RequestBody Cidade cidade, 
								HttpServletResponse response) {
	
		Cidade c = cidadeRep.save(cidade);
		URI uri = ServletUriComponentsBuilder.
				fromCurrentServletMapping().
				path("/{id}").
				buildAndExpand(c.getId()).toUri();
		return ResponseEntity.created(uri).body(c);
	}
	
	@GetMapping ("/busca")
	public Cidade verCidadela (@PathVariable Long latitude) {
		return cidadeRep.findById(latitude).get();
	}
	public Cidade verCidadelo (@PathVariable Long longitude) {
		return cidadeRep.findById(longitude).get();
	}

}

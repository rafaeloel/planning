package br.com.totvsplanning.planning.controller;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.totvsplanning.planning.controller.dto.SalasDto;
import br.com.totvsplanning.planning.controller.form.SalaForm;
import br.com.totvsplanning.planning.model.Salas;
import br.com.totvsplanning.planning.repository.SalaRepository;

@RestController
@RequestMapping("/sala")
public class SalasController {

	@Autowired
	private SalaRepository salaRepository;

	@GetMapping
	public List<SalasDto> lista() {
		// Salas sala = new Salas("Primeira Sala", 2);

		List<Salas> sala = salaRepository.findAll();
		return SalasDto.converter(sala);
	}

	@PostMapping
	public ResponseEntity<SalasDto> criarSala(@RequestBody @Valid SalaForm salaForm, UriComponentsBuilder uriBuilder) {
		Salas sala = salaForm.converter();
		salaRepository.save(sala);

		URI uri = uriBuilder.path("/sala/{id}").buildAndExpand(sala.getId()).toUri();

		return ResponseEntity.created(uri).body(new SalasDto(sala));
	}

	@GetMapping("/{id}")
	public SalasDto abrirSala(@PathVariable Long id) {

		Salas sala = salaRepository.getOne(id);

		return new SalasDto(sala);

	}

}

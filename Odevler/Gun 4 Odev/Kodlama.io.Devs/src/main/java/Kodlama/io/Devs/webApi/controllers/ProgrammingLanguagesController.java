package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestControllerAdvice
@RequestMapping("/api/languages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService _programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		_programmingLanguageService = programmingLanguageService;
	}

	@GetMapping("/getAll")
	public List<ProgrammingLanguage> getAll() {
		return _programmingLanguageService.getAll();
	}

	@GetMapping("/getbyid")
	public ProgrammingLanguage getById(@RequestParam int id) {
		return _programmingLanguageService.getById(id);
	}

	@PostMapping("/add")
	public void add(@RequestBody ProgrammingLanguage programmingLanguage) {
		_programmingLanguageService.add(programmingLanguage);
	}

	@PostMapping("/update")
	public void update(@RequestBody ProgrammingLanguage programmingLanguage) {
		_programmingLanguageService.update(programmingLanguage);
	}

	@PostMapping("/delete")
	public void delete(@RequestParam int id) {
		_programmingLanguageService.delete(id);
	}
}

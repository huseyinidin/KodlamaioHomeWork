package kodlamaio.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Devs.business.abstracts.LanguageService;
import kodlamaio.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {

	private LanguageService languageService;

	@Autowired
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@GetMapping("/getAll")
	public List<Language> getAll() {
		return languageService.getAll();
	}

	@PostMapping("/add")
	public void add(Language language) throws Exception {
		languageService.add(language);
	}

	@DeleteMapping("/delete")
	public void delete(Language language) {
		languageService.delete(language);
	}

	@PutMapping("/update")
	public void update(Language language) {
		languageService.update(language);
	}

	@GetMapping("/getById/{id}")
	public void getById(int id) {
		languageService.getById(id);
	}

}

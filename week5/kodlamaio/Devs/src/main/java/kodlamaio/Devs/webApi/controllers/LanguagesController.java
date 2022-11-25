package kodlamaio.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Devs.business.abstracts.LanguageService;
import kodlamaio.Devs.business.requests.language.CreateLanguagesRequest;
import kodlamaio.Devs.business.requests.language.DeleteLanguagesRequest;
import kodlamaio.Devs.business.requests.language.UpdateLanguagesRequest;
import kodlamaio.Devs.business.responses.GetAllLanguagesResponse;
import kodlamaio.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public List<GetAllLanguagesResponse> getAll() {
		return languageService.getAll();
	}

	@PostMapping("/add")
	public void add(CreateLanguagesRequest createLanguagesRequest) throws Exception {
		languageService.add(createLanguagesRequest);
	}

	@DeleteMapping("/delete")
	public void delete(DeleteLanguagesRequest deleteLanguagesRequest) {
		languageService.delete(deleteLanguagesRequest);
	}

	@PutMapping("/update")
	public void update(UpdateLanguagesRequest updateLanguagesRequest) {
		languageService.update(updateLanguagesRequest);
	}

	@GetMapping("/getById/{id}")
	public Language getById(@PathVariable("id") int id) {
		return languageService.getById(id);
	}

}

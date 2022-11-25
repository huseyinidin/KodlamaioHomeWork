package kodlamaio.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Devs.business.abstracts.TechnologyService;
import kodlamaio.Devs.business.requests.technology.CreateTechnologiesRequest;
import kodlamaio.Devs.business.requests.technology.DeleteTechnologiesRequest;
import kodlamaio.Devs.business.requests.technology.UpdateTechnologiesRequest;
import kodlamaio.Devs.business.responses.GetAllTechnologiesResponse;

@RestController
@RequestMapping("/api/technologies")
public class TechnologiesController {

	private TechnologyService technologyService;

	@Autowired
	public TechnologiesController(TechnologyService technologyService) {
		this.technologyService = technologyService;
	}

	@GetMapping("/getall")
	public List<GetAllTechnologiesResponse> getAll() {
		return technologyService.getAll();
	}

	@PostMapping("/add")
	public void add(@RequestBody CreateTechnologiesRequest createTechnologiesRequest) throws Exception {
		technologyService.add(createTechnologiesRequest);
	}

	@DeleteMapping("/delete")
	public void delete(DeleteTechnologiesRequest deleteTechnologiesRequest) {
		technologyService.delete(deleteTechnologiesRequest);
	}

	@PutMapping("/update")
	public void update(UpdateTechnologiesRequest updateTechnologiesRequest) {
		technologyService.update(updateTechnologiesRequest);
	}

	@GetMapping("/getById/{id}")
	public GetAllTechnologiesResponse getById(@PathVariable("id") int id) {
		return technologyService.getById(id);
	}

}

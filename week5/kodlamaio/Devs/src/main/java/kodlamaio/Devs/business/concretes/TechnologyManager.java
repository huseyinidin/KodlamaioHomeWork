package kodlamaio.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Devs.business.abstracts.LanguageService;
import kodlamaio.Devs.business.abstracts.TechnologyService;
import kodlamaio.Devs.business.requests.technology.CreateTechnologiesRequest;
import kodlamaio.Devs.business.requests.technology.DeleteTechnologiesRequest;
import kodlamaio.Devs.business.requests.technology.UpdateTechnologiesRequest;
import kodlamaio.Devs.business.responses.GetAllTechnologiesResponse;
import kodlamaio.Devs.dataAccess.abstracts.TechnologyRepository;
import kodlamaio.Devs.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {

	private TechnologyRepository technologyRepository;
	private LanguageService languageService;

	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository, LanguageService languageService) {
		this.technologyRepository = technologyRepository;
		this.languageService = languageService;
	}

	@Override
	public List<GetAllTechnologiesResponse> getAll() {

		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologiesResponse> technologiesResponse = new ArrayList<GetAllTechnologiesResponse>();
		for (Technology technology : technologies) {
			GetAllTechnologiesResponse responseItem = new GetAllTechnologiesResponse();
			responseItem.setId(technology.getId());
			responseItem.setName(technology.getTechnologyName());
			responseItem.setLanguageId(technology.getLanguage().getId());
			responseItem.setLanguageName(technology.getLanguage().getLanguageName());
			technologiesResponse.add(responseItem);
		}

		return technologiesResponse;
	}

	@Override
	public void add(CreateTechnologiesRequest createTechnologiesRequest) throws Exception {

		if (createTechnologiesRequest.getName() == "") {
			throw new Exception("Technology framework can't be null");
		}
		for (Technology technology1 : technologyRepository.findAll()) {
			if (technology1.getTechnologyName().equals(createTechnologiesRequest.getName())) {
				throw new Exception("This technology name already exists.");
			}
		}
		Technology technology = new Technology();
		technology.setTechnologyName(createTechnologiesRequest.getName());
		technology.setLanguage(languageService.getById(createTechnologiesRequest.getLanguageId()));
		this.technologyRepository.save(technology);
	}

	@Override
	public void delete(DeleteTechnologiesRequest deleteTechnologiesRequest) {

		this.technologyRepository.deleteById(deleteTechnologiesRequest.getId());

	}

	@Override
	public void update(UpdateTechnologiesRequest updateTechnologiesRequest) {

		Technology technology = technologyRepository.findById(updateTechnologiesRequest.getId()).get();
		technology.setTechnologyName(updateTechnologiesRequest.getName());
		this.technologyRepository.save(technology);

	}

	@Override
	public GetAllTechnologiesResponse getById(int id) {

		GetAllTechnologiesResponse technology = new GetAllTechnologiesResponse();
		Technology tech = technologyRepository.findById(id).get();
		technology.setId(tech.getId());
		technology.setName(tech.getTechnologyName());
		technology.setLanguageId(tech.getLanguage().getId());
		technology.setLanguageName(tech.getLanguage().getLanguageName());

		return technology;
	}

}

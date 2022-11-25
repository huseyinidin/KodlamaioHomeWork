package kodlamaio.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Devs.business.abstracts.LanguageService;
import kodlamaio.Devs.business.requests.language.CreateLanguagesRequest;
import kodlamaio.Devs.business.requests.language.DeleteLanguagesRequest;
import kodlamaio.Devs.business.requests.language.UpdateLanguagesRequest;
import kodlamaio.Devs.business.responses.GetAllLanguagesResponse;
import kodlamaio.Devs.dataAccess.abstracts.LanguageRepository;
import kodlamaio.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllLanguagesResponse> getAll() {

		List<Language> languages = languageRepository.findAll();
		List<GetAllLanguagesResponse> languagesResponse = new ArrayList<GetAllLanguagesResponse>();
		for (Language language : languages) {
			GetAllLanguagesResponse responseItem = new GetAllLanguagesResponse();
			responseItem.setId(language.getId());
			responseItem.setName(language.getLanguageName());
			languagesResponse.add(responseItem);
		}
		return languagesResponse;
	}

	@Override
	public void add(CreateLanguagesRequest createLanguagesRequest) throws Exception {

		if (createLanguagesRequest.getName() == "") {
			throw new Exception("Programming language can't be null");
		}
		for (Language language1 : languageRepository.findAll()) {
			if (language1.getLanguageName().equals(createLanguagesRequest.getName())) {
				throw new Exception("This programing name already exists.");
			}
		}
		Language language = new Language();
		language.setLanguageName(createLanguagesRequest.getName());
		this.languageRepository.save(language);
	}

	@Override
	public void delete(DeleteLanguagesRequest deleteLanguagesRequest) {

		this.languageRepository.deleteById(deleteLanguagesRequest.getId());
	}

	@Override
	public void update(UpdateLanguagesRequest updateLanguagesRequest) {

		Language language = new Language();
		language.setId(updateLanguagesRequest.getId());
		language.setLanguageName(updateLanguagesRequest.getName());
		this.languageRepository.save(language);
	}

	@Override
	public Language getById(int id) {
		return languageRepository.findById(id).get();
	}
}

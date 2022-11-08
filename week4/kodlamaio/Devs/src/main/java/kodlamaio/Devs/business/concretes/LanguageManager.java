package kodlamaio.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.Devs.business.abstracts.LanguageService;
import kodlamaio.Devs.dataAccess.abstracts.LanguageRepository;
import kodlamaio.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepositoryf;

	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public void add(Language language) throws Exception {
		if (language.getCourseName() == ("")) {
			throw new Exception("Programming language can't be null");
		}
		for (Language programingLanguage : languageRepository.getAll()) {
			if (programingLanguage.getCourseName().equals(language.getCourseName())) {
				throw new Exception("This programing name already exists.");
			}
		}
		languageRepository.add(language);
	}

	@Override
	public void delete(Language language) {
		for (Language programingLanguage : languageRepository.getAll()) {
			if (programingLanguage.getId() == language.getId()) {
				programingLanguage.getCourseName().equals(language.getCourseName());
			}
			languageRepository.delete(language);
		}
	}

	@Override
	public void update(Language language) {

		for (Language programingLanguage : languageRepository.getAll()) {
			if (programingLanguage.getId() == language.getId()) {
				programingLanguage.setCourseName(language.getCourseName());
			}
		}
		languageRepository.update(language);
	}

	@Override
	public Language getById(int id) {

		for (Language programingLanguage : languageRepository.getAll()) {
			if (programingLanguage.getId() == id) {
				return languageRepository.getById(id);
			}
		}
		return languageRepository.getById(id);
	}
}

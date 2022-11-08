package kodlamaio.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlamaio.Devs.dataAccess.abstracts.LanguageRepository;
import kodlamaio.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;

	public InMemoryLanguageRepository() {

		languages = new ArrayList<Language>();
		languages.add(new Language(1, "C#"));
		languages.add(new Language(2, "JAVA"));
		languages.add(new Language(3, "PYTHON"));

	}

	@Override
	public List<Language> getAll() {
		
		return languages;
	}

	@Override
	public void add(Language language) {

		languages.add(language);

	}

	@Override
	public void delete(Language language) {

		languages.remove(language.getId());

	}

	@Override
	public void update(Language language) {

	}

	@Override
	public Language getById(int id) {

		return languages.get(id);
	}

}

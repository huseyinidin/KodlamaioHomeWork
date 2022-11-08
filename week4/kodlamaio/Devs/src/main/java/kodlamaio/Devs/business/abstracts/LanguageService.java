package kodlamaio.Devs.business.abstracts;

import java.util.List;

import kodlamaio.Devs.entities.concretes.Language;

public interface LanguageService {

	List<Language> getAll();

	void add(Language language) throws Exception;

	void delete(Language language);

	void update(Language language);

	Language getById(int id);
}

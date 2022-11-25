package kodlamaio.Devs.business.abstracts;

import java.util.List;

import kodlamaio.Devs.business.requests.language.CreateLanguagesRequest;
import kodlamaio.Devs.business.requests.language.DeleteLanguagesRequest;
import kodlamaio.Devs.business.requests.language.UpdateLanguagesRequest;
import kodlamaio.Devs.business.responses.GetAllLanguagesResponse;
import kodlamaio.Devs.entities.concretes.Language;

public interface LanguageService {

	List<GetAllLanguagesResponse> getAll();

	void add(CreateLanguagesRequest createLanguagesRequest) throws Exception;

	void delete(DeleteLanguagesRequest deleteLanguagesRequest);

	void update(UpdateLanguagesRequest updateLanguagesRequest);

	Language getById(int id);
}

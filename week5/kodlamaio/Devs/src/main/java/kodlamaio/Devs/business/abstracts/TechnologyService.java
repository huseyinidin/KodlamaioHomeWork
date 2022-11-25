package kodlamaio.Devs.business.abstracts;

import java.util.List;

import kodlamaio.Devs.business.requests.technology.CreateTechnologiesRequest;
import kodlamaio.Devs.business.requests.technology.DeleteTechnologiesRequest;
import kodlamaio.Devs.business.requests.technology.UpdateTechnologiesRequest;
import kodlamaio.Devs.business.responses.GetAllTechnologiesResponse;

public interface TechnologyService {

	List<GetAllTechnologiesResponse> getAll();

	void add(CreateTechnologiesRequest createTechnologiesRequest) throws Exception;

	void delete(DeleteTechnologiesRequest deleteTechnologiesRequest);

	void update(UpdateTechnologiesRequest updateTechnologiesRequest);

	GetAllTechnologiesResponse getById(int id);

}

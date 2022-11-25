package kodlamaio.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.Devs.entities.concretes.Technology;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology, Integer> {

}

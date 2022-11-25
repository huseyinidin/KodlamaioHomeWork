package kodlamaio.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.Devs.entities.concretes.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer> {

}

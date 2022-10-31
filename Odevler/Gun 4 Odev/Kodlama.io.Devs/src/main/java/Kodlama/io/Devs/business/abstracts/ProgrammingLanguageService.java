package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();

	ProgrammingLanguage getById(int id);

	void add(ProgrammingLanguage programmingLanguage);

	void delete(int id);

	void update(ProgrammingLanguage programmingLanguage);
}

package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.dataAcces.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository _programmingLanguageRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		_programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return _programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return _programmingLanguageRepository.getById(id);
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		if (checkIfProgrammingLanguageNameIsExist(programmingLanguage)
				&& checkIfProgrammingLanguageIdIsExist(programmingLanguage.getId())
				&& programmingLanguageNameCannotBeEmpty(programmingLanguage.getName())) {
			_programmingLanguageRepository.add(programmingLanguage);
		}
	}

	@Override
	public void delete(int id) {
		_programmingLanguageRepository.delete(id);
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		if (checkIfProgrammingLanguageNameIsExist(programmingLanguage)
				&& checkIfProgrammingLanguageIdIsExist(programmingLanguage.getId())
				&& programmingLanguageNameCannotBeEmpty(programmingLanguage.getName())) {
			_programmingLanguageRepository.update(programmingLanguage);
		}
	}

	
	// B R
	public boolean checkIfProgrammingLanguageNameIsExist(ProgrammingLanguage programmingLanguage) {
		for (ProgrammingLanguage list : getAll()) {
			if (list.getName().equals(programmingLanguage.getName())) {
				return false;
			}
		}
		return true;
	}

	public boolean checkIfProgrammingLanguageIdIsExist(int id) {
		for (ProgrammingLanguage list : getAll()) {
			if (list.getId() == id) {
				return false;
			}
		}
		return true;
	}

	public boolean programmingLanguageNameCannotBeEmpty(String name) {
		if (name.isEmpty()) {
			return false;
		}
		return true;
	}

}

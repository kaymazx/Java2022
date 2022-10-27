package kodlama.io.rentACar.buniess.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.buniess.abstracts.BrandService;
import kodlama.io.rentACar.dataAcces.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service //bu sinif bir business nesnesidir
public class BrandManager implements BrandService{
	private BrandRepository brandRepository;
	
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}


	@Override
	public List<Brand> getAll() {
		//is kurallari
		
		
		return brandRepository.getAll();
	}
	
}

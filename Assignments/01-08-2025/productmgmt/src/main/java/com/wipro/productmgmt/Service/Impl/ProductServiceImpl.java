package com.wipro.productmgmt.Service.Impl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.wipro.productmgmt.Entity.Prod;
import com.wipro.productmgmt.Service.ProductService;
import com.wipro.productmgmt.repo.ProductRepo;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepo PR;
	
	@Override
	public  void save(Prod product) {
		PR.save(product);
	}

	@Override
	public List<Prod> findAll() {
	 
		return PR.findAll();
	}

	@Override
	public Prod findById(int id) {
		Optional<Prod> product=PR.findById(id);
		if(!product.isEmpty())
		{
			return product.get();
		}
		return null;
	}

	@Override
	public void deleteById(int id) {
		 
		PR.deleteById(id);
	}
}

package com.Lavender.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import com.Lavender.demo.Model.LavenderModel;
import com.Lavender.demo.repository.LavenderRepository;


@RestController
@Service
public class LavenderService {
	@Autowired
    LavenderRepository lrepo;
	public List<LavenderModel>getAll()
	{
		List<LavenderModel>obj=lrepo.findAll();
		return obj;
		
	}
	public LavenderModel addvalue(LavenderModel itemid)
	{
		return lrepo.save(itemid);
		
	}
	public LavenderModel update(LavenderModel itemid) {
		
		return lrepo.save(itemid);
	}
	public String deleteByRequestParamId(int itemid)
	{
		lrepo.deleteById(itemid);
		return "deleted";
	}
	public LavenderModel getdetailsById(int itemid)
	{
		return lrepo.findById(itemid).orElse(null);
	}
	
	public List<LavenderModel>sortDetails(String id)
	{
		//return lrepo.findAll(Sort.by(id));
		return lrepo.findAll(Sort.by(Direction.DESC,id));
	}
	public Page<LavenderModel>paging( int offset,int pagesize)
	{
		Pageable paging=PageRequest.of(offset, pagesize) ;
		Page<LavenderModel>model=lrepo.findAll(paging);
		return model;
	}
	public List<LavenderModel> pagingsorting(int offset,int pagesize,String name)
	{
		Pageable paging=PageRequest.of(offset, pagesize).withSort(Sort.by(name));
		Page<LavenderModel>data=lrepo.findAll(paging);
		return data.getContent();
		
	}
	public List<LavenderModel>fetchItemsByBrandnamePrefix(String prefix)
	{
		return lrepo.findByBrandnameStartingWith(prefix);
	}
	public List<LavenderModel>fetchItemsByBrandnameSuffix(String suffix)
	{
		return lrepo.findByBrandnameEndingWith(suffix);
	}
	public List<LavenderModel>fetchItemsBySize(int size)
	{
		return lrepo.findBySize(size);
	}
	
	

}

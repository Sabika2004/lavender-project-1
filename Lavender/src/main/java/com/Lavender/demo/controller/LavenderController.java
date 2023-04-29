package com.Lavender.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Lavender.demo.Model.LavenderModel;
import com.Lavender.demo.service.LavenderService;




@RestController
public class LavenderController {
@Autowired

LavenderService lser;

@GetMapping("/getlav")
	public List<LavenderModel>getAll()
	{
		List<LavenderModel>obj=lser.getAll();
		return obj;
	}
    @PostMapping("/postlav")
    public String addvalue(@RequestBody LavenderModel itemid)
    {
   	 lser.addvalue(itemid);
   	 return "added";
    }
    @PutMapping("/putlav")
    public String  update(@RequestBody LavenderModel itemid)
    {
   	 lser.update(itemid);
   	 return "updated";
    }
   
    @DeleteMapping("/deletelav")
	public String delete(@RequestParam("itemid") int itemid)
    {
			
			return lser.deleteByRequestParamId(itemid);
	}
    @GetMapping(value="/getlav/{itemid}")
    public LavenderModel get(@PathVariable int itemid)
    {
   	return lser.getdetailsById(itemid);
   	 
    }
    @GetMapping(value="/sortlav/{field}")
    
    public List<LavenderModel>sorting(@PathVariable String field)
    {
   	 return lser.sortDetails(field);
    }
    @GetMapping(value="/pagelav/{offset}/{pagesize}")
    public Page<LavenderModel>paging(@PathVariable int offset,@PathVariable int pagesize)
    {
   	 return lser.paging(offset, pagesize);
    }
    @GetMapping("/pagingsorting/{offset}/{pagesize}/{name}")
	public List<LavenderModel> pagingsorting(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String name)
	{
		return lser.pagingsorting(offset, pagesize,name);
	}
    @GetMapping("/fetchItemsByBrandNamePrefix")
    public List<LavenderModel>fetchItemsByBrandNamePrefix(@RequestParam String prefix)
    {
    	return lser.fetchItemsByBrandnamePrefix(prefix);
    	
    }
    @GetMapping("/fetchItemsByBrandNameSuffix")
    public List<LavenderModel>fetchItemsByBrandnameSuffix(@RequestParam String suffix)
    {
    	return lser.fetchItemsByBrandnameSuffix(suffix);
    }
    @GetMapping("/fetchItemsBySize")
    public List<LavenderModel>fetchItemsBySize(@RequestParam int size)
    {
    	return lser.fetchItemsBySize(size);
    }
   

}

 
  
package com.example.demo.modelservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelproject.ModelSeat;
import com.example.demo.modelrepository.ModelRepository;

@Service
public class ModelService {
	@Autowired
	ModelRepository mr;
	
	//1.post details
	//postDetail for single Data Enter-----postDetails
	public ModelSeat postDetails(ModelSeat ms) {
		return mr.save(ms);
	}
	//postDetail for multi-Data Enter------post (n)number of Details
	public List<ModelSeat> postnDetails(List<ModelSeat> ms){
		return (List<ModelSeat>)mr.saveAll(ms);
	}
	//1.end of post details
	
	
	//2.update details
	public ModelSeat putDetails(ModelSeat ms) {
		return mr.saveAndFlush(ms);
	}
	public String changeinfobyid(int id,ModelSeat ms) {
		if(mr.existsById(id)) {
			mr.saveAndFlush(ms);
			return "updated";
		}
		return "invalid";
	}
	//3.delete----1
	public void deleteDetails(ModelSeat ms) {
		 mr.delete(ms);
	}
	//-----2
	public void deletebyId(int id) {
		mr.deleteById(id);
	}
	public List<ModelSeat> getDetails(){
		return mr.findAll();
	}
}

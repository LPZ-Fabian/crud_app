package formcreatorapp.controller;

import java.util.List;

import formcreatorapp.model.FormElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import formcreatorapp.repository.ElementRepository;

@RestController
@RequestMapping("/api/v1")
public class ElementController {
	@Autowired
	private ElementRepository elementRepository;
	
	//get all elements
	
	@GetMapping("/elements")
	public List<FormElement> getAllElements(){
		return elementRepository.findAll();
	}
	
}

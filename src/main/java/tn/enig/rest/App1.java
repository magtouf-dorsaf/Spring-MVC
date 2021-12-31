package tn.enig.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.enig.dao.ILivre;
import tn.enig.model.Livre;

@RestController
@CrossOrigin("*")
public class App1 {
	
@Autowired
ILivre dao;
public void setDao(ILivre dao) {
	this.dao = dao;
}
@GetMapping("/livres")
public List<Livre> get1(){
	return dao.findAll();
	
}
@PostMapping("/addLivre")
public void add(@RequestBody Livre l ) {
	dao.save(l);
}
@DeleteMapping("/deleteLivre/{id}")
public void del( @ PathVariable("id") int id) {
	dao.deleteById(id);
	
	
}

}

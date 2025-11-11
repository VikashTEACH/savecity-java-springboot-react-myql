package com.app.savecity.wastissue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.savecity.error.EntityNotFoundException;
import com.app.savecity.wastissue.entity.WastEntity;

import com.app.savecity.wastissue.service.WastService;

@RestController
public class WastController {

	@Autowired
	private WastService service;
	
	@PostMapping("/savecity/save/wastissue")
	public WastEntity saveWastIssue(@RequestBody WastEntity wastEntity) {
		return service.saveWastIssue(wastEntity);
	}
	
	@GetMapping("/savecity/wastissues")
	public List<WastEntity> findAllWastIssue() throws EntityNotFoundException{
		return service.findAllWastIssue();
	}
	
	@GetMapping("/savecity/wastissue/id/{id}")
	public WastEntity findWastIssueById(@PathVariable Long id) throws EntityNotFoundException {
		return service.findWastIssueById(id);
	}
	@PutMapping("/savecity/updatewast/id/{id}")
	public WastEntity updateWastIssue(@RequestBody WastEntity wastEntity,@PathVariable Long id) {
		return service.updateWastIssue(wastEntity,id);
	}
	
}

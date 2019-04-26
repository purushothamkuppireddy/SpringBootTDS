package com.capg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.model.TdsMaster;
import com.capg.service.TDSService;
import com.capg.userException.UserNotFoundException;

@RestController
@ComponentScan("com")
@RequestMapping("/user")
public class TDSController {

	@Autowired
	TDSService tdsService;

	@GetMapping("/tds/{id}")
	public ResponseEntity getById(@PathVariable int id) {
		TdsMaster tdsMaster=tdsService.getById(id);
		if(tdsMaster==null) {
			throw new UserNotFoundException("ID Not Found wrong ID: "+id);
		}
		else
			return new ResponseEntity(tdsMaster,HttpStatus.OK);
	}

}

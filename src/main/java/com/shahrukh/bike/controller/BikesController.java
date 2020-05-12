package com.shahrukh.bike.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.shahrukh.bike.exception.ResourceNotFoundException;
import com.shahrukh.bike.models.Bike;
import com.shahrukh.bike.repository.BikeRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/bikes")
public class BikesController {

	@Autowired
	private BikeRepository bikeRepository;

	@GetMapping()
	public List<Bike> getAllAdmin() {
		return bikeRepository.findAll();
	}

	@PostMapping()
	@ResponseStatus(HttpStatus.OK)
	public Bike createAdmin(@Valid @RequestBody Bike bike) {
		return bikeRepository.save(bike);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Bike> getAdminById(@PathVariable(value = "id") Long bikeId)
			throws ResourceNotFoundException {
		Bike bike = bikeRepository.findById(bikeId)
				.orElseThrow(() -> new ResourceNotFoundException("Admin not found for this id :: " + bikeId));
		return ResponseEntity.ok().body(bike);
	}

}

package com.healthcare.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.models.DiagnosticTest;
import com.healthcare.services.DiagnosticTestService;

@CrossOrigin
@RestController
@RequestMapping("/api/tests")
public class DiagnosticTestController {

	@Autowired private DiagnosticTestService dservice;
	
	@PostMapping
	public ResponseEntity<?> addTest(@RequestBody DiagnosticTest test) {
		dservice.addTest(test);
		return ResponseEntity.ok(test);
	}
	
	@GetMapping
	public ResponseEntity<?> listAll(){
		return ResponseEntity.ok(dservice.getAllTests());
	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> findById(@PathVariable("id") int testId){
		return ResponseEntity.ok(dservice.viewById(testId));
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> deleteTest(@PathVariable("id") int testId){
		DiagnosticTest test=dservice.viewById(testId);
		dservice.removeTest(test);
		Map<String,String> map=new HashMap<>();
		map.put("msg", "Test Deleted successfully");
		return ResponseEntity.ok(map);
	}
}

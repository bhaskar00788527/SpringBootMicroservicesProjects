package com.Bhaskar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bhaskar.entity.Plan;
import com.Bhaskar.service.PlanService;

@RestController
public class PlanController {

	@Autowired
	private PlanService planServiice;
	
	  @PostMapping("/save")
	    public Plan save(@RequestBody Plan plan) {
	        return planServiice.save(plan);
	        
	  }
	  
	  @GetMapping("/all")
	    public List<Plan> getAllPlans() {
	        return planServiice.getAllPlans();
	    }
}

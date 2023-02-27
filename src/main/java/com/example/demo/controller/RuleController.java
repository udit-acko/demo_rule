package com.example.demo.controller;

import com.example.demo.model.Rule;
import com.example.demo.service.RuleService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rules")
@CrossOrigin
public class RuleController  {
    @Autowired
    private RuleService ruleService;

    @PostMapping("")
    public String add(@RequestBody Rule rule){
        ruleService.addRule(rule);
        return "rule added successfully";
    }

    @GetMapping("")
    public List<Rule> getAllRule(){
        return ruleService.getAllRule();
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody Rule rule){
          ruleService.updateRule(id, rule);
          return "rule updated successfully";
    }
    @GetMapping("/{id}")
    public ResponseEntity<Rule> getById(@PathVariable int id){

        return new ResponseEntity<>(ruleService.GetRuleById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        ruleService.deleteRule(id);
        return  "rule deleted successfully";
    }



}

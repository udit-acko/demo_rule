package com.example.demo.service;

import com.example.demo.model.Rule;
import com.example.demo.repository.RuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RuleServiceImpl implements RuleService{

     @Autowired
     private RuleRepository ruleRepository;
    @Override
    public Rule addRule(Rule rule) {
        System.out.println(rule.getFieldName());
        return ruleRepository.save(rule);
    }

    @Override
    public List<Rule> getAllRule() {
        return ruleRepository.findAll();
    }

    @Override
    public void updateRule(int id,Rule rule) {
         Rule res = new Rule();
         Optional<Rule> existingRule = ruleRepository.findById(id);
         if(existingRule.isPresent()){
             Rule newRule = existingRule.get();
             newRule.setFieldName(rule.getFieldName());
             newRule.setOperator(rule.getOperator());
             newRule.setValue(rule.getValue());
             ruleRepository.save(newRule);
         }




    }
    @Override
    public Rule GetRuleById(int id){
        return ruleRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }
    @Override
    public void deleteRule(int id){
            ruleRepository.deleteById(id);
    }


}

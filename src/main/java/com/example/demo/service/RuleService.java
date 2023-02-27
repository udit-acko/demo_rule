package com.example.demo.service;

import com.example.demo.model.Rule;

import java.util.List;

public interface RuleService {
    public Rule addRule(Rule rule);
    public List<Rule> getAllRule();

    public void updateRule(int id,Rule rule);
   public Rule GetRuleById(int id);

   public void deleteRule(int id);

}

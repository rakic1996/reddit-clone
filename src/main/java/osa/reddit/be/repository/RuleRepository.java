package osa.reddit.be.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import osa.reddit.be.model.Rule;

public interface RuleRepository extends JpaRepository<Rule, Integer>{

}

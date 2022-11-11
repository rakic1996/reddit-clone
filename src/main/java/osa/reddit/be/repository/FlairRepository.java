package osa.reddit.be.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import osa.reddit.be.model.Flair;

public interface FlairRepository extends JpaRepository<Flair, Integer>{

}

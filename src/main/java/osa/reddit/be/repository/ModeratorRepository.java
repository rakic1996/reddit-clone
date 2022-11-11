package osa.reddit.be.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import osa.reddit.be.model.Moderator;

public interface ModeratorRepository extends JpaRepository<Moderator, Integer>{

}

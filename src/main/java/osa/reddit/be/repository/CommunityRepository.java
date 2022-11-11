package osa.reddit.be.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import osa.reddit.be.model.Community;

public interface CommunityRepository extends JpaRepository<Community, Integer>{

}

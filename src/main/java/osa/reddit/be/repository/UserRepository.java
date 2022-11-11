package osa.reddit.be.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import osa.reddit.be.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
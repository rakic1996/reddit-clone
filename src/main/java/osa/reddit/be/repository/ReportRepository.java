package osa.reddit.be.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import osa.reddit.be.model.Report;

public interface ReportRepository extends JpaRepository<Report, Integer>{

}

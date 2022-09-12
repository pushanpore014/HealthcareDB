package com.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcare.models.TestResult;

@Repository
public interface TestResultRepository extends JpaRepository<TestResult, Integer> {

}

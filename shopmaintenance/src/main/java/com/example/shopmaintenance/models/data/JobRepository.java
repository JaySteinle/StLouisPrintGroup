package com.example.shopmaintenance.models.data;

import com.example.shopmaintenance.models.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface JobRepository extends CrudRepository<Job, Integer> {

}
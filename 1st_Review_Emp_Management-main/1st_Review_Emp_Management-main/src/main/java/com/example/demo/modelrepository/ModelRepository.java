package com.example.demo.modelrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelproject.ModelSeat;

public interface ModelRepository extends JpaRepository<ModelSeat, Integer> {

}

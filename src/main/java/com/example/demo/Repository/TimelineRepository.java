package com.example.demo.Repository;

import com.example.demo.Entity.Timeline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimelineRepository extends JpaRepository<Timeline,Integer> {
}

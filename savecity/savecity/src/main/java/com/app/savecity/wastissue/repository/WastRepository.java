package com.app.savecity.wastissue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.savecity.wastissue.entity.WastEntity;

@Repository
public interface WastRepository extends JpaRepository<WastEntity, Long>{

}

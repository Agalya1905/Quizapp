package com.nirmaan.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nirmaan.pro.entity.Option;

@Repository
public interface OptionRepo  extends JpaRepository<Option, Integer>{

}

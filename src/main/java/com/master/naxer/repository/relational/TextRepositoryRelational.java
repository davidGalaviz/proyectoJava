package com.master.naxer.repository.relational;

import com.master.naxer.entity.relational.Text_T;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextRepositoryRelational extends JpaRepository<Text_T, Long>{}
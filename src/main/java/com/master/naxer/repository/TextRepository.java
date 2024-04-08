package com.master.naxer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TextRepository extends JpaRepository<Usuario, Long>{}
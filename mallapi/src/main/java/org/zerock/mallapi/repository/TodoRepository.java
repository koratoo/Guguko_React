package org.zerock.mallapi.repository;

import org.zerock.mallapi.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    
} 

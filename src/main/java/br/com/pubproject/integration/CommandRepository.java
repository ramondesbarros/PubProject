package br.com.pubproject.integration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pubproject.domain.Command;

@Repository
public interface CommandRepository extends JpaRepository<Command, Integer> {

    Command findByIdCommand(Long id);

}
package br.com.pubproject.integration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pubproject.domain.Items;

@Repository
public interface ItemsRepository extends JpaRepository<Items, Long> {

    Items findByIdItems(Long id);
}

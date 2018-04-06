package br.com.pubproject.service;

import java.util.List;

import br.com.pubproject.domain.Items;

public interface ItemsService {

    List<Items> listAllItems();

    void createItems(Items items);

    Items readItems(Long id);

    void updateItems(Items items);

    void deleteItems(Long id);
}

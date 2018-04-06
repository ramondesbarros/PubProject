package br.com.pubproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pubproject.domain.Items;
import br.com.pubproject.integration.ItemsRepository;
import br.com.pubproject.service.ItemsService;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsRepository itemsRepository;

    @Override
    public List<Items> listAllItems() {
        return itemsRepository.findAll();
    }

    @Override
    public void createItems(Items items) {
        itemsRepository.save(items);
    }

    @Override
    public Items readItems(Long id) {
        return itemsRepository.findByIdItems(id);
    }

    @Override
    public void updateItems(Items items) {
        itemsRepository.save(items);
    }

    @Override
    public void deleteItems(Long id) {
        itemsRepository.deleteById(id);
    }

}

package br.com.pubproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pubproject.domain.Command;
import br.com.pubproject.integration.CommandRepository;
import br.com.pubproject.service.CommandService;

@Service
public class CommandServiceImpl implements CommandService {

    @Autowired
    private CommandRepository commandRepository;

    @Override
    public List<Command> listAllCommand() {
        return commandRepository.findAll();
    }

    @Override
    public void createCommand(Command command) {
        commandRepository.save(command);
    }

    @Override
    public void updateCommand(Command command) {
        commandRepository.save(command);
    }

    @Override
    public Command findCommandById(Long id) {
        return commandRepository.findByIdCommand(id);
    }
}

package br.com.pubproject.service;

import java.util.List;

import br.com.pubproject.domain.Command;

public interface CommandService {

    List<Command> listAllCommand();

    void createCommand(Command command);

    void updateCommand(Command command);

    Command findCommandById(Long id);
}

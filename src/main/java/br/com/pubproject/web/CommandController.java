package br.com.pubproject.web;

import static br.com.pubproject.domain.PubProjectConstants.COMMAND_ENDPOINT;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pubproject.domain.Command;
import br.com.pubproject.service.CommandService;

@RestController
@RequestMapping(COMMAND_ENDPOINT)
public class CommandController {

    @Autowired
    private CommandService commandService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Command command) {
        commandService.createCommand(command);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Command>> read() {
        return new ResponseEntity<List<Command>>(commandService.listAllCommand(), HttpStatus.OK);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Command command) {
        commandService.updateCommand(command);
    }

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Command readCommand(@PathVariable Long id) {
        return commandService.findCommandById(id);
    }
}

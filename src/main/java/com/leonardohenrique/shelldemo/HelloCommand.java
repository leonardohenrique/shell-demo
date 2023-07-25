package com.leonardohenrique.shelldemo;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class HelloCommand {

	@ShellMethod("Dizer olá ao usuário")
	public String hello(@ShellOption(defaultValue = "Spring Shell") String name) {
		return "Olá, " + name + "!";
	}

}

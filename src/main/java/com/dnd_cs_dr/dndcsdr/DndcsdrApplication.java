package com.dnd_cs_dr.dndcsdr;

import com.dnd_cs_dr.dndcsdr.PlayerCharacter.PlayerCharacter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DndcsdrApplication {

	public static void main(String[] args) {
		SpringApplication.run(DndcsdrApplication.class, args);

		PlayerCharacter playerCharacter = new PlayerCharacter("Player", "Character");
		System.out.println(playerCharacter);
	}
}

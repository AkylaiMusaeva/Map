package LmsTask.model;

import LmsTask.enums.KeyCharacters;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Characters {
    private Long id;
    private Map<KeyCharacters, List<String>> character;
    public Characters(){
        this.character=new HashMap<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<KeyCharacters, List<String>> getCharacter() {
        return character;
    }

    public void setCharacter(Map<KeyCharacters, List<String>> character) {
        this.character = character;
    }
    public String methodCh(){
        character.put(KeyCharacters.CD,List.of("CD-RW","VCD","MINI-CD"));
        return "We created Map<KeyCharacters, List<String>>";
    }

    @Override
    public String toString() {
        return "Characters{" +
                "id=" + id +
                ", character=" + character +
                '}';
    }
}

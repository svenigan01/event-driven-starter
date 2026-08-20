package template.commons.model.dto;

import jakarta.validation.constraints.NotBlank;
import template.commons.model.domain.Item;

// Lombok uses annotations (like @Data or @Getter) to 
// generate code like getId() and getName(). Make sure to
// add @Data annotation to Item class

public record ItemDTO(@NotBlank String id, @NotBlank String name) {

    public static ItemDTO fromItem(Item item) {
        return new ItemDTO(item.getId(), item.getName());
    }

}

/*
About lombok:
Lombok is a Java library that eliminates repetitive boilerplate code by using simple annotations (like @Data). Instead of manually writing dozens of lines for getters, setters, constructors, and equals() methods, Lombok generates them automatically behind the scenes. This keeps data models like ItemDTO clean, readable, and easy to maintain when adding new fields
*/
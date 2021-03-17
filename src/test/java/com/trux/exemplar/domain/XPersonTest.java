package com.trux.exemplar.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("XPerson JSON Mapping")
public class XPersonTest
{
    private ObjectMapper mapper = new ObjectMapper();

    @Test
    @DisplayName("can serialize and deserialize person")
    void canRoundTrip() throws JsonProcessingException {

        XPerson originalXPerson = XPerson.of()
                .firstName("Reginald")
                .nameLikes("Reggie")
                .lastName("Braithewaite")
                .build();

        String serialized = mapper.writeValueAsString(originalXPerson);

        assertTrue(serialized.contains("Reginald"),"First Name");
        assertTrue(serialized.contains("Reggie"),"Name Likes");
        assertTrue(serialized.contains("Braithewaite"),"Last Name");

        XPerson restoredXPerson = mapper.readValue(serialized, XPerson.class);

        assertAll(
                () -> assertEquals(originalXPerson.getFirstName(),restoredXPerson.getFirstName(),
                        "First Name"),
                () -> assertEquals(originalXPerson.getNameLikes(),restoredXPerson.getNameLikes(),
                        "Name Likes"),
                () -> assertEquals(originalXPerson.getLastName(),restoredXPerson.getLastName(),
                        "Last Name")
        );

    }


}
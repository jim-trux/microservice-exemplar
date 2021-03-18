package com.trux.exemplar.agg.persons;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.With;
import lombok.extern.jackson.Jacksonized;

/*
 * Sample Person
 *
 * Jackson needs JavaTime binding.
 * Jackson uses the following
 * @Getter
 * @Setter
 * @NoArgsConstructor
 * @AllArgsConstructor
 *
 * The @Builder is for writing fast test code.
 * The @With is for running clean code.
 */

@With
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true, builderMethodName = "of", buildMethodName = "build")
public class XPerson
{
    private String firstName;
    private String nameLikes;
    private String lastName;
}

package net.raisetech.restapi.POST;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import org.hibernate.validator.constraints.Length;

public class NameCreateRequest {
    @NotBlank(message = "givenName is mandatory")
    @Length(min = 1, max = 20)
    private String givenName;
    @NotBlank(message = "familyName is mandatory")
    @Length(min = 1, max = 20, message = "familyName must be between 1 and 20 characters")
    private String familyName;
    @NotBlank(message = "middleName is mandatory")
    @Length(min = 1, max = 20)
    private String middleName;
    @NotNull(message = "age is mandatory")
    @PositiveOrZero
    private int age;


    public NameCreateRequest(String givenName, String familyName, String middleName, int age) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.middleName = middleName;
        this.age = age;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getAge() {
        return age;
    }
}

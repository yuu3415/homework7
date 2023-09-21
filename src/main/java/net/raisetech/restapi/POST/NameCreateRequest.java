package net.raisetech.restapi.POST;

public class NameCreateRequest {
    private String givenName;
    private String familyName;
    private String middleName;

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

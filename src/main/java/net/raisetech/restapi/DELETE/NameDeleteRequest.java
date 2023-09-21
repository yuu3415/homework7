package net.raisetech.restapi.DELETE;

public class NameDeleteRequest {
    private String givenName;
    private String familyName;
    private String middleName;

    public NameDeleteRequest(String givenName, String familyName, String middleName) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.middleName = middleName;
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
}

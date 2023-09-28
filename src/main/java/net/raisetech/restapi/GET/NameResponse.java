package net.raisetech.restapi.GET;

public class NameResponse {

    private String givenName;

    private String familyName;

    private String middleName;
    private int id;


    public NameResponse(String givenName, String familyName, String middleName, int id) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.middleName = middleName;
        this.id = id;
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

    public int getId() {
        return id;
    }
}

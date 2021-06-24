package Part4.Ex17PersonalInformation;

public class PersonalInformation {
    private String name;
    private String lastName;
    private String id;

    public PersonalInformation(String name, String lastName, String id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }

    public String getName(){
        return this.name;
    }


    public String getLastName(){
        return this.lastName;
    }
}

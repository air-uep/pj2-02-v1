package pl.air.bookstore.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Author {

    private String firstName;
    private String middleName;
    private String lastName;
    private String profile;

    // ********** Constructors **********
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    // ********** Business methods **********

    public String getFullName() {
        String fullName = firstName;
        if (middleName !=  null) {
            fullName += " " + middleName;
        }
        fullName += " " + lastName;
        return fullName;

        // wersja skrócona
        //return firstName + (middleName != null ? " " + middleName : "") + " " + lastName;
    }

}

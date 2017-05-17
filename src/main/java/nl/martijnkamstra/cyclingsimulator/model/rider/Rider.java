package nl.martijnkamstra.cyclingsimulator.model.rider;

import java.time.LocalDate;

public class Rider {
    private long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private RiderAttributes riderAttributes;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}

package nl.martijnkamstra.cyclingsimulator.model.team;


import nl.martijnkamstra.cyclingsimulator.model.rider.Rider;

import java.time.LocalDate;

public class RiderTeam {
    private Rider rider;
    private Team team;
    private LocalDate startDay;
    private LocalDate lastDay; // Inclusive
}

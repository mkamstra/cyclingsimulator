package nl.martijnkamstra.cyclingsimulator.team;


import nl.martijnkamstra.cyclingsimulator.rider.Rider;
import nl.martijnkamstra.cyclingsimulator.team.Team;

import java.time.LocalDate;

public class RiderTeam {
    private Rider rider;
    private Team team;
    private LocalDate startDay;
    private LocalDate lastDay; // Inclusive
}

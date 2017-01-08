package nl.martijnkamstra.cyclingsimulator.user;

import nl.martijnkamstra.cyclingsimulator.team.Team;

import java.time.LocalDate;

/**
 * Defines the link between a user and a team
 */
public class UserTeam {
    private User user;
    private Team team;
    private LocalDate firstDay;
    private LocalDate lastDay;
}

package nl.martijnkamstra.cyclingsimulator.model.user;

import nl.martijnkamstra.cyclingsimulator.model.team.Team;

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

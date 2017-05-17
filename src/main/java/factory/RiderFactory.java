package factory;

import factory.namegenerator.Language;
import factory.namegenerator.NameGeneratorDelegator;
import factory.namegenerator.NameType;
import nl.martijnkamstra.cyclingsimulator.model.rider.Rider;

public class RiderFactory {
    /**
     * @param language The language to generate the name for
     * @return Generate a rider
     */
    public static Rider getRider(Language language) {
        Rider rider = new Rider();
        String firstName = NameGeneratorDelegator.generateName(NameType.FIRST_NAME, language);
        rider.setFirstName(firstName);
        String lastName = NameGeneratorDelegator.generateName(NameType.LAST_NAME, language);
        rider.setLastName(lastName);

        return rider;
    }
}

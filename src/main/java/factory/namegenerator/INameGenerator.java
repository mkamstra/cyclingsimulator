package factory.namegenerator;

import java.util.List;

public interface INameGenerator {
    /**
     * @return The generated name
     */
    String generateName(Language language, NameType nameType);
}

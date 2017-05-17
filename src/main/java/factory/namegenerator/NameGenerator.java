package factory.namegenerator;

import java.util.*;

public class NameGenerator implements INameGenerator {
    /**
     * The available names per language and name type
     */
    protected Map<Language, Map<NameType, List<String>>> availableNamesPerLanguageAndNameType;

    /**
     * @param language The language to generate the name for
     * @param nameType First name, last name or middle name
     * @return a generated name for the specified language and name type
     */
    public String generateName(Language language, NameType nameType) {
        List<String> names = getAvailableNamesForLanguageAndNameType(language, nameType);

        if (names.size() > 0) {
            Random randomGenerator = new Random();
            int nameIndex = randomGenerator.ints(0, names.size()).limit(1).findFirst().getAsInt();
            return names.get(nameIndex);
        }

        return null;
    }

    /**
     * @param language The language to find the available names for
     * @param nameType First name, last name or middle name
     * @return the available names for the selected language and name type
     */
    private List<String> getAvailableNamesForLanguageAndNameType(Language language, NameType nameType) {
        Map<NameType, List<String>> namesForLanguage = null;
        if (availableNamesPerLanguageAndNameType.containsKey(language)) {
            namesForLanguage = availableNamesPerLanguageAndNameType.get(language);
        } else {
            namesForLanguage = new HashMap<NameType, List<String>>();
        }

        List<String> names;
        if (namesForLanguage.containsKey(nameType)) {
            names = namesForLanguage.get(nameType);
        } else {
            names = new ArrayList<String>(); // TODO: Read from file / database
        }
        return names;
    }
}

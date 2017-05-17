package factory.namegenerator;


public class NameGeneratorDelegator {
    public static String generateName(NameType nameType, Language language) {
        String name = "";
        INameGenerator nameGenerator = new NameGenerator();
        switch (nameType) {
            case FIRST_NAME:
                switch (language) {
                    case ENGLISH:
                        name = nameGenerator.generateName(Language.ENGLISH, NameType.FIRST_NAME);
                        break;
                    case DUTCH:
                        name = nameGenerator.generateName(Language.DUTCH, NameType.FIRST_NAME);
                        break;
                    case NORWEGIAN:
                        name = nameGenerator.generateName(Language.NORWEGIAN, NameType.FIRST_NAME);
                        break;
                    default:
                        break;
                }
                break;
            case LAST_NAME:
                switch (language) {
                    case ENGLISH:
                        name = nameGenerator.generateName(Language.ENGLISH, NameType.LAST_NAME);
                        break;
                    case DUTCH:
                        name = nameGenerator.generateName(Language.DUTCH, NameType.LAST_NAME);
                        break;
                    case NORWEGIAN:
                        name = nameGenerator.generateName(Language.NORWEGIAN, NameType.LAST_NAME);
                        break;
                    default:
                        break;
                }
                break;
            case MIDDLE_NAME:
                switch (language) {
                    case ENGLISH:
                        name = nameGenerator.generateName(Language.ENGLISH, NameType.MIDDLE_NAME);
                        break;
                    case DUTCH:
                        name = nameGenerator.generateName(Language.DUTCH, NameType.MIDDLE_NAME);
                        break;
                    case NORWEGIAN:
                        name = nameGenerator.generateName(Language.NORWEGIAN, NameType.MIDDLE_NAME);
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        return name;
    }
}

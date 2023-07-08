import java.util.ArrayList;

class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
    protected String genderUsage;
    protected boolean isTonal;

    public Language(String languageName, int speakers, String regions, String order) {
        this.name = languageName;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder = order;
    }

    public void setRegionsSpoken(String regions) {
        this.regionsSpoken = regions;
    }

    public void setNumSpeakers(int speakers) {
        this.numSpeakers = speakers;
    }

    public void setWordOrder(String order) {
        this.wordOrder = order;
    }

    public void setGenderUsage(String gender) {
        this.genderUsage = gender;
    }

    public void setTonal(boolean isTonal) {
        this.isTonal = isTonal;
    }

    public void getInfo() {
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
        System.out.println("The language follows the word order: " + wordOrder + ".");
        if (genderUsage != null) {
            System.out.println("Gender Usage: " + genderUsage);
        }
        if (isTonal) {
            System.out.println("The language is tonal.");
        }
    }

    public static void main(String[] args) {
        ArrayList<Language> languages = new ArrayList<>();

        Language swahili = new Language("Kiswahili", 60000000, "East and Central Africa", "subject-verb-object");
        swahili.getInfo();
        languages.add(swahili);

        Mayan chontal = new Mayan("Chontal", 60563);
        chontal.setWordOrder("verb-object-subject");
        chontal.setGenderUsage("No gender distinctions");
        chontal.getInfo();
        languages.add(chontal);

        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1300000000);
        mandarin.setTonal(true);
        mandarin.getInfo();
        languages.add(mandarin);

        SinoTibetan burmese = new SinoTibetan("Burmese", 30000000);
        burmese.setWordOrder("subject-object-verb");
        burmese.setGenderUsage("No gender distinctions");
        burmese.getInfo();
        languages.add(burmese);

        // Loop through the language objects and call getInfo()
        for (Language language : languages) {
            language.getInfo();
            System.out.println();
        }

        // Mapping out sign language families
        System.out.println("Sign Language Families:");
        System.out.println("1. American Sign Language (ASL)");
        System.out.println("2. British Sign Language (BSL)");
        System.out.println("3. Australian Sign Language (Auslan)");
        System.out.println("4. Japanese Sign Language (JSL)");
    }
}
class Mayan extends Language {
    public Mayan(String languageName, int speakers) {
        super(languageName, speakers, "Central America", "verb-object-subject");
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Fun fact: " + name + " is an ergative language.");
    }
}

class SinoTibetan extends Language {
    public SinoTibetan(String languageName, int speakers) {
        super(languageName, speakers, "Asia", "subject-object-verb");
        if (languageName.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }
    }
}


public class App {
    public static void main(String[] args) {
        Speaker[] speakers = {
            new DogSpeaker(),
            new RobotSpeaker(),
            new PoliticianSpeaker()
        };
        
        String testMessage = "This is an important announcement";
        
        for (Speaker speaker : speakers) {
            System.out.println("\nTesting " + speaker.getClass().getSimpleName() + ":");
            System.out.println("----------");
            speaker.speak();
            speaker.announce(testMessage);
            System.out.println("----------");
        }
    }
}
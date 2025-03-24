public class DogSpeaker implements Speaker {
    
    @Override
    public void speak() {
        System.out.println("Woof! Woof!");
    }
    
    @Override
    public void announce(String message) {
        System.out.println("*Excited barking* " + message.replaceAll("[a-zA-Z]", "arf ") + "*wags tail*");
    }
}
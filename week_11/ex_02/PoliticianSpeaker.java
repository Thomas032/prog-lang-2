public class PoliticianSpeaker implements Speaker {
    
    @Override
    public void speak() {
        System.out.println("My fellow citizens, I stand before you today with great conviction...");
    }
    
    @Override
    public void announce(String message) {
        System.out.println("Let me be perfectly clear. As I've always said, " + message + 
                           ". And that's what the people want, that's what the people deserve!");
    }
}
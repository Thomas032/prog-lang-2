public class RobotSpeaker implements Speaker {
    
    @Override
    public void speak() {
        System.out.println("PROCESSING SPEECH PROTOCOLS... BEEP BOOP.");
    }
    
    @Override
    public void announce(String message) {
        StringBuilder processed = new StringBuilder();
        for (char c : message.toCharArray()) {
            processed.append(c).append("-");
        }
        System.out.println("ANNOUNCEMENT-INITIATED: " + processed.toString() + " END-TRANSMISSION");
    }
}
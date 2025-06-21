public class CommandPatternExample {
    public static void main(String[] args) {
        Light roomLight = new Light();
        Command lightOn = new LightOnCommand(roomLight);
        Command lightOff = new LightOffCommand(roomLight);
        RemoteControl remote = new RemoteControl();

        // Execute ON command
        remote.setCommand(lightOn);
        remote.pressButton();

        // Execute OFF command
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}

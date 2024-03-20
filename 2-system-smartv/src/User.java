public class User {
  public static void main(String[] args) throws Exception {
    SmartTv tv = new SmartTv();
    System.out.println("TV power on? " + tv.power);
    System.out.println("Channel: " + tv.channel);
    System.out.println("Volume: " + tv.volume);

    tv.turnOn();
    System.out.println("New status -> TV power on? " + tv.power);

    tv.turnOff();
    System.out.println("New status -> TV power on? " + tv.power);

    tv.volumeUp();
    tv.volumeUp();
    tv.volumeUp();

    tv.volumeDown();
    tv.volumeDown();

    tv.changeChannel(5);

    tv.channelUp();
    tv.channelUp();
    tv.channelUp();
    tv.channelUp();

    tv.channelDown();
    tv.channelDown();
    tv.channelDown();

  }

}

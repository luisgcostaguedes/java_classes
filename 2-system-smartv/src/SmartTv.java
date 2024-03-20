public class SmartTv {

  boolean power = false;
  int channel = 1;
  int volume = 10;

  public void turnOn() {
    power = true;
  }

  public void turnOff() {
    power = false;
  }

  public void volumeUp() {
    volume++;
    System.out.println("Volume: " + volume);
  }

  public void volumeDown() {
    volume--;
    System.out.println("Volume: " + volume);
  }

  public void changeChannel(int newChannel) {
    channel = newChannel;
    System.out.println("Channel: " + channel);
  }

  public void channelUp() {
    channel++;
    System.out.println("Channel: " + channel);
  }

  public void channelDown() {
    channel--;
    System.out.println("Channel: " + channel);
  }
}

// podemos ver no exemplo acima o uso de métodos para alterar o estado dos
// atributos da classe SmartTv.
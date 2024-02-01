public class SmartRemote extends Remote{


    public boolean tooglePower(){
        this.TV.powerOn=true;
    }
    public void volumeUp(){
        this.TV.setVolume(volume);
    }
    void volumeDown(){
        this.TV.setVolume(volume);
    }
    void channelUp(){
        this.TV.setChannel(channel);
    }
    void channelDown();
    public void showYoutube(){
        System.out.println("Showing Youtube");
    }
}

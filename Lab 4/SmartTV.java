public class SmartTV implements TV{
    public void Youtube()
    {
        System.out.println("Play youtube");
    }

    @Override
    public boolean isEnabled() {
        return this.powerOn;
    }

    @Override
    public void enable() {
        this.powerOn=true;
    }
    public void enable() {
        this.powerOn=false;
    }
     public void getVolume(){
        return this.volume;
     }
     public void setVolume(int volume){
         this.volume=volume;
     }
     public void getChannel(){
        return this.channel;
     }
     public void setChannel(){
        this.channel=channel;
     }
}

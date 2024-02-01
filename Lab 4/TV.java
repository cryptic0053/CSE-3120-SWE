public interface TV {

    boolean powerOn;
    int volume;
    int channel;
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    int setVolume(volume);
    int getChannel();
    int setChannel(channel);




}

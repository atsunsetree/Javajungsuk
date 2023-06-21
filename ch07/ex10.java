package ch07;

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void setChannel(int channel) {
        if(channel < MIN_CHANNEL || channel > MAX_CHANNEL){
            return;
        }
        this.prevChannel = getChannel();
        this.channel = channel;
    }
    int getChannel() {
        return channel;
    }
    void setVolume(int volume) {
        this.volume = volume;
    }
    int getVolume() {
        return volume;
    }

    //11번
    void gotoPrevChannel() {
        setChannel(prevChannel);
    }

}

public class ex10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
    }
}

public class SmartTv {
    private boolean tvState; //starts off
    private Integer channel;  //starts on channel 1
    private Integer volume; // volume starts at 25

    public SmartTv() {
        tvState = false;
        channel = 1;
        volume = 25;
    }

    public boolean isTvState() {
        return tvState;
    }

    public void setTvState(boolean tvState) {
        this.tvState = tvState;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }


    public boolean changeState(){
        if (this.tvState == false){
            this.setTvState(true);
            System.out.println("TV ON");
        }
        else{
            this.setTvState(false);
            System.out.println("TV OFF");
        }

        return this.isTvState();
    }

    public void turnUpVolume(){
        this.setVolume(volume + 1);
        System.out.println("Volume " + this.getVolume());
    }
    public void turnDownVolume(){
        if (this.getVolume() == 0){
            System.out.println("Minimum volume");
        }else{
        this.setVolume(volume - 1);
        System.out.println("Volume " + this.getVolume());
        }
    }

    public void changeChannel(String change){ //changing up channel (one by one)
        if (change == "up"){
            this.setChannel(channel + 1);
        }
        else if (change.equals("down") && this.getChannel() != 1){ //changing down channel if the TV isnt at channel 1
            this.setChannel(channel - 1);
        }
        else if (change.equals("down") && this.getChannel() == 1) {
            System.out.println("Channel 0 does not exist");
        }
        System.out.println("Channel " + this.getChannel());
    }
    public void changeChannel(int channelNumber){ //changing to channel "x"
        this.setChannel(channelNumber);
        System.out.println("Channel " + this.getChannel());
    }
}

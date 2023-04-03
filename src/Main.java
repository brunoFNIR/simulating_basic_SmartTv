public class Main {
    public static void main(String[] args) {
        {
            SmartTv smartTv1 = new SmartTv();

            smartTv1.changeState(); //turning TV ON

            smartTv1.turnUpVolume();
            smartTv1.turnUpVolume();
            smartTv1.turnUpVolume();
            smartTv1.turnDownVolume();

            smartTv1.changeChannel("up");
            smartTv1.changeChannel(15);
            smartTv1.changeChannel("down");
            smartTv1.changeChannel(1);
            smartTv1.changeChannel("down");

            smartTv1.changeState(); //turning TV OFF
        }
    }
}
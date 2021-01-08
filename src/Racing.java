import sun.applet.Main;

import java.util.Random;

public class Racing implements Runnable {
    private String name;
    public Racing(String name){
        this.name=name;
    }
    int distance=100;
    int step= 2;
    @Override
    public void run() {
        int firstKIlometer=0;
        long startTime=System.currentTimeMillis();
        while (firstKIlometer<distance){
            int speed= new Random().nextInt(20);
            firstKIlometer+= speed;
            String log= "|";
            int percent= (firstKIlometer*100)/distance;
            for (int i = 0; i < distance; i+=step) {
                if (percent>=i+step){
                    log+="=";
                }else if (percent>i&& percent<i+step){
                    log+=("o");
                }else
                   log+=("-");
            }log+= "|";
            System.out.println("Car "+this.name+": "+log+" "+Math.min(distance,firstKIlometer)+ " KM");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car "+this.name+"broke...");
                break;
            }
        }
        long endTime= System.currentTimeMillis();
        System.out.println("Car "+this.name+" Finish in"+ (endTime-startTime)/1000+"s");

    }
}

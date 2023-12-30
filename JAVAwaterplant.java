import eecs1021.task;
import org.firmata4j.*;
import org.firmata4j.firmata.FirmataDevice;
import org.firmata4j.ssd1306.SSD1306;
import java.io.IOException;
import java.util.Timer;
public class minor {
    public static void main(String[] args)
            throws IOException, InterruptedException {

        String myPort = "COM7";
        IODevice myGroveBoard = new FirmataDevice(myPort);
        //STARTING ARDUINO
        myGroveBoard.start();
        myGroveBoard.ensureInitializationIsDone();
        var i2cObject = myGroveBoard.getI2CDevice((byte) 0x3C);
        SSD1306 myLED = new SSD1306(i2cObject, SSD1306.Size.SSD1306_128_64);
        myLED.init();
        //MOISTURE SENSOR AND WATERPUMP
        var MoistureSensor = myGroveBoard.getPin(15);
        MoistureSensor.setMode(Pin.Mode.ANALOG);

        var waterPump = myGroveBoard.getPin(2);
        waterPump.setMode(Pin.Mode.OUTPUT);
        var Task = new task(MoistureSensor, myLED, waterPump);


        Timer timerObject = new Timer();
        timerObject.schedule(Task, 0, 1000);
    }

}


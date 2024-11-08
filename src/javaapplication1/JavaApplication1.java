/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.io.IOException;
import com.fazecast.jSerialComm.SerialPort;
import java.util.Scanner;
/**
 *
 * @author barba
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        SerialPort sp = SerialPort.getCommPort("COM6");
        sp.setComPortParameters(9600, 8, 1, 0);
        sp.setComPortTimeouts(SerialPort.TIMEOUT_WRITE_BLOCKING, 0, 0);
        //-------------------------------------------------------------
        if(!sp.openPort()) {
            System.out.println("\nCOM port NOT available\n"); return;
        }
        //-------------------------------------------------------------
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.print("\nEnter number of LED blinks (0 to exit): ");
            Integer blinks = input.nextInt();
            if(blinks == 0) break;
            Thread.sleep(1500);
//            sp.getOutputStream().write(blinks.byteValue());
              sp.getOutputStream().write(0);
        }
        input.close();
        
        
   
        
    }
    

    
}
    
    


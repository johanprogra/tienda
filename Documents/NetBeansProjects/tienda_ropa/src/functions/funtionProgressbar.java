
package functions;

import javax.swing.JProgressBar;

public class funtionProgressbar {
    
    public void progress(JProgressBar bar){
        Thread hilo=new Thread(){
        @Override
        public void run(){
            for (int i=0; i <= 100; i++) {
                try {
                    this.sleep(20); 
                    bar.setValue(i);
                    if (i==100) {
                       this.stop();
                }} catch (InterruptedException ex) {}
                
                
            }
       }
   };
        hilo.start();
    }
    
}

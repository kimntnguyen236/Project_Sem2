/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import DBConnection.LoginDatabase;

/**
 *
 * @author ThienKim
 */
public class SplashScreen {
    public static void main(String[] args) {
        Splash splash = new Splash();
        splash.setVisible(true);
        LoginDatabase lg = new LoginDatabase();
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                splash.Loading.setText("Loading... "+i+"%");
                splash.loadingbar.setValue(i);
                if (i==100) {
                    splash.setVisible(false);
                    lg.setVisible(true);
                }
            }
        } catch (Exception e) {
        }
    }
}

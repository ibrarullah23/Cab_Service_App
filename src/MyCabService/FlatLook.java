package MyCabService;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

public class FlatLook {
     public static void setup(){
         try {
            UIManager.setLookAndFeel( new FlatLightLaf() );

            UIManager.put( "Button.arc", 11 );//6
            UIManager.put( "Component.arc", 11 );//5
            //            UIManager.put( "CheckBox.arc", 9 );//4
            //            UIManager.put( "ProgressBar.arc", 9 );//4
            UIManager.put( "TextComponent.arc", 11 );//5

            
         } catch (Exception e) {
         }
     }
}

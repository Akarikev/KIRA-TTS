

/*
    main code KIRA workspace connecting all other classes
 */

//import libraries from  keras freetts 
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

//
public class KIRA {
    public  void Speak(String text) {
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice textaudio;
        textaudio = VoiceManager.getInstance().getVoice("kevin16");
        if (textaudio != null) { 
            //if textbox is empty or nothing is written in the textbox allocate null
            textaudio.allocate();
        }

        
        //sets up pitch and rate at which KIRA speaks
        try {
            assert textaudio != null;
            textaudio.setRate(150);
            textaudio.setPitch(180);
            textaudio.setVolume(7);
            textaudio.speak(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

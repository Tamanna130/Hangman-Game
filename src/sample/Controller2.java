package sample;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller2 implements Initializable {
//
        String[] words={"wonder","minister","note","haunt","concern","sneeze","rightful","watery","lace",
                "purring","son","married","price","pass","abounding","rude","stage","scribble","succinct","capable",
                "breath","nifty","opposite","ashamed","selective","high","flimsy","cooperative","shaggy","breakable"};
        ArrayList<String> letters=new ArrayList<>();
        private Random RANDOM = new Random();
        String S_W=words[RANDOM.nextInt(words.length)];
        int wordLength=S_W.length();
        @FXML
        private Label word;
        void init(String str){
                String str="";
                for (int i=0;i<wordLength;i++)
                        letters.add("___  ");
                //letters.set(2,"  A   ");-----demo
                for (String s:letters)
                        str+=s;
                word.setText(str);
        }
        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
                init();
        }
        @FXML
        Button _a,_b,_c,_d,_e,_f,_g,_h,_i,_j,_k,_l,_m,_n,_p,_q,_r,_s,_t,_u,_v,_w,_x,_y,_z;
        @FXML
        void A(){
                _a.getText();
        }
        @FXML
        void B(){
                System.out.println(_b.getText());
        }
        @FXML
        void C(){
                System.out.println(_b.getText());
        }
        @FXML
        void D(){
                System.out.println(_b.getText());
        }
        @FXML
        void E(){
                System.out.println(_b.getText());
        }
        @FXML
        void F(){
                System.out.println(_b.getText());
        }
        @FXML
        void G(){
                System.out.println(_b.getText());
        }
        @FXML
        void H(){
                System.out.println(_b.getText());
        }
        @FXML
        void I(){
                System.out.println(_b.getText());
        }
        @FXML
        void J(){
                System.out.println(_b.getText());
        }
        @FXML
        void K(){
                System.out.println(_b.getText());
        }
        @FXML
        void L(){
                System.out.println(_b.getText());
        }
        @FXML
        void M(){
                System.out.println(_b.getText());
        }
        @FXML
        void N(){
                System.out.println(_b.getText());
        }
        @FXML
        void O(){
                System.out.println(_b.getText());
        }
        @FXML
        void P(){
                System.out.println(_b.getText());
        }
        @FXML
        void Q(){
                System.out.println(_b.getText());
        }
        @FXML
        void R(){
                System.out.println(_b.getText());
        }
        @FXML
        void S(){
                System.out.println(_b.getText());
        }
        @FXML
        void T(){
                System.out.println(_b.getText());
        }
        @FXML
        void U(){
                System.out.println(_b.getText());
        }
        @FXML
        void V(){
                System.out.println(_b.getText());
        }
        @FXML
        void W(){
                System.out.println(_b.getText());
        }
        @FXML
        void X(){
                System.out.println(_b.getText());
        }
        @FXML
        void Y(){
                System.out.println(_b.getText());
        }
        @FXML
        void Z(){
                System.out.println(_b.getText());
        }

}

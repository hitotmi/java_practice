import java.util.Random;

public class Jyanken {
    public String play(String userHand) {
        String[] hands = {"グー", "チョキ", "パー"};
        String computerHand = hands[new Random().nextInt(3)];
        System.out.println("コンピュータの手は " + computerHand + " です");
        
        if (userHand.equals(computerHand)) {
            return "引き分けです";
        }
        
        switch(userHand) {
            case "グー":
                return (computerHand.equals("チョキ")) ? "あなたの勝ちです" : "あなたの負けです";
            case "チョキ":
                return (computerHand.equals("パー")) ? "あなたの勝ちです" : "あなたの負けです";
            case "パー":
                return (computerHand.equals("グー")) ? "あなたの勝ちです" : "あなたの負けです";
            default:
                return "無効な入力です";
        }
    }
}

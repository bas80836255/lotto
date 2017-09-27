//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.entity;

public class Lotto {
    private String jackpot;
    private String threeTop;
    private String threeTod;
    private String threeBotFront;
    private String threeBotBack;
    private String twoTop;
    private String twoBot;
    private String runTop;
    private String runBot;

    public Lotto() {
    }

    public Lotto(String jackpot, String threeTop, String threeTod, String threeBotFront, String threeBotBack, String twoTop, String twoBot, String runTop, String runBot) {
        this.jackpot = jackpot;
        this.threeTop = threeTop;
        this.threeTod = threeTod;
        this.threeBotFront = threeBotFront;
        this.threeBotBack = threeBotBack;
        this.twoTop = twoTop;
        this.twoBot = twoBot;
        this.runTop = runTop;
        this.runBot = runBot;
    }

    public String getJackpot() {
        return this.jackpot;
    }

    public void setJackpot(String jackpot) {
        this.jackpot = jackpot;
    }

    public String getThreeTop() {
        return this.threeTop;
    }

    public void setThreeTop(String threeTop) {
        this.threeTop = threeTop;
    }

    public String getThreeTod() {
        return this.threeTod;
    }

    public void setThreeTod(String threeTod) {
        this.threeTod = threeTod;
    }

    public String getThreeBotBack() {
        return this.threeBotBack;
    }

    public void setThreeBotBack(String threeBotBack) {
        this.threeBotBack = threeBotBack;
    }

    public String getThreeBotFront() {
        return this.threeBotFront;
    }

    public void setThreeBotFront(String threeBotFront) {
        this.threeBotFront = threeBotFront;
    }

    public String getTwoTop() {
        return this.twoTop;
    }

    public void setTwoTop(String twoTop) {
        this.twoTop = twoTop;
    }

    public String getTwoBot() {
        return this.twoBot;
    }

    public void setTwoBot(String twoBot) {
        this.twoBot = twoBot;
    }

    public String getRunTop() {
        return this.runTop;
    }

    public void setRunTop(String runTop) {
        this.runTop = runTop;
    }

    public String getRunBot() {
        return this.runBot;
    }

    public void setRunBot(String runBot) {
        this.runBot = runBot;
    }
}

package ex_28_ENUM;

public enum Colours {
    RED("#FF0000"),
    GREEN("#00FF00"),
    YELLOW("#FFFF00"),
    BLUE("#FFFF00");
    private String hexCode;

    Colours(String hexCode){

        this.hexCode = hexCode;
    }

    String getHexCode(){

        return this.hexCode;
    }
}

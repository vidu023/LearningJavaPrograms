package ex_23_AccessModifiers.Police;

public class Lab189_AccessModifier_Cop {

    public int gun;
    String iCard;

    public Lab189_AccessModifier_Cop(int bullets){
        this.gun = bullets;
    }

    protected void canShoot(){
        System.out.println("Yes you can shoot - You are a COP!");
    }


}


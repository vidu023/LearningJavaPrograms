package ex_22_OOPs_AccessModifiers.Criminal;

import ex_22_OOPs_AccessModifiers.Police.Lab189_AccessModifier_Cop;

public class Lab189_AccessModifier_Thief {
    public static void main(String[] args) {

        // Thief is smart -> created a Cop Object
        Lab189_AccessModifier_Cop thief = new Lab189_AccessModifier_Cop(100);
        //thief.canShoot(); // thief can create because its public
        // now he cannot access its protected
        // Keyword - 'protected' -> access with same package
        // thief is different package
    }

}

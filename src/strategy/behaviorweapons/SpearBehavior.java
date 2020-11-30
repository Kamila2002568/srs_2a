package strategy.behaviorweapons;

public class SpearBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Удар копьем");
    }

}

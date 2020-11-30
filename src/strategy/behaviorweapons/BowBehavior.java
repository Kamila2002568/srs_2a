package strategy.behaviorweapons;

public class BowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Стрельба из лука");
    }
}

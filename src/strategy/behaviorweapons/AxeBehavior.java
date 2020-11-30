package strategy.behaviorweapons;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Сильный удар топором");
    }
}

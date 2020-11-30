package strategy.persons;

import strategy.artifacts.ArtefactBehavior;
import strategy.behaviorweapons.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weapon;
    ArtefactBehavior artefact;

    public Character() {
    }

    public void fight() {
        weapon.useWeapon();
    }

    public void useArtefact() {
        artefact.useArtefact();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void setArtefact(ArtefactBehavior artefact) {
        this.artefact = artefact;
    }


    public abstract void display();
}

package strategy.artifacts;

public class ShieldBehavior implements ArtefactBehavior {

    @Override
    public void useArtefact() {
        System.out.println("Защищает персонажа");
    }
}

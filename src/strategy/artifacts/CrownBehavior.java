package strategy.artifacts;

public class CrownBehavior implements ArtefactBehavior {

    @Override
    public void useArtefact() {
        System.out.println("Дарует боевой дух");
    }

}

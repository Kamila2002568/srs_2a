package strategy.artifacts;

public class SubstanceBehavior implements ArtefactBehavior {

    @Override
    public void useArtefact() {
        System.out.println("Дарует силу");
    }

}

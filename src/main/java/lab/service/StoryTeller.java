package lab.service;

import lab.enums.Colors;
import lab.exceptions.NoSuchActionException;
import lab.subject.*;

public class StoryTeller {
    private Creator creator;

    public StoryTeller(Creator creator) {
        this.creator = creator;
    }

    public StringBuilder tellStory() throws NoSuchActionException {
        Bird bird = (Bird) creator.createBird();
        Flower flower = (Flower) creator.createFlower();
        Ground ground = (Ground) creator.createGround();
        Skuperfield skuperfield = (Skuperfield) creator.createSkuperfield();
        Tree tree = (Tree) creator.createTree();
        Wind wind = (Wind) creator.createWind();

        StringBuilder story = new StringBuilder();
        story.append(skuperfield + " " + skuperfield.doAction("WastingStrength") + " и " + skuperfield.doAction("MakingSure") + " что, "
                + skuperfield.doAction("NotGettingFree") + ", поэтому " + skuperfield.doAction("NotMoving") + ". ");
        story.append("У " + skuperfield + " " + skuperfield.doAction("GoingNumb") + ", " + skuperfield.doAction("DoNotFeeling") + ". ");
        story.append("У " + skuperfield + " " + skuperfield.doAction("PartsDisappearing") + " и " +skuperfield.doAction("PainDisappearing") + ". ");
        story.append(wind).append(" ").append(wind.doAction("Gusting")).append(" и ").append(wind.doAction("Stirring")).append(". ");
        story.append(skuperfield + " " + skuperfield.doAction("Seem") + ", " + tree + " " + tree.doAction("Waving") + " и " + tree.doAction("Speaking") + ". ");
        story.append("На " + ground + " " + Colors.BLUE + " и " + Colors.PINK + " " +flower + " " + flower.doAction("Dazzling") + ". ");
        story.append(skuperfield + " " + skuperfield.doAction("KnowingSubject") + ". ");
        story.append(skuperfield + " " + skuperfield.doAction("LookingAtSubject") + ". ");
        story.append(bird + " " + bird.doAction("FlyingNearSubject") + ". ");
        story.append(bird + " " + bird.doAction("Tweeting") + ". ");
        story.append(bird + " " + bird.doAction("SittingOnSubject", ground) + ", ");// + bird.peckFood(Food.CORNS) + ", " +
           //     bird.sitOnObject(tree) + ". ");
        return story;
    }
}

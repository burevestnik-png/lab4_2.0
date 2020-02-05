package lab.service;

import lab.action.Action;
import lab.action.bird.*;
import lab.action.flower.Dazzling;
import lab.action.skuperfield.*;
import lab.action.tree.Speaking;
import lab.action.tree.Waving;
import lab.action.wind.Gusting;
import lab.action.wind.Stirring;
import lab.enums.PartsOfBody;
import lab.exceptions.NonKnownSubjectException;
import lab.exceptions.NonLookableSubjectException;
import lab.exceptions.NonSeatableSubjectException;
import lab.subject.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Creator {
    private Map<String, Subject> serviceInit = new HashMap<String, Subject>() {
        {
            put("Bird", new Bird());
            put("Flower", new Flower());
            put("Ground", new Ground());
            put("Skuperfield", new Skuperfield());
            put("Tree", new Tree());
            put("Wind", new Wind());
        }
    };

    //TODO: вспомнить дженерики
    private List<Action> birdActions = new ArrayList<Action>() {
        {
            //TODO: какое имя объектной переменной?
            try {
                SittingOnSubject sittingOnTree = (SittingOnSubject) createSittingOnTree();
                SittingOnSubject sittingOnGround = (SittingOnSubject) createSittingOnGround();

                add(new FlyingAway());
                add(new FlyingNearSubject(serviceInit.get("Tree")));
                add(new LookingToSides());
                //add(new PeckingFood());
                add(new ShakingHead());
                add(sittingOnTree);
                add(sittingOnGround);
                add(new StopBeingAfraid());
                //add(new ThinkingNotAlive());
                //add(new TouchingSubject());
                add(new Tweeting());
            } catch (NonSeatableSubjectException e) {
                e.printStackTrace();
            }
        }
    };

    private List<Action> flowerActions = new ArrayList<Action>() {
        {
            add(new Dazzling());
        }
    };

    private List<Action> skuperfieldActions = new ArrayList<Action>() {
        {
            try {
                add(new Crying());
                add(new DoNotFeeling());
                add(new Escaping());
                add(new ExplainingWhy());
                add(new GoingNumb());
                add(new GoingToForest());
                //add(new HearingSubject());
                add(new KnowingSubject(serviceInit.get("Tree")));
                //add(new LookingAtBeing());
                add(new LookingAtSubject(serviceInit.get("Flower")));
                add(new MakingSure());
                add(new Melting());
                add(new NotGettingFree());
                add(new NotMoving());
                add(new PainDisappearing());
                add(new PartsDisappearing(PartsOfBody.TORSO));
                add(new SayingEndOfSpeech());
                add(new SayingInspiringSpeech());
                add(new Seem());
                add(new ThinkingAbout());
                add(new WastingStrength());
            } catch (NonKnownSubjectException | NonLookableSubjectException e) {
                e.printStackTrace();
                System.out.println("Самсынг вронг");
            }
        }
    };

    private List<Action> treeActions = new ArrayList<Action>() {
        {
            add(new Speaking());
            add(new Waving());
        }
    };

    private List<Action> windActions = new ArrayList<Action>() {
        {
            add(new Gusting());
            add(new Stirring());
        }
    };

    public Subject createBird() {
        return new Bird(birdActions);
    }

    public Subject createFlower() {
        return new Flower(flowerActions);
    }

    public Subject createSkuperfield() {
        return new Skuperfield(skuperfieldActions);
    }

    public Subject createTree() {
        return new Tree(treeActions);
    }

    public Subject createWind() {
        return  new Wind(windActions);
    }

    public Subject createGround() {
        return new Ground();
    }

    private Action createSittingOnTree() throws NonSeatableSubjectException {
        return new SittingOnSubject(serviceInit.get("Tree"));
    }

    private Action createSittingOnGround() throws NonSeatableSubjectException {
        return new SittingOnSubject(serviceInit.get("Ground"));
    }
}

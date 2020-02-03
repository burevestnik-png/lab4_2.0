package lab.service;

import lab.subject.*;

public class StoryTeller {
    private Creator creator;

    public StoryTeller(Creator creator) {
        this.creator = creator;
    }

    public StringBuilder tellStory() {
        Bird bird = (Bird) creator.createBird();
        Flower flower = (Flower) creator.createFlower();
        Ground ground = (Ground) creator.createGround();
        Skuperfield skuperfield = (Skuperfield) creator.createSkuperfield();
        Tree tree = (Tree) creator.createTree();
        Wind wind = (Wind) creator.createWind();

        StringBuilder story = new StringBuilder();

        return story;
    }
}

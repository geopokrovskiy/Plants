package com.geopokrovskiy.program;

import com.geopokrovskiy.model.Garden;
import com.geopokrovskiy.model.Plant;

public class MainStory {
    public static void main(String[] args) {
        Plant.Size size1 = new Plant.Size(1.5, 50);
        Plant tree1 = new Plant("Pine", "blue", 1, 200, 2500);
        tree1.setSize(size1);

        Plant.Size size2 = new Plant.Size(1.2, 30);
        Plant tree2 = new Plant("Spruce", "green");
        tree2.setSize(size2);

        Plant.Size size3 = new Plant.Size(1, 15);
        Plant tree3 = new Plant("Birch", "white", 1, 80, 500);
        tree3.setSize(size3);

        Plant.Size size4 = new Plant.Size(3, 20);
        Plant tree4 = new Plant("Oak", "brown", 1, 500, 10000);
        tree4.setSize(size4);

        Plant.Size size5 = new Plant.Size(2, 100);
        Plant tree5 = new Plant("Cedar", "green", 1, 2000, 50000);
        tree5.setSize(size5);

        Plant.Size size6 = new Plant.Size(2, 10);
        Plant tree6 = new Plant("Willow", "black", 5, 100, 2000);
        tree6.setSize(size6);

        Plant.Size size7 = new Plant.Size(0.5, 10);
        Plant tree7 = new Plant("Apple tree", "grey", 1, 80, 2000);
        tree7.setSize(size7);

        Plant.Size size8 = new Plant.Size(20, 20);
        Plant tree8 = new Plant("Baobab", "brown", 1, 5000, 100000);
        tree8.setSize(size8);

        Plant.Size size9 = new Plant.Size(2, 80);
        Plant tree9 = new Plant("Palm", "yellow", 1, 100, 1000);
        tree9.setSize(size9);

        Plant.Size size10 = new Plant.Size(100500, 100500);
        Plant tree10 = new Plant("Teldrassil", "rainbow", 1, Integer.MAX_VALUE, Integer.MAX_VALUE);
        tree10.setSize(size10);


        System.out.println("****************A STORY ABOUT A WILLOW*********************");
        System.out.println("Initially, the garden of Mr.Smith had no trees. It was empty.");
        Garden garden = new Garden(10);
        System.out.println();

        System.out.println("Starting to plant trees in our garden...");
        System.out.println("...");
        garden.add(tree1);
        garden.add(tree2);
        garden.add(tree3);
        garden.add(tree4);
        garden.add(tree5);
        garden.add(tree6);
        garden.add(tree7);
        System.out.println("There are " + garden.count() + " new trees in our garden! Here are all the plants:\n" + garden);
        System.out.println();
        System.out.println("A plant number 4 is a " + garden.get(3).getColor() + " " + garden.get(3).getName() + ". Looks amazing!");
        System.out.println();

        // Removing the plant from the garden.
        System.out.println("After some time, Mr.Smith has decided that a willow is not a good tree for a garden. It was too ugly.\n" +
                "He decided to remove the willow and throw it away from his garden. To do so, he needed to know the dimensions " +
                "of the willow and where it was.");
        System.out.println("Where are you, my little willow? : (Position number " + garden.search(tree6) + ")");
        System.out.println("How big are you, buddy? I'm coming to destroy you!!! : " + garden.delete("Willow").getSize() + ".");
        System.out.println();
        System.out.println("KHRRRZZZZZKHKHKHKHKHKHKHZZZZZZZZWRWRWRASHHHHHHHHHHHHHH!!!!!!!!!");
        System.out.println("Haha, this willow don't ruin my garden anymore!!!");

        System.out.println();
        System.out.println("After having deleted the willow, the new number of trees in the garden was " + garden.count());
        System.out.println();

        Garden garden1 = new Garden(5);
        garden1.add(tree8);
        garden1.add(tree9);
        garden1.add(tree10);

        System.out.println("Meanwhile, there was a secret garden with the most beautiful and glorious tree in our Universe. \n" +
                "The name of that tree was "
        + tree10.getName() + ". It was a Tree of Life giving birth to all creatures in Creation.\nTeldrassil was an immortal tree and its height was taller than a human being could ever" +
                " imagine or create. Here it is: \n" + tree10);
        System.out.println("There were " + garden1.count() + " trees in the secret garden. Here are them: \n" + garden1);

        System.out.println("The poor willow came to the secret garden and started to cry. \n" +
                "It was weeping in front of Teldrassil and asking for a place to stay.");
        System.out.println("\"Let me live with you! I'll be staying in the farthest corner of your secret garden. Just help me out.\"");
        System.out.println("The trees replied: no, my friend. We'll give you the most sunny place for you. You'll be the first among us because you" +
                "'ve suffered from injustice. Come and stay with us, little willow.");

        garden1.insert(0, tree6);
        System.out.println();
        System.out.println("Haha, that's good! We are a friendly tree family now! :\n" + garden1);
        System.out.println("****************END OF STORY*********************");
    }
}
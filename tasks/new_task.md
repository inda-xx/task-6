# 🎮 Simple Java Game Development Task

Welcome to the Simple Java Game Development Task! In this project, you will create a simple game application in Java. The game will include functionalities like player movement, a scoring system, and interactions with enemies. This task is designed to teach you several important programming concepts. Let's dive right into it!

## 📚 Learning Goals
- Understand the Java `Random` object for introducing randomness.
- Master the use of the ternary operator to simplify conditional statements.
- Distinguish between deep and shallow copies, particularly in Java.
- Practice finding and fixing bugs in a codebase.
- Use an Iterator to modify collections safely during iteration.
- (Optional) Use inheritance to avoid code duplication and promote code reuse.

## 📝 Task Structure

### Exercise 1: Understanding Random and Ternary Operator 🌟

**Focus**: Grasp the theoretical aspects of Java's `Random` object and the ternary operator through conceptual questions and explanations.

1. **Explain the `Random` Object**: Explore how the `Random` class is used to generate random integers and doubles. Discuss why randomness might be useful in games and present a brief example.

2. **Ternary Operator Mechanism**: Describe the purpose and syntax of the ternary operator in Java. Provide a comparative example showing a simple if-else condition and how it can be converted into a ternary operation.

### Exercise 2: Deep vs. Shallow Copies 📜

**Focus**: Distinguish between deep and shallow copies using theoretical questions and examples.

1. **Conceptual Difference**: Define deep and shallow copies, with an emphasis on how references and memory are handled differently.

2. **Examples in Game Context**: Discuss a scenario in game development where each type of copy would be applicable and beneficial. Illustrate with diagrams if necessary.

### Exercise 3: Implementing Player Movement 🎮

**Focus**: Apply the learnt concepts by coding a player movement system utilizing the ternary operator and introducing randomness.

1. **Player Class Setup**: Define a `Player` class with attributes such as position (x, y) and score. Initialize these attributes in a constructor.

2. **Move Method**: Implement a `move()` method using a `Random` instance to adjust the player’s position. Use the ternary operator to simplify decisions (e.g., move left or right).

```java
public class Player {
    private int x, y;
    private int score;

    public Player() {
        x = 0;
        y = 0;
        score = 0;
    }

    public void move() {
        Random random = new Random();
        x += random.nextBoolean() ? 1 : -1;
        y += random.nextBoolean() ? 1 : -1;
    }
}
```

### Exercise 4: Scoring System with Copy Functionality 🏆✨

**Focus**: Implement a scoring system and copy functionality, sensitively addressing deep vs. shallow copying.

1. **Score Update Method**: Create a method `updateScore()` that simulates score increments when the player reaches specific positions.

2. **Prototype and Clone**: Write a `clonePlayer()` method that creates a deep copy of a `Player`, differentiating it from a method that returns a shallow copy.

### Exercise 5: Enemy Interactions and Bug Fixing ⚔️🔧

**Focus**: Develop an enemy interaction system and utilize iterators to modify a collection of enemies, finding and fixing any potential bugs.

1. **Enemy Class**: Design an `Enemy` class with movement similar to the player.

2. **Enemy List Management**: Use an `ArrayList<Enemy>` to manage enemies. Implement a method `checkInteractions()` that iterates over the list and influences the player when collisions are detected.

3. **Iterator Usage**: Use an `Iterator` to safely modify the enemy list during iteration (e.g., remove defeated enemies).

### Exercise 6: Advanced Code Organization (Optional) 🏛️

**Focus**: Use inheritance to improve the codebase by reducing duplication.

1. **Entity Base Class**: Refactor the classes `Player` and `Enemy` to inherit from a common `Entity` superclass that includes shared attributes and methods.

2. **Testing and Iteration**: Implement test cases to ensure functionality remains intact post-refactoring.

```java
public class Entity {
    protected int x, y;

    public void move(Random random){
        x += random.nextBoolean() ? 1 : -1;
        y += random.nextBoolean() ? 1 : -1;
    }
}

public class Player extends Entity {
    private int score;
    // Override and extend functionalities if needed
}

public class Enemy extends Entity {
    // Extend functionalities for enemy-specific logic
}
```

## 🧠 Wrapping Up

Upon completing these exercises, students will equip themselves with foundational skills in Java programming, especially within game development contexts. Happy coding! Remember to test thoroughly and debug patiently. Good luck, and have fun developing your first game!
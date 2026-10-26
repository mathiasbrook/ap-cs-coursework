# AP CS Coursework

Java programs I wrote for AP Computer Science and my data structures class (2021-2026). It's organized by topic so it's easy to find things. My bigger projects each have their own repo (Mancala, Tic-Tac-Toe, Mastermind, McRonald queue simulation, AVL tree, Battleship).

## Folders

| Folder | Topics | Files |
|---|---|---|
| `data-structures/` | Linked lists, stacks, queues, my own ArrayList, priority queue (heap), binary search trees, AVL trees, hashing | AVLTree, AVLTest, BST, EasyHashing, HashingProblems, JagArrayList, JagQueue, JagStack, ListLab1, ListLabReverse, ListNode, PQ, SparseArrayEntry, TreeLab, TreeNode |
| `algorithms/` | Merge sort, quick sort, prime sieve, recursion, flood fill, stack algorithms (parentheses matching, postfix evaluation), running median with two heaps | AreaFill, Hailstone, MergeSort_Driver, ParenMatch, PostFix, PrimeNumberSieve, QuickSort_Driver, RecursionActivities, StreamMed |
| `oop/` | Classes and objects, constructors, inheritance, polymorphism, abstract classes | Animal, Bird, NoisyHungryBird, Snake, ZooRunner, Shape, Rectangle, Square, Triangle, Point, Time, Light, Strand, City, CityList, Cereal |
| `oop/karel/` | First OOP labs with Karel robots (extending the `Robot` class) | Athlete, Climber, Lab01, Lab02, Lab03, Lab04 |
| `data-and-files/` | Reading files with `Scanner`, 2D arrays of data, building an index of a text file, Swing quiz games | FileInput, IndexMaker, ReviewAnalysis, Review, States, NorthAmerica, plus `HealthyCities.txt` and `DataText.txt` |
| `practice/` | Arrays, ArrayLists, loops, nested loops, 2D arrays, Strings, and practice/competition style problems | APLine, AlphabetSpam, ArrayActivities, ArrayListActivities, BabylonianNumbers, CardTrick, CompoundWords, DiceCup, DivCheck, ElectionParadox, FunWithStrings, LoopActivities, NestedLoopActivities, OwlAndFox, Peragrams, PokerHand, RandomPractice, SchnallNumber, StringDemo, StringPractice, TwoDActivities, Unit2Practice, Unit2TestProgramming, WordMatch |

## How to run a file

Most files have a `main` method that runs the program or prints test output. Some files use classes from other folders (for example `PostFix` uses my `JagStack` and `IndexMaker` uses my `JagArrayList`), so the easiest way is to compile everything at once from the top folder:

```
javac -d out data-structures/*.java algorithms/*.java oop/*.java data-and-files/*.java practice/*.java
```

Then run a program from its own folder so it can find its input files:

```
cd algorithms
java -cp ../out PostFix
```

Files that only use their own folder can also be compiled on their own, for example `cd practice && javac TwoDActivities.java && java TwoDActivities`.

## Notes
- `oop/Light.java` came from an "AP CS MOOC" starter template (the class description and some comments are from the template). `oop/Strand.java` was built on the same template for the next part of the assignment.
- `oop/karel/` needs the `karel2_c.jar` library from class (package `edu.fcps.karel2`), which isn't included here because it isn't my code. With the jar it compiles with `javac -cp karel2_c.jar *.java`, and running the labs also needs the `maps/` files from class.
- `States` and `NorthAmerica` open a Swing window, so they need a computer with a display.
- `ListNode` and `TreeNode` are the standard AP helper classes we were given in class. They weren't saved with my files, so I re-created them so the list and tree labs compile.
- `algorithms/postfix.txt`, `declaration.txt` (the start of the Declaration of Independence) and `area.txt` are input files for `PostFix`, the two sort drivers and `AreaFill` (enter `area.txt` when it asks for a file).
- `IndexMaker` asks for a text file to index, for example `../algorithms/declaration.txt`. Its `test` mode expects the `fish` test files from class, which aren't included.
- A lot of these were assignments, so some files still have comments from the assignment instructions.

// Name:
// Date:
// This program takes a text file, creates an index (by line numbers)
// for all the words in the file and writes the index
// into the output file.  The program prompts the user for the file names.

import java.util.*;
import java.io.*;

public class IndexMaker {
   public static void main(String[] args) {
      if (args.length > 0 && args[0].equals("test")) {
         runTests();
         return;
      }

      Scanner keyboard = new Scanner(System.in);
      System.out.print("\nEnter input file name: ");
      String inFileName = keyboard.nextLine().trim();
      String outFileName = "fishIndex.txt";

      Scanner inputFile = null;
      PrintWriter outputFile = null;

      try {
         inputFile = new Scanner(new File(inFileName));
         outputFile = new PrintWriter(new FileWriter(outFileName));
         indexDocument(inputFile, outputFile);
         System.out.println("Done. Index written to " + outFileName + ".");
      } catch (FileNotFoundException e) {
         System.out.println("Error: could not find file \"" + inFileName + "\".");
      } catch (IOException e) {
         System.out.println("Error: problem writing to \"" + outFileName + "\".");
      } finally {
         if (inputFile != null)
            inputFile.close();
         if (outputFile != null)
            outputFile.close();
      }
   }

   public static void indexDocument(Scanner inputFile, PrintWriter outputFile) {
      DocumentIndex index = new DocumentIndex();
      int lineNum = 0;
      while (inputFile.hasNextLine()) {
         lineNum++;
         index.addAllWords(inputFile.nextLine(), lineNum);
      }
      for (IndexEntry entry : index)
         outputFile.println(entry);
   }

   private static void runTests() {
      System.out.println("=== Valid file tests ===");
      testIndex("fish.txt",
            "fishIndex.txt",
            "fishIndex_test.txt");
      testIndex("fish2.txt",
            null,
            "fish2Index.txt");
      testIndex("fish3.txt",
            null,
            "fish3Index.txt");

      System.out.println("\n=== Error tests ===");
      testFileNotFound();
      testEmptyInputName();
   }

   private static void testIndex(String inputPath, String expectedPath, String outputPath) {
      Scanner inputFile = null;
      PrintWriter outputFile = null;
      try {
         inputFile = new Scanner(new File(inputPath));
         outputFile = new PrintWriter(new FileWriter(outputPath));
         indexDocument(inputFile, outputFile);
         outputFile.flush();
         System.out.println("Created index: " + outputPath);
      } catch (FileNotFoundException e) {
         System.out.println("FAIL: could not find " + inputPath);
      } catch (IOException e) {
         System.out.println("FAIL: I/O error for " + outputPath);
      } finally {
         if (inputFile != null)
            inputFile.close();
         if (outputFile != null)
            outputFile.close();
      }

      if (expectedPath != null) {
         try {
            if (filesMatch(expectedPath, outputPath))
               System.out.println("PASS: matches expected output.");
            else
               System.out.println("FAIL: output does not match expected.");
         } catch (IOException e) {
            System.out.println("FAIL: could not compare output files.");
         }
      }
   }

   private static boolean filesMatch(String expectedPath, String actualPath) throws IOException {
      Scanner expected = new Scanner(new File(expectedPath));
      Scanner actual = new Scanner(new File(actualPath));
      boolean match = true;
      while (expected.hasNextLine() && actual.hasNextLine()) {
         String expectedLine = expected.nextLine().trim();
         String actualLine = actual.nextLine().trim();
         if (!expectedLine.equals(actualLine))
            match = false;
      }
      if (expected.hasNextLine() || actual.hasNextLine())
         match = false;
      expected.close();
      actual.close();
      return match;
   }

   private static void testFileNotFound() {
      try {
         Scanner inputFile = new Scanner(new File("thisFileDoesNotExist.txt"));
         inputFile.close();
         System.out.println("FAIL: FileNotFoundException was not thrown.");
      } catch (FileNotFoundException e) {
         System.out.println("PASS: FileNotFoundException caught for missing file.");
      }
   }

   private static void testEmptyInputName() {
      Scanner inputFile = null;
      try {
         inputFile = new Scanner(new File(""));
         System.out.println("FAIL: empty file name should cause an error.");
      } catch (FileNotFoundException e) {
         System.out.println("PASS: FileNotFoundException caught for empty file name.");
      } finally {
         if (inputFile != null)
            inputFile.close();
      }
   }
}

class DocumentIndex extends JAGArrayList<IndexEntry> {

   public DocumentIndex() {
      super();
   }

   public void addAllWords(String str, int lineNum) {
      String[] words = str.split("[., \"!?]");
      for (String word : words) {
         if (!word.isEmpty())
            addWord(word.toUpperCase(), lineNum);
      }
   }

   public void addWord(String word, int lineNum) {
      get(foundOrInserted(word)).add(lineNum);
   }

   private int foundOrInserted(String word) {
      for (int i = 0; i < size(); i++) {
         int cmp = word.compareTo(get(i).getWord());
         if (cmp == 0)
            return i;
         if (cmp < 0) {
            add(i, new IndexEntry(word));
            return i;
         }
      }
      add(new IndexEntry(word));
      return size() - 1;
   }
}

class IndexEntry implements Comparable<IndexEntry> {
   private String word;
   private JAGArrayList<Integer> numsList;

   public IndexEntry(String w) {
      word = w;
      numsList = new JAGArrayList<>();
   }

   public void add(int num) {
      if (!numsList.contains(num))
         numsList.add(num);
   }

   public String getWord() {
      return word;
   }

   public String toString() {
      String result = word;
      for (int i = 0; i < numsList.size(); i++)
         result += " " + numsList.get(i) + ",";
      if (result.endsWith(","))
         result = result.substring(0, result.length() - 1);
      return result;
   }

   public int compareTo(IndexEntry other) {
      return word.compareTo(other.getWord());
   }
}

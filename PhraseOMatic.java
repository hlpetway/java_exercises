public class PhraseOMatic {
  public static void main (String[] args) {

    //make three sets of words to chose from. Add your own!
    String[] wordListOne = { "Meaty", "Heavy", "Light-weight", "Slick", "Dasterdly", "Soulfull", "Fool-Proof", "Spindly", "Solid", "Safe", "Mindless"};
    String[] wordListTwo = { "Grooming", "Stack-Rank", "Story-Points","End-to-End", "UX", "Debugged", "Mingle", "Backlog", "Test Coverage"};
    String[] wordListThree = { "Design", "Retrospective", "Omniture Tag", "Abacus ID", "Class", "LRM", "Regression", "Bug", "Sign-Off", "Card", "Spec", "Sprint", "Test Plan", "Tiers"};

    //find out how many words are in each list
    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;

    //generate three random numbers
    int rand1 = (int) (Math.random() * oneLength);
    int rand2 = (int) (Math.random() * twoLength);
    int rand3 = (int) (Math.random() * threeLength);

    //now build a Phrase
    String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

    //print out phrase
    System.out.println("What we need is a " + phrase);
  }
}

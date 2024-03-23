import java.util.concurrent.ThreadLocalRandom;

public class HiringProcess {

  public static void main(String[] args) {
    System.out.println("Starting the hiring process");
    System.out.println("Good luck!");
    selectCandidates();

  }

  static void selectCandidates() {
    String[] candidates = { "John", "Mary", "Joseph", "Anna", "Charles", "Mariana", "Peter", "Paula", "Lucas",
        "Luana" };

    int selectedCandidates = 0;
    int currentCandidate = 0;
    double baseSalary = 2000.0;

    while (selectedCandidates < 5) {
      String candidate = candidates[currentCandidate];
      double desiredSalary = desiredValue();
      System.out.println("Candidate: " + candidate + " - Desired salary: " + desiredSalary);
      if (baseSalary >= desiredSalary) {
        System.out.println("Candidate " + candidate + " has been selected");
        selectedCandidates++;

      }
      currentCandidate++;
    }
  }

  static double desiredValue() {
    return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
  }

  static void analyzeCandidate(double desiredSalary) {
    double baseSalary = 2000.0;
    if (baseSalary > desiredSalary) {
      System.out.println("CALL THE CANDIDATE");
    } else if (baseSalary == desiredSalary) {
      System.out.println("CALL THE CANDIDATE AND MAKE A COUNTER OFFER");
    } else {
      System.out.println("WAIT FOR OTHER CANDIDATES");
    }
  }
}

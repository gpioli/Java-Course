import java.util.Scanner;

public class S12_013_ArrayStudentsGrades {
    public static void main(String[] args) {

        double[] mathClass, historyClass, languageClass;
        double sumMathGrades = 0, sumHistoryGrades = 0, sumLanguageGrades = 0;

        mathClass = new double[7];
        historyClass = new double[7];
        languageClass = new double[7];

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter grades of the 7 studens of math class: ");
        for (int i = 0; i < mathClass.length; i++) {
            mathClass[i] = s.nextDouble();
        }

        System.out.println("Please enter grades of the 7 studens of history class: ");
        for (int i = 0; i < historyClass.length; i++) {
            historyClass[i] = s.nextDouble();
        }

        System.out.println("Please enter grades of the 7 studens of language class: ");
        for (int i = 0; i < languageClass.length; i++) {
            languageClass[i] = s.nextDouble();
        }

        for (int i = 0; i < 7; i++){
            sumMathGrades += mathClass[i];
            sumHistoryGrades += historyClass[i];
            sumLanguageGrades += languageClass[i];
        }

        double mathClassMean = (sumMathGrades / mathClass.length);
        double historyClassMean = (sumHistoryGrades / historyClass.length);
        double languageClassmean = (sumLanguageGrades / languageClass.length);

        System.out.println("Mean of math class grades = " + mathClassMean);
        System.out.println("Mean of history class grades = " + historyClassMean);
        System.out.println("Mean of language class grades = " + languageClassmean);
        System.out.println("Mean of the whole course grades = " + (mathClassMean + historyClassMean +
                languageClassmean)/3);

        System.out.println("Please, enter studen id: ");
        int id = s.nextInt();
        double studentMean = (mathClass[id] + historyClass[id] + languageClass[id])/3;

        System.out.println("Mean of the student id: " + id + ": " + studentMean);


    }
}

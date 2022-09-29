package Prob3;

public abstract class Evaluation {
    private final int numberOfQuestions;

    Evaluation(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    abstract void evaluationTiming();
    void printNoOfQuestions() {
        System.out.println("No. of Questions in Evaluation is :" +numberOfQuestions);
    }

}

class CodingEvaluation extends Evaluation {
    CodingEvaluation(int numberOfQuestions) {
        super(numberOfQuestions);
    }



    @Override
    void evaluationTiming(){
         System.out.println("Evaluation timing is 2:00 to 3:30");
     }
}

class DsaEvaluation extends Evaluation {
    protected DsaEvaluation(int numberOfQuestions) {
        super(numberOfQuestions);
    }

    @Override
    void evaluationTiming(){
        System.out.println("Evaluation timing is 9:30 to 11:00");
    }
}

class Main{
    static void messageToStudents(Evaluation evaluation){
        if(evaluation.equals(new DsaEvaluation())){
//            Evaluation evaluation = new DsaEvaluation( numberOfQuestions);
            System.out.println("Its a DSA Evaluation.");
            evaluation.printNoOfQuestions();
            evaluation.evaluationTiming();
        }else if(evaluation.equals(new CodingEvaluation())){
//            Evaluation evaluation = new CodingEvaluation(numberOfQuestions);
            System.out.println("Its a Coding Evaluation.");
            evaluation.printNoOfQuestions();
            evaluation.evaluationTiming();
        }
    }
    public static void main(String[] args) {
        messageToStudents(new DsaEvaluation(5));
        messageToStudents(new CodingEvaluation(4));
    }


}
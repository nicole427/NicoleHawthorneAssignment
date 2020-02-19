public class Calculation {
    public static void main(String[] args){
        CalculationBackEnd[] executions = new CalculationBackEnd[4];

        executions[0] = create(100,200,'a');
        executions[1] = create(200,100,'s');
        executions[2] = create(300,26,'d');
        executions[3] = create(100,200,'n');

        for (CalculationBackEnd execution : executions){
            execution.execute();
            System.out.println("Result is = " + execution.getResults());
        }

    }

    public static CalculationBackEnd create(double leftVal, double rightVal, char codes ){
        CalculationBackEnd execution = new CalculationBackEnd();
        execution.setLeftVal(leftVal);
        execution.setRightVal(rightVal);
        execution.setCodes(codes);
        execution.loggingValues(leftVal,rightVal,codes,execution.getResults());
        return execution;
    }
}

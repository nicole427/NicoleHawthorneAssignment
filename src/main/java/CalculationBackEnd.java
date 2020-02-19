public class CalculationBackEnd {

    private double leftVal;
    private double rightVal;
    private char codes;
    private double results;
    private String log;
    //implementing accessor and mutator
    public double getLeftVal(){
        return leftVal ;
    }
    public void setLeftVal(double leftVal){
        this.leftVal = leftVal;
    }
    public double getRightVal(){
        return rightVal ;
    }
    public void  setRightVal(double rightVal){
        this.rightVal = rightVal ;
    }
    public char getCodes() {
        return codes;
    }
    public void setCodes(char codes) {
        this.codes = codes;
    }
    public double getResults(){
        return results ;
    }
    public void setResults(double results){
        this.results = results;
    }

    //Creates a log string to save all values used
    public void loggingValues (double leftVal, double rightVale, char code, double result){
        log = leftVal +" "+code+" "+rightVale+" ="+ result;

    }

    public void execute(){
        switch (codes){
            case 'a': results = leftVal + rightVal;
                break;

            case 's': results = leftVal - rightVal;
                break;

            case 'd': results = leftVal/rightVal;
                break;

            case 'n': results = leftVal * rightVal;
                break;

            default:
                System.out.println("Invalid code, try a valid one...");
        }

    }
}

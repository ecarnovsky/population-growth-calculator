public class GrowthModel {
    private double initialPopulation;
    private double rateOfGrowth;
    private double currentNumberOfYears;

    public GrowthModel (double initialPopulation, double finalPopulation, double years){

        this.initialPopulation = initialPopulation;

        currentNumberOfYears = years;

        rateOfGrowth = Math.log(finalPopulation / initialPopulation) / years;

    }

    public double findFuturePopulation(double yearsInTheFuture){
        return initialPopulation * Math.pow(Math.E, (rateOfGrowth * (yearsInTheFuture + currentNumberOfYears)));
    }


    public double findYearsIntoTheFuture(double futurePopulation){
        return (Math.log(futurePopulation / initialPopulation) / rateOfGrowth) - currentNumberOfYears;
    }


    public double getRateOfGrowth(){
        return rateOfGrowth;
    }
}

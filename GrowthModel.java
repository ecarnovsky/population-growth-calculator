public class GrowthModel {
    private double initialPopulation;
    private double rateOfGrowth;
    private double currentNumberOfYears;

    public GrowthModel (double initialPopulation, double finialPopulation, double years){

        this.initialPopulation = initialPopulation;

        currentNumberOfYears = years;

        rateOfGrowth = Math.log(finialPopulation / initialPopulation) / years;

    }

    public double findFuturePopulation(double yearsInTheFuture){
        return initialPopulation * Math.pow(Math.E, (rateOfGrowth * (yearsInTheFuture + currentNumberOfYears)));
    }


    public double getRateOfGrowth(){
        return rateOfGrowth;
    }
}

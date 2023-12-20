public class GrowthModel {
    private double initialPopulation;
    private double rateOfGrowth;

    public GrowthModel (double initialPopulation, double finialPopulation, double years){

        this.initialPopulation = initialPopulation;

        rateOfGrowth = Math.log(finialPopulation / initialPopulation) / years;

    }


    public double getRateOfGrowth(){
        return rateOfGrowth;
    }
}

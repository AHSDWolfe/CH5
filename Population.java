public class Population {
    //Initialize private variables
    private int population;
    private double percentIncrease;
    private int days;
    
    //Set population, percent increase, and days
    public void setPopulation(int p){
        population = p;
    }
    
    public void setPercentIncrease(double i){
        percentIncrease = i;
    }
    
    public void setDays(int d){
        days = d;
    }
    
    //Return population, percent increase, and days
    public int getPopulation(){
        return population;
    }
    
    public double getPercentIncrease(){
        return percentIncrease;
    }
    
    public int getDays(){
        return days;
    }
    
    //Determine predicted population
    public double populationPrediction(){
        double popInc;
        int popTotal, popTotal2;
        double perInc;
        
        perInc = (percentIncrease * 0.01);
        popInc = population;
        popTotal = population;
        
        for(int i = 1; i <= days; i++){
            popInc = popInc * perInc;
            popTotal += popInc;
            System.out.println("Day " + i + ": " + popTotal);
        }
        return popTotal;
    }
}

public abstract class Vehicule{
    private String brand;
    private int kilometers;

    public Vehicule(String brand){
        this.brand=brand;
        this.kilometers=0;
    }
    
    public Vehicule(String brand,int kilometers){
        this.brand=brand;
        this.kilometers=kilometers;
    }


    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    public int getKilometers(){
        return this.kilometers;
    }

    public void setkilometers(int kilometers){
        this.kilometers=kilometers;
    }

    public abstract String doStuff();


}
public class funcionarios {


    float remuneracaoAt;
    String cargoAt;




    public funcionarios ( float r,String c){
        this.cargoAt = c;
        this.remuneracaoAt = r;
    }
    public funcionarios(){

    }
    public void setCargo(String car){
        this.cargoAt = car;
    }
    public void setRenumeracao(float rem){
        this.remuneracaoAt = rem;
    }
    public String getCargoAt(){
        return cargoAt;
    }
    public float getCargo(){
        return remuneracaoAt;
    }
}

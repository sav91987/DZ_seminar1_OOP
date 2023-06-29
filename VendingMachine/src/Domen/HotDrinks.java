package Domen;

public class HotDrinks extends Bottle{

    private int tempCel;

    public float getHotDrinkTemp() {
        return tempCel;
    }

    public void setHotDrinkTemp(int tempCel) {
        this.tempCel = tempCel;
    }

    public HotDrinks (int price, int place, String name, long id, float bottleVolume, int tempCel){
        super(price,place,name,id,bottleVolume);
        this.tempCel = tempCel;
    }

    @Override
    public String toString() {
        return super.toString() + "\ntemperature=" + tempCel;
    }
}

package homework_3.clothes_interface;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Atelier {
    private ArrayList<Clothes> clothes;

    public Atelier() {
        this.clothes = new ArrayList<>();
    }

    public void addClothes(Clothes item) {
        this.clothes.add(item);
    }

    public ArrayList<MansСlothes> getManClothes() {
        ArrayList<MansСlothes> menArray = new ArrayList<>();

        for (Clothes clothe : this.clothes) {
            if (clothe instanceof MansСlothes) {
                MansСlothes mClothes = (MansСlothes) clothe;
                mClothes.dressMan();
                menArray.add(mClothes);
            }
        }
        return menArray;
    }

    public ArrayList<WomansСlothes> getWomanClothes() {
        ArrayList<WomansСlothes> womanArrayList = new ArrayList<>();
        for (Clothes clothe : this.clothes) {
            if (clothe instanceof WomansСlothes) {
                WomansСlothes wClothes = (WomansСlothes) clothe;
                wClothes.dressWoman();
                womanArrayList.add(wClothes);
            }
        }
        return womanArrayList;
    }

}

package fr.algorithmie;

public class RechercheMin {
    public static void main(String[] args){
        int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
        int nombreMin = 100;
        for(int i=0; i< array.length;i++){
            if(nombreMin > array[i]){
                nombreMin = array[i];
            }
        }
        System.out.println("Nombre maximum du tableau : " + nombreMin);
    }
}

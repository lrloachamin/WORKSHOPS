
package projectsolf;

public class Store {
    private String storeName;
    private String Location;

    public Store(String storeName, String Location) {
        this.storeName = storeName;
        this.Location = Location;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    
    
   public void showStoreData(){
        System.out.println(" nombre de la tienda es: "+storeName);
        System.out.println(" la ubicacion de la tienda es: "+Location);
          
}
}

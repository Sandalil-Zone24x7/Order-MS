public class InstoreOrder implements OrderType{

    private String storeName;
    public InstoreOrder(String storeName){
        this.storeName = storeName;
    }
    public String toString(){
        return "Instore order, purchased from "+ storeName;
    }
    public String getStoreName(){
        return storeName;
    }
}

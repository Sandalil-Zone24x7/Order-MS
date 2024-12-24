public class OnlineOrder implements OrderType {
    public String address;

    public OnlineOrder(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }
    public String toString(){
        return "Online order";
    }

}

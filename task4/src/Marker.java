/**
 * @author Administrator
 * 超市类
 */
public class Marker {
    private String name;
    private  Product[] products;
    void setName(String name1){name=name1;}
    String getName(){return name;}
    void setProducts(Product[] p){
        products=p;
    }

     Product[] getProducts() {
        return products;
    }
    Product sell(Product p){
        for(int i=0;i<products.length;i++){
            if(products[i].getName()==p.getName()){
                return  products[i];
            }
        }
        return  null;
    }

}

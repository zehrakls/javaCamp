package secondLessonWork.classesWithAttribute;

/**
 *
 * @author zehra.keles
 */
public class Main {
    public static void main(String[] args) {
        Product product= new Product(1,"Laptop" ,"Asus",20000,2, "Red");

//        product.setName("Laptop");
//        product.setId(1);
//        product.setDescription("Asus");
//        product.setPrice(20000);
//        product.setStockAmount(3);


        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getCode());


    }
}

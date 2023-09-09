public class GroceryStore
{
    // Array of Products
    private Product[] products = new Product[20];
    
    public GroceryStore ()
    {
        setupProducts();
        Product foundProduct = findProduct(123);
        if(foundProduct != null)
        {
            System.out.println("Product found Before change: " 
                + foundProduct.toString());
            foundProduct.setPrice(52.99);
            System.out.println("After change: " 
                + foundProduct.toString());
        }
        else
        {
            System.out.println("Product not found");
        }

    }

    private void setupProducts()
    {
        products[0] = new Product(100, 1000);
        products[2] = new Product(123, 2000);
    }

    private Product findProduct (int code)
    {
        for(int i=0; i < products.length; i++)    
        {
            if(products[i] != null && products[i].getBarCode() == code)
            {
                return products[i];
            }
        }
        return null;
    }
}
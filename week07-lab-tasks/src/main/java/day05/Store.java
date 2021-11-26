package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> soldProducts= new ArrayList<>();
    
    public void addProduct(Product p){
        if(p.getDate().isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Invalid sell date");
        }
        soldProducts.add(p);
    }
    
    public void createFile(Month month) throws IOException {
        StringBuilder builder=new StringBuilder();
        List<String> lines=new ArrayList<>();
        for (Product p :
                soldProducts) {
            builder.append(p.getDate());
            builder.append(";");
            builder.append(p.getName());
            builder.append(";");
            builder.append(p.getPrice());
            lines.add(builder.toString());
            builder.delete(0,builder.length()-1);
        }
        Files.write(Paths.get(("src/main/resources/"+month+".csv")),lines);
    }

    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Product("alma",LocalDate.of(2021,Month.NOVEMBER,25),3000));
        store.addProduct(new Product("banán",LocalDate.of(2021,Month.NOVEMBER,22),2000));
        store.addProduct(new Product("kalap",LocalDate.of(2021,Month.NOVEMBER,23),4000));
        store.addProduct(new Product("margarin",LocalDate.of(2021,Month.NOVEMBER,24),6000));
        try{
        store.createFile(Month.NOVEMBER);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}

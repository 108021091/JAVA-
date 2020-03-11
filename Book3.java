public class Book3 {
    private String name, page, ISBN, Price, Publishing house ;


    public Book3() {
    }


    public void Book() {
        System.out.println("Book object has created");


    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setpage(String newpage) {

        this.page = newpage;
    }

    public Object getpage() {
        return this.page;
    }


    public void setISBN(String newISBN) {
        this.ISBN = newISBN;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setPrice(String newPrice) {
        this.Price = newPrice;
    }

    public String getPrice() {
        return this.Price;
    }

    public void setPublishing house(String newPublishing house) {
        this.Publishing house = newPublishing house;
    }

    public String getPublishing house() {
        return  this.Publishing house;
    }
    public void openbook(){

    }
    public void closebook(){

    }
    public void attackbook(){

    }
    public void showInfo(){
        System.out.println("Book Name:"+this.name+","+"page Name: "+this.page+","+"ISBN Code:"+this.ISBN+","+"Price:"+this.Price+","+"Publishing house:"+this.Publishing house );
    }
}

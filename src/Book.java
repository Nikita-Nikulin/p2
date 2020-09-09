public class Book {

    String name;
    String autor;
    int pages;

    public String toString() {
        String s = '\n'+"Book name - " + name + '\n' + "Autor - " + autor + '\n' + "Pages - " + pages;
        return s;
    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    public int getPages() {
        return pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
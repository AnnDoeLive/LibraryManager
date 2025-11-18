package library.example;
import library.dao.BookDAO;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            BookDAO dao = new BookDAO();
            System.out.println(dao.getAll());
    }
}

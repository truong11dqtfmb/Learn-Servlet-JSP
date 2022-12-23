package testservletjsp;

public class MainTestDAO {

    public static void main(String[] args) {
        ServletJspDAO pDAO = new ServletJspDAO();

        pDAO.getAll().forEach(System.out::println);
    }
}

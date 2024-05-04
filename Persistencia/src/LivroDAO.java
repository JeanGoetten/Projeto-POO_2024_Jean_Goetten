import java.io.*;
import java.util.ArrayList;

// Persistência
class LivroDAO {
    private static final String FILENAME = "BIBLIOTECA.DAT";

    public static void salvar(ArrayList<Livro> livros) {
        try {
            FileOutputStream fos = new FileOutputStream(FILENAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(livros);
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static ArrayList<Livro> carregar() {
        ArrayList<Livro> livros = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(FILENAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            livros = (ArrayList<Livro>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
        return livros;
    }
}

package persistence;

import java.util.ArrayList;

public interface ArticoloDao {

    public Articolo getArticleById(String chiave);
    public ArrayList<Articolo> getAllArticles();
    public void insert(Articolo articolo);
    public void update(Articolo articolo);
    public void delete(String chiave);

}
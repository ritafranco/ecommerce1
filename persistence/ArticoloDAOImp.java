package persistence;

public class ArticoloDaoImp implements ArticoloDAO{


    public Articolo getArticleById(String chiave) {
        Connection dbConnection = DbConnection.getInstance().getConnection();
        Statement statement = dbConnection.createStatement();
        statement.execute("SELECT * FROM Articolo WHERE id = ?");

        ResultSet result = statement.getResultSet();
    }
    public ArrayList<Articolo> getAllArticles();
    public void insert(Articolo articolo);
    public void update(Articolo articolo);
    public void delete(String chiave);

}
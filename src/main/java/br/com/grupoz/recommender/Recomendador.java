package br.com.grupoz.recommender;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;

import java.io.File;
import java.io.IOException;

public class Recomendador {

    private DataModel getModelo(final String path) throws IOException {
        final File file = new File("src/main/resources/" + path);
        return new FileDataModel(file);
    }

    public DataModel getModeloDeFilmes() throws IOException {
        return getModelo("filmes.csv");
    }

    public DataModel getModeloDeLivros() throws IOException {
        return getModelo("livros.csv");
    }
}
package br.com.grupoz.recommender;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

import java.io.IOException;
import java.util.List;

public class RecomendadorDeFilmes {

    public static void main(String args[]) throws IOException, TasteException {
        DataModel filmesModel = new Recomendador().getModeloDeFilmes();
        Recommender recommender = new RecomendadorBuilder().buildRecommender(filmesModel);
        
        List<RecommendedItem> recommendations = recommender.recommend(4, 3);
        recommendations.forEach(r -> System.out.println("Você pode gostar deste filme: " + r));
    }

}
package br.com.grupoz.recommender;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

import java.io.IOException;
import java.util.List;

public class RecomendadorDeLivros {

    public static void main(String args[]) throws IOException, TasteException {
        DataModel livrosModel = new Recomendador().getModeloDeLivros();
        Recommender recommender = new RecomendadorBuilder().buildRecommender(livrosModel);

        List<RecommendedItem> recommendations = recommender.recommend(1, 4);
        recommendations.forEach(r1 -> System.out.println("Usuário 1, estes livro combina com você: " + r1));

        List<RecommendedItem> recommendations2 = recommender.recommend(2, 4);
        recommendations2.forEach(r2 -> System.out.println("Usuário 2, estes livro combina com você: " + r2));
    }

}
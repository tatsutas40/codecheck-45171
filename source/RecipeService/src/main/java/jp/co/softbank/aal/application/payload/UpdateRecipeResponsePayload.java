package jp.co.softbank.aal.application.payload;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Arrays;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 指定されたレシピを更新するエンドポイントのレスポンスメッセージを表現するクラスです。
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateRecipeResponsePayload {
    
    private String message;
    private List<RecipePayload> recipe;
    
    /**
     * 指定された引数を使用して {@link UpdateRecipeResponsePayload} のインスタンスを構築します。
     * 
     * @param message メッセージ
     * @param recipePayload レシピを表現する JSON のペイロード
     */
    public UpdateRecipeResponsePayload(String message, RecipePayload recipePayload) {
        this.message = message;
        recipe = Arrays.asList(recipePayload);
    }
}

package jp.co.softbank.aal.common;

/**
 * レシピ REST API サービスで共通で使用されるメッセージ定数。
 */
public final class Messages {
    
    /** 指定された ID に対応するレシピの取得に成功した場合のメッセージ。 */
    public static final String GET_RECIPE_OK = "Recipe details by id";
    
    /** 指定された ID に対応するレシピが存在しなかった場合のメッセージ。 */
    public static final String RECIPE_NOT_FOUND = "No Recipe found";
    
    /** レシピの作成が成功した場合のメッセージ。 */
    public static final String CREATE_RECIPE_OK = "Recipe successfully created!";
    
    /** レシピの作成が失敗した場合のメッセージ。 */
    public static final String CREATE_RECIPE_NG = "Recipe creation failed!";
    
    private Messages() {
        
    }
    
}

package constants;

/**
 * 各出力メッセージを定義するEnumクラス
 *
 */

public enum MessageConst {

    //DB更新
    I_REGISTERED("登録が完了しました。"),
    I_UPDATED("更新が完了しました。"),
    I_DELETED("削除しました。"),

    //バリデーション
    E_NONAME("アイテム名を入力して下さい。"),
    E_NOPICTURE("写真を登録して下さい。"),
    E_NOMATERIAL_NAME("素材を選択して下さい。"),
    E_NOPERCENTAGE("素材の割合を入力して下さい。");

    /**
     * 文字列
     */
    private final String text;

    /**
     * コンストラクタ
     */
    private MessageConst(final String text) {
        this.text=text;
    }

    /**
     * 値（文字列）取得
     */
    public String getMessage() {
        return this.text;
    }

}

package constants;

/**
 * リクエストパラメーターの変数名、変数値、jspファイルの名前等画面遷移に関わる値を定義するEnumクラス
 *
 */

public enum ForwardConst {

    //action
    ACT("action"),
    ACT_TOP("Top"),
    ACT_ITE_MAT("Item_material"),
    ACT_AUTH("Auth"),

    //command
    CMD("command"),
    CMD_NONE(""),
    CMD_INDEX("index"),
    CMD_SHOW("show"),
    CMD_NEW("entryNew"),
    CMD_CREATE("create"),
    CMD_EDIT("edit"),
    CMD_UPDATE("update"),
    CMD_DESTROY("destroy"),

    //jsp
    FW_ERR_UNKNOWN("error/unknown"),
    FW_INDEX("index"),
    FW_SHOW("show"),
    FW_NEW("new"),
    FW_EDIT("edit");

    /*
     * 文字列
     */
    private final String text;

    /*
     * コンストラクタ
     */
    private ForwardConst(final String text) {
        this.text=text;
    }

    /**
     * 値（文字列）取得
     */
    public String getVAlue() {
        return this.text;
    }

}

